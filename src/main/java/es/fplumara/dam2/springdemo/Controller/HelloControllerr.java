package es.fplumara.dam2.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fplumara.dam2.springdemo.service.HelloService;

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