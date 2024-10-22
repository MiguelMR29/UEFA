# Usamos la imagen oficial de OpenJDK para Java 21 en Debian
FROM eclipse-temurin:21-jdk

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR generado por el build de Maven/Gradle en la carpeta target
# Cambia "UEFA-1.0.0.jar" por el nombre correcto de tu archivo JAR
COPY target/*UEFA-0.0.1-SNAPSHOT.jar.jar app.jar

# Exponemos el puerto en el que se ejecutará la aplicación Spring Boot
EXPOSE 8090

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]

