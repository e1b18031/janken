package oit.is.z0793.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {


  @GetMapping("/lec02")
  public String lec02(@RequestParam String name,ModelMap model){

    model.addAttribute("name",name);
    return "lec02.html";
  }


  //@param hand
  //@param model

  @GetMapping("/lec02janken")
  public String lec02Janken(@RequestParam String hand, ModelMap model) {
    model.addAttribute("myhand", hand);

    return "lec02.html";
  }

}
