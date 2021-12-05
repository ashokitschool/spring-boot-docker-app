# spring-boot-docker-app 

##1) Clone this Repository using git client

##2) Build docker image using => 
   ```bashdocker build -t spring-boot-rest-api .```
   
##3) Run docker image using => 
   ```docker run -p 9090:9090 spring-boot-rest-api```
   
##4) Once application started you can access with url => 
    ```http://localhost:9090/welcome/{name}```
