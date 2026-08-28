FROM eclipse-temurin:24-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 1001

CMD ["sh", "-c", "java -jar target/*.jar"]