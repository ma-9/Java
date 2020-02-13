//8) Write a Java program to demonstrate Single Inheritance

class shape {
  int length,breadth;
}

class rectangle extends shape  {
    int area;
    void calculate(){
      area = length * breadth;
    }
}

class p8 {
  public static void main(String args[]){
    rectangle obj = new rectangle();
    obj.length = 10;
    obj.breadth = 15;
    obj.calculate();

    System.out.println("Area of Shape is :- "+ obj.area);
  }
}
