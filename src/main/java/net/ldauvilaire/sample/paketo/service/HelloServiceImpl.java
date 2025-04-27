package net.ldauvilaire.sample.paketo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

  @Value("${spring.application.name}")
  public String applicationName;

  @Override
  public String welcome() {
    return String.format("Welcome to the [%s] application.", applicationName);
  }
}
