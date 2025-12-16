# HealthCheckBugDemoService
- Demo application to showcase a bug in the healthcheck implementation described [here](https://github.com/dropwizard/dropwizard/issues/10907)
- We instantiated the project using [Dropwizard Archetype](https://github.com/dropwizard/dropwizard-archetypes). The only modification involved was creating two health checks:
one critical (type = ready) and one non-critical (type = alive)
- When curling the health check endpoint, notice that the `type` query parameter is ineffective:

```
> curl "localhost:8080/health-check?name=all"
[{"name":"ReadyHealthCheck","healthy":true,"type":"READY","critical":false},{"name":"AliveHealthCheck","healthy":true,"type":"ALIVE","critical":true}]%

> curl "localhost:8080/health-check?type=alive"
[]

> curl "localhost:8080/health-check?type=ready"
[]
```

How to start the HealthCheckBugDemoService application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/health-check-bug-demo-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`
