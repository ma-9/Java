//3) Write a Java program to print Odd numbers upto 100 using while loop

class p3{
  public static void main(String args[]){
    System.out.println("Odd Numbers Upto 100");
    int i = 1;
    while(i<=100){
      if(i%2!=0){
        System.out.println(i);
      }
      i++;
    }
  }
}
