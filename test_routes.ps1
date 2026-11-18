Write-Host "========================================================" -ForegroundColor Cyan
Write-Host " Testing Spring Boot & Swagger UI on Port 8085" -ForegroundColor Cyan
Write-Host "========================================================" -ForegroundColor Cyan

Write-Host "`n1. Testing GET /get" -ForegroundColor Yellow
curl.exe -s http://localhost:8085/get
Write-Host ""

Write-Host "`n2. Testing POST /post" -ForegroundColor Yellow
curl.exe -s -X POST http://localhost:8085/post -d "sample body"
Write-Host ""

Write-Host "`n3. Testing PUT /update" -ForegroundColor Yellow
curl.exe -s -X PUT http://localhost:8085/update -d "update payload"
Write-Host ""

Write-Host "`n4. Testing DELETE /delete" -ForegroundColor Yellow
curl.exe -s -X DELETE http://localhost:8085/delete
Write-Host ""

Write-Host "`n5. Testing Swagger UI endpoint status" -ForegroundColor Yellow
curl.exe -I -s http://localhost:8085/swagger-ui/index.html | Select-String "HTTP"

Write-Host "`nSwagger URL: http://localhost:8085/swagger-ui/index.html" -ForegroundColor Green
Write-Host "OpenAPI JSON: http://localhost:8085/v3/api-docs" -ForegroundColor Green
