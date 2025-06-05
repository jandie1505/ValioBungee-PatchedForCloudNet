plugins {
    `java-library`
}

dependencies {
    implementation(project(":RedisBungee-API"))
    implementation(libs.acf.core)
}

description = "RedisBungee common commands"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(24))
    }
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(24)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}
