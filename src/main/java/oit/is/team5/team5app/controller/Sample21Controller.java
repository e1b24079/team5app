package oit.is.team5.team5app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample21Controller {

  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }
}
