/* 11) Write a program to demostrate 'final' keyword */

class Dildo {
  final int  limit = 19;
  void display(){
    System.out.println("Your Maximum Speed of Using Dildo is :- "+limit);
    System.out.println("And You can't increase it now.... ");
  }
}

class p11 {
  public static void main(String args[]){
    Dildo obj = new Dildo();
    obj.display();
  }
}
