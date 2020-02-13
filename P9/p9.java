//9) Write a Java program to demonstrate Multievel Inheritance
class Shape {
  int length;
  int breadth;
  int radius;
}

class AreaOfShape extends Shape {
  int area;
  void calculateArea() {
    area = length * breadth;
  }
}

class AreaOfCircle extends AreaOfShape {
  double pi = 3.14;
  double aOfCircle;
  void calculateAreaOfCircle() {
    aOfCircle = (pi*radius*radius);
  }
}
class p9 {
  public static void main(String args[]){
    AreaOfCircle obj = new AreaOfCircle();

    obj.length = 10;
    obj.breadth = 17;
    obj.radius = 14;

    obj.calculateArea();
    obj.calculateAreaOfCircle();

    System.out.println("Area of Shape is :- "+obj.area);
    System.out.println("Area of Circle  is :- "+obj.aOfCircle);
  }
}
