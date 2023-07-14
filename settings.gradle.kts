pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("https://gitlab.com/api/v4/projects/30687088/packages/maven")
            credentials(HttpHeaderCredentials::class) {
                name = "Deploy-Token"
                value = "9KHq1shb9fWsDEeBtsH4"
            }
            authentication {
                val header by registering(HttpHeaderAuthentication::class)
            }
        }
    }
}

rootProject.name = "A-Mates Demo"
include(":app")
