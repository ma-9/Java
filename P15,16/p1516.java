//15 & 16) Write a program to demostrate concept of interface and implement keyword in java

// Note: Interface is used to generate Multiple Inheritance

interface Square {
  default void display(){
    System.out.println("Square Class");
  }
}

interface Cube {
  default void display(){
    System.out.println("Cube Class");
  }
}

class MergedClass implements Square, Cube {
  public void display(){
    Square.super.display();
    Cube.super.display();
  }
}

class p1516 {
  public static void main(String args[]){
    MergedClass obj = new MergedClass();
    obj.display();
  }
}
