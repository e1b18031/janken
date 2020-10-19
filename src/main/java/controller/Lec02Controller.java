package oit.is.z0793.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0793.kaizi.janken.model.Janken;

@Controller
public class Lec02Controller {


  @GetMapping("/lec02")
  public String lec02(@RequestParam String name,ModelMap model){

    model.addAttribute("name",name);
    return "lec02.html";
  }


  //@param model

  @GetMapping("/lec02janken")
  public String lec02Janken(@RequestParam String hand, ModelMap model) {
    String result;
    if(hand.equals("Gu")){
      result = "Draw";
    }else if(hand.equals("Tyo")){
      result = "You Lose!!";
    }else{
      result = "You Win!";
    }
    //Janken result = new Janken(hand);
    model.addAttribute("myhand", hand);
    model.addAttribute("result", result);
    return "lec02.html";
  }

  //@PostMapping("/lec02janken/judge")
  //public String lec02JankenResult(@RequestParam String hand, ModelMap model) {
  //  Janken result = new Janken(hand);

  //  model.addAttribute("result", result);
  //  return "lec02.html";
  //}

}
