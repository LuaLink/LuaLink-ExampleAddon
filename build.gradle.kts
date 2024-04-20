plugins {
    id("java")
}

group = "xyz.galaxyy.lualink.addons.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.purpurmc.org/snapshots")
    maven("https://codeberg.org/api/packages/LuaLink/maven")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.purpurmc.purpur:purpur-api:1.19.4-R0.1-SNAPSHOT")
    compileOnly("xyz.galaxyy.lualink:lualink:1.20.4-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}
