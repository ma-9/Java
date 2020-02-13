//1) Write a Java program to create Class and Object

// Here we imported Scanner Library from Utils
import java.util.Scanner;

class FindSimpleInterest {
  void Calculate() {
    float p,r,n,si;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the Total Price for Loan");
    p = s.nextFloat();
    System.out.print("Enter Rate of interest");
    r = s.nextFloat();
    System.out.print("Enter Number of years for Loan Applied");
    n = s.nextFloat();

    si = (p*r*n)/100;
    System.out.print("Simple Interest is : "+ si);
  }
}

class p1 {
  public static void main(String args[]){
    FindSimpleInterest obj = new FindSimpleInterest();
    obj.Calculate();
  }
}
