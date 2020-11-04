package oit.is.z0793.kaizi.janken.model;

public class User {
  int id;
  int user_1;
  int user_2;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
