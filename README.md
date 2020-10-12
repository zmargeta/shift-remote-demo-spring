# shift-remote-demo-spring

Shift Remote Demo Spring Service.

## Endpoints

The service exposes the following endpoints:

- `/greetings`
- `/system/health`
- `/system/metrics`
- `/system/env`

A sample invocation fetching the OS variables:

```shell script
$> curl -s localhost:8080/system/env | jq '.propertySources[] | select(.name=="systemProperties") | .properties | to_entries[] | select(.key|startswith("os."))'
```
