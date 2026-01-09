package es.fplumara.dam2.springdemo.Controller;

import es.fplumara.dam2.springdemo.Service.ApiClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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