//13 & 14) Write a program to demostrate 'abstract' keyword for function and class


// Abstract Keyword is used to declare the Structure of an Method or a Class that can be reused anywhere
abstract class Shape {
  abstract void display();
}

class MakeShape extends Shape {
  // @Override
  void display(){
    System.out.println("Bankra Badnam Hua, Darling Moni ke liye....");
  }
}

class p1314 {
  public static void main(String args[]){
    MakeShape obj = new MakeShape();
    obj.display();
  }
}
