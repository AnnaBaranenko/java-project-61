plugins {
    id("java")
    id ("com.github.ben-manes.versions") version "0.42.0"
    id("org.sonarqube") version "6.2.0.5505"
    application
    checkstyle
}
sonar {
    properties {
        property("sonar.projectKey", "AnnaBaranenko_java-project-61")
        property("sonar.organization", "annabaranenko")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
application {
    //mainClass.set ("hexlet.code.App")
    mainClass = "hexlet.code.App"
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
     standardInput = System.`in`


}
