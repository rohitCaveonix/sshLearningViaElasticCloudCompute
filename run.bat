@echo off
echo ========================================================
echo Starting Spring Boot with Swagger UI on Port 8085...
echo Swagger UI URL: http://localhost:8085/swagger-ui/index.html
echo OpenAPI JSON:   http://localhost:8085/v3/api-docs
echo ========================================================
java -jar target\sshLearningViaElasticCloudCompute-0.0.1-SNAPSHOT.jar
pause
