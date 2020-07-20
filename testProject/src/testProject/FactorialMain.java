package testProject;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int inputNum = scan.nextInt();
	
	Factorial factorial = new Factorial();
	
	int resultNum = factorial.sumInt(inputNum);
	
	
	System.out.println("1~"+inputNum+" 사이의 정수 : "+resultNum);
	
	}
	
}