//4) Write a Java program to print Even numbers upto 100 using do while loop

class p4{
  public static void main(String args[]){
    System.out.println("Even Numbers Upto 100");
    int i = 1;
    do{
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }while(i<=100);
  }
}
