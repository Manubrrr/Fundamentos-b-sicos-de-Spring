package es.fplumara.dam2.springdemo.Controller;

import es.fplumara.dam2.springdemo.Service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerr {

  private final HelloService service;

  public HelloControllerr(HelloService service) {
    this.service = service;
  }

  @GetMapping("/hello")
  public String hello() {
    return service.sayHello();
  }
}