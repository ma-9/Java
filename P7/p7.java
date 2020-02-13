//7) Write a Java program to demonstrate Parameterised Constructor

import java.util.Scanner;

class StringReverse {
  StringReverse(String textValue){
    String reverse = "";

    for(int i = textValue.length() -1; i>=0;i--){
      reverse = reverse + textValue.charAt(i);
    }

    System.out.println("Reversed String is : "+reverse);
  }
}

class p7 {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String text;
    System.out.print("Please Enter a String Here :-  ");
    text = s.nextLine();

    StringReverse obj = new StringReverse(text);
  }
}
