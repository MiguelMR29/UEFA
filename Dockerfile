# Fase 1: Compilación usando Maven y OpenJDK 21
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copiar el archivo de configuración de Maven y el código fuente
COPY pom.xml .
COPY src ./src

# Compilar el proyecto y generar el JAR
RUN ./mvnw clean package -DskipTests

# Fase 2: Ejecución
FROM eclipse-temurin:21-jre  
WORKDIR /app

# Copiar el JAR desde la fase de construcción
COPY --from=build /app/target/UEFA-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que utiliza la aplicación
EXPOSE 8090

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]


