/*10) Class Number has a variable x which is an integer number. Class Square is derived
from class number which prints square of the given number and class Cube is derived
from class Square which prints the cube of the integer number. Write a progrma to
demonstrate the mechanism.*/

import java.util.Scanner;
import java.lang.Math;

class Number {
  double x;
}

class Square extends Number {
  double square;
  void calculareSquare(){
    square = Math.pow(x,2);
  }
}

class Cube extends Square {
  double cube;
  void calculateCube() {
    cube = Math.pow(x,3);
  }
}

class p10 {
  public static void main(String args[]){
    Cube obj = new Cube();

    obj.x = 5;

    obj.calculareSquare();
    obj.calculateCube();

    System.out.println("Square is :- "+obj.square);
    System.out.println("Cube is :- "+obj.cube);

  }
}
