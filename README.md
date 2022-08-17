  
# Simple Spring Boot with Docker Application#


Build the image using the following command

```bash
$ docker build -t spring-boot-rest-api .
```
Run the Docker container using the command shown below.

```bash
$ docker run -p 8080:8080 spring-boot-rest-api
```

The application will be accessible at http://localhost:9090/welcome/Ashok/

