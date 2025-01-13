# Базовый образ с OpenJDK 21
FROM openjdk:21-jdk-slim

# Установка рабочей директории
WORKDIR /app

# Копируем JAR-файл с правильным именем
COPY target/dok-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт 8080 для приложения
EXPOSE 8080

# Устанавливаем точку входа для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
