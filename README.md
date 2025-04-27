# paketo-test
Project to Demonstrate with usage of Spring Boot with buildpacks

### Commands

- build : `mvn clean install -DMIRROR_GITHUB=<the http mirror to use to access github>`
- run : `mvn -DskipTest docker:run`

### URL(s) :
- http://localhost:8080/paketo/services/sayHello
- http://localhost:8888/
- http://localhost:8888/env

### Build Extract :
```
[INFO]     [creator]     Paketo Buildpack for CA Certificates 3.10.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/ca-certificates
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BP_EMBED_CERTS                    true   Embed certificates into the image
[INFO]     [creator]         $BP_ENABLE_RUNTIME_CERT_BINDING    true   Deprecated: Enable/disable certificate helper layer to add certs at runtime
[INFO]     [creator]         $BP_RUNTIME_CERT_BINDING_DISABLED  false  Disable certificate helper layer to add certs at runtime
[INFO]     [creator]       Launch Helper: Contributing to layer
[INFO]     [creator]         Creating /layers/paketo-buildpacks_ca-certificates/helper/exec.d/ca-certificates-helper
[INFO]     [creator]     Processing layers
[INFO]     [creator]     Updating environment
[INFO]     [creator]     Reading output files
[INFO]     [creator]     Updating buildpack processes
[INFO]     [creator]     Updating process list
[INFO]     [creator]     Finished running build for buildpack paketo-buildpacks/ca-certificates@3.10.0
[INFO]     [creator]     Running build for buildpack paketo-buildpacks/syft@2.10.0
[INFO]     [creator]     Looking up buildpack
[INFO]     [creator]     Finding plan
[INFO]     [creator]     Creating plan directory
[INFO]     [creator]     Preparing paths
[INFO]     [creator]     Running build command
```

### Run Extract :
```
12:11:22.000 paketo> Setting Active Processor Count to 20
12:11:22.000 paketo> JMX enabled on port 5000
12:11:22.000 paketo> Calculating JVM memory based on 12777432K available memory
12:11:22.000 paketo> For more information on this calculation, see https://paketo.io/docs/reference/java-reference/#memory-calculator
12:11:22.000 paketo> Calculated JVM Memory Configuration: -XX:MaxDirectMemorySize=10M -Xmx12122565K -XX:MaxMetaspaceSize=91666K -XX:ReservedCodeCacheSize=240M -Xss1M (Total Memory: 12777432K, Thread Count: 300, Loaded Class Count: 13770, Headroom: 0%)
12:11:22.000 paketo> Enabling Java Native Memory Tracking
12:11:22.000 paketo> Adding 0 container CA certificates to JVM truststore
12:11:22.000 paketo> Added 1 additional CA certificate(s) to system truststore
12:11:22.000 paketo> Spring Cloud Bindings Enabled
12:11:22.000 paketo> Picked up JAVA_TOOL_OPTIONS: -Duser.timezone=UTC
12:11:22.000 paketo>                                         -Djava.awt.headless=true
12:11:22.000 paketo>                                         -Dspring.config.location=classpath:application.properties,/configuration/application.properties -Djava.security.properties=/layers/paketo-buildpacks_bellsoft-liberica/java-security-properties/java-security.properties -XX:+ExitOnOutOfMemoryError -XX:ActiveProcessorCount=20 -Djava.rmi.server.hostname=127.0.0.1 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.port=5000 -Dcom.sun.management.jmxremote.rmi.port=5000 -XX:MaxDirectMemorySize=10M -Xmx12122565K -XX:MaxMetaspaceSize=91666K -XX:ReservedCodeCacheSize=240M -Xss1M -XX:+UnlockDiagnosticVMOptions -XX:NativeMemoryTracking=summary -XX:+PrintNMTStatistics -Dorg.springframework.cloud.bindings.boot.enable=true
12:11:24.000 paketo>
12:11:24.000 paketo>   .   ____          _            __ _ _
12:11:24.000 paketo>  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
12:11:24.000 paketo> ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
12:11:24.000 paketo>  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
12:11:24.000 paketo>   '  |____| .__|_| |_|_| |_\__, | / / / /
12:11:24.000 paketo>  =========|_|==============|___/=/_/_/_/
12:11:24.000 paketo>  :: Spring Boot ::               (v2.7.18)
12:11:24.000 paketo>
```
