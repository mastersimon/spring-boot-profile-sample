# Spring profiles
With Spring you are able to set profile specific values in different ways.
In this example, you will see how to use different values 
- via application-{profile}.properties file
- Java configuration with @Profile annotation

## Start default (port 8080)
```bash mvn spring-boot:run```
```bash curl -X "GET" "http://localhost:8080/environment"```
```bash curl -X "GET" "http://localhost:8080/portInformation"```

### Spring logs
```bash 2016-03-23 22:14:46.038  INFO 4517 --- [           main] de.itblogging.SpringProfilesApplication  : No active profile set, falling back to default profiles: default```

## Start test (port 8088)
```bash mvn spring-boot:run -Dspring.profiles.active=test```
```bash curl -X "GET" "http://localhost:8088/environment"```
```bash curl -X "GET" "http://localhost:8088/portInformation"```

### Spring logs
```bash 2016-03-23 22:06:52.365  INFO 4204 --- [           main] de.itblogging.SpringProfilesApplication  : The following profiles are active: test```

## Start production (port 8081)
```bash mvn spring-boot:run -Dspring.profiles.active=production```
```bash curl -X "GET" "http://localhost:8081/environment"```
```bash curl -X "GET" "http://localhost:8081/portInformation"```

### Spring logs
```bash 2016-03-23 22:06:52.365  INFO 4204 --- [           main] de.itblogging.SpringProfilesApplication  : The following profiles are active: production```