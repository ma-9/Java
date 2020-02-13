/* 18) Package 'Calculate' has classes 'sum' and 'sub' with performs addition and
subtraction of 2 integer variables using required functions respectively. Write a Java
program to demonstrate this mechanism. */

// import calculate.*;

import calculate.sum;
import calculate.sub;

class p18 {
  public static void main(String args[]){
    sum obj = new sum();
    sub obj2 = new sub();

    obj.displaySum();
    obj2.displaySub();
  }
}
