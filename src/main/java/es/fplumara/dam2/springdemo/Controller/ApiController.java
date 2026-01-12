package es.fplumara.dam2.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fplumara.dam2.springdemo.service.ApiClientService;

@RestController
public class ApiController {

  private final ApiClientService service;

  public ApiController(ApiClientService service) {
    this.service = service;
  }

  @GetMapping("/api-summary")
  public String summary() {
    return service.summary();
  }
}