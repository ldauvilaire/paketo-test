package net.ldauvilaire.sample.paketo.configuration;

import net.ldauvilaire.sample.paketo.service.HelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfiguration {

  @Bean
  public Server rsServer(Bus bus,
                         HelloService helloService) {
    JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
    endpoint.setBus(bus);
    endpoint.setServiceBean(helloService);
    endpoint.setAddress("/");
    return endpoint.create();
  }
}
