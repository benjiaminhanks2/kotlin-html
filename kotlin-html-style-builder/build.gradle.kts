import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    `maven-publish`
}

publishing.configureBintray()

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    js()
    macosX64()
    linuxX64()

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":kotlin-html-writer"))
                implementation(Libs.kotlin.stdlib.common)
            }
        }

        val commonTest by getting {
            dependencies {
                for (lib in Libs.kotlin.test.common) {
                    implementation(lib)
                }
            }
        }

        val genTest by creating {
            dependsOn(commonMain)

            dependencies {
                for (lib in Libs.kotlin.test.common) {
                    implementation(lib)
                }
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Libs.kotlin.stdlib.jvm)
            }
        }

        val jvmTest by getting {
            dependsOn(jvmMain)
            dependsOn(genTest)

            dependencies {
                implementation(Libs.kotlin.test.jvm)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(Libs.kotlin.stdlib.js)
            }
        }

        val jsTest by getting {
            dependsOn(jsMain)
            dependsOn(genTest)

            dependencies {
                implementation(Libs.kotlin.test.js)
            }
        }

        val macosX64Main by getting {
        }

        val macosX64Test by getting {
            dependsOn(macosX64Main)
        }

        val linuxX64Main by getting {
        }

        val linuxX64Test by getting {
            dependsOn(linuxX64Main)
        }
    }
    sourceSets {
        all {
            languageSettings.enableLanguageFeature("InlineClasses")
        }
    }
}

kotlin.sourceSets.map {
    it.apply {
        languageSettings.apply {
            useExperimentalAnnotation("kotlin.time.ExperimentalTime")
        }
    }
}