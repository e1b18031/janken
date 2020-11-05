package oit.is.z0793.kaizi.janken.model;

public class User {
  int id;
  String name;
  int user_1;
  int user_2;
  String user_1_hand;
  String user_2_hand;

  // Thymeleafでフィールドを扱うためにはgetter/setterが必ず必要
  // vscodeのソースコード右クリック->ソースアクションでsetter/getterを簡単に追加できる
  public int getUser_1() {
    return user_1;
  }

  public void setUser_1(int user_1) {
    this.user_1 = user_1;
  }

  public int getUser_2() {
    return user_2;
  }

  public void setUser_2(int user_2) {
    this.user_2 = user_2;
  }

  public String getUser_1Hand() {
    return user_1_hand;
  }

  public void setUser_1Hand(String user_1_hand) {
    this.user_1_hand = user_1_hand;
  }

  public String getUser_2Hand() {
    return user_2_hand;
  }

  public void setUser_2Hand(String user_2_hand) {
    this.user_2_hand = user_2_hand;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
