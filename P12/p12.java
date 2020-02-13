//12) Write a program to demostrate 'final' Class

final class PrintMessage {
  void display(){
    System.out.println("Hey, This class is Secure, It can't be extended");
  }
}

class New extends PrintMessage{
  void print(){
      System.out.println("You are in extended Class");
  }
}

class p12 {
  public static void main(String args[]){
      New obj = new New();
      obj.display();
  }
}
