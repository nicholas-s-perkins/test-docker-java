Repo for testing docker-java against jdks.

using adoptopenjdk11: https://adoptopenjdk.net/archive.html?variant=openjdk11&jvmVariant=hotspot
1. Be on macOS Mojave
1. Import gradle project. 
1. Install `jdk-11.0.3+7`
1. Run `Main.java` against it
    1. Runs Successfully
1. Install `jdk-11.0.4+11.2`
1. Run `Main.java` against new jdk
    1. Dies :/
