
import java.util.Scanner;
Class Calculator {

 static void Addition( int firstNumber, int secondNumber ) {
        System.out.println("Addition = " + (firstNumber + secondNumber));
    }


 static void Substratcion( int firstNumber, int secondNumber ) {
        System.out.println("Substratcion = " + (firstNumber - secondNumber));
    }


import java.lang.*;
import java.util*;
class Calculator {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(mod(a,b));
    System.out.println(pow(a,b));
	}
  int pow(int a ,int b)
	{
		return Math.pow(a,b);
	}
	double mod(int a,int b){
		return a%b;
}
}