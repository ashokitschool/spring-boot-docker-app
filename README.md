# spring-boot-docker-app 

##1) Clone this Repository using git client

##2) Build docker image with below command
   ```bashdocker build -t spring-boot-rest-api .```bash
   
3) Run docker image with below command
   docker run -p 9090:9090 spring-boot-rest-api
   
4) Once application started you can access with below url

    http://localhost:9090/welcome/{name}
