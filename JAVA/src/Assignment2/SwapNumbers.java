package Assignment2;
//input1: a=10, b=20
//output: a=20, b=10

public class SwapNumbers {

	public static void main(String[] args) {
     int a=10;
     int b=20;
     System.out.println("Before swapping");
     System.out.println("a : "+a);
     System.out.println("b : "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swapping");
     System.out.println("a : "+a);
     System.out.println("b : "+b);
	}

}
