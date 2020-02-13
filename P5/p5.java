//5) Write a Java program to print Numbers divisible by 7 up to 100

class p5{
  public static void main(String args[]){
    System.out.println("Number that are divisible by 7 between 1 to 100");
    for(int i =1;i<=100;i++){
      if(i%7==0){
        System.out.println(i);
      }
    }
  }
}
