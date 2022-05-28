FROM eclipse-temurin:17.0.3_7-jdk-jammy
COPY build/libs/notable-project-*-all.jar notable-project.jar
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "notable-project.jar"]