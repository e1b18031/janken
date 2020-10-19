package oit.is.z0793.kaizi.janken.model;

public class Janken{
  String name;
  String result;
  String hand;

  //コンストラクタ
  public Janken(String hand){
    this.hand = hand;

    if(hand.equals("Gu")){
      result = "Draw";
    }else if(hand.equals("Tyo")){
      result = "You Lose";
    }else{
      result = "You Win!";
    }
  }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getResult(){
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

}
