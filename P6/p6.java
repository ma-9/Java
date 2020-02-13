//6) Write a Java program to demonstrate Default Constructor

import java.util.Scanner;

class AreaOfCircle {
  AreaOfCircle(){
    Scanner s = new Scanner(System.in);
    int r;
    double pi=3.14,area;

    System.out.println("Enter Radius of Circle : ");
    r = s.nextInt();

    area = (pi*r*r);
    System.out.println("Area of Interest is : "+area);
  }
}

class p6 {
  public static void main(String args[]){
    AreaOfCircle obj = new AreaOfCircle();
  }
}
