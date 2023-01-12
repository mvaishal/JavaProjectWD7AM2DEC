package testPackage;

import java.util.Scanner;

/*
  if- else
  switch case
  
  if(condition){
    code
  }
 */
//take three number input from user and print the max number from that.
public class _05DecisionMaking {
static	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		combineSwitchCase();
	}

	public static void loanapply() {
		
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		
		if(salary>=25000) {
			System.out.println("Loan approved");
		}else {
			System.out.println("Loan not approved");
		}
	}
	
	public static void loanwithcibil() {
		//nested if
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		
		if(salary>=25000) {
			System.out.println("What is the cibil score");
			int cibil = sc.nextInt();
			if(cibil>=700) {
				System.out.println("Loan approved");
			}else {
				System.out.println("loan not approved due to low cibil");
			}
			
		}else {
			System.out.println("loan not approved due to low salary");
		}
	}
	
	
	public static void studentsgrade() {
		/*
		 if(condition){
		 }else if(condition){
		 
		 }else{
		 }
		 */
		
		System.out.println("Enter marks in %");
		int marks = sc.nextInt();
		if(marks>80 && marks <=100) {
			System.out.println("A+");
		}else if(marks>60 && marks <=80) {
			System.out.println("A");
		}else if(marks>50 && marks <=60) {
			System.out.println("B");
		}else if(marks>40 && marks <=50) {
			System.out.println("C");
		}else {
			System.out.println("Better luck next time");
		}
	}
	
	public static void calculator() {
		/*
		  switch(expression){
		    case :
		        code
		        break; 
		        
		    default:
		          code
		          break    
		  
		  }
		 */
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("select arithmetic opertion to perform + - * / %");
		char op = sc.next().charAt(0);
		
		int result=0;
		switch (op) {
		case '+':
			result= num1+num2;
			break;
		case '-':
			result= num1-num2;
			break;
		case '*':
			result= num1*num2;
			break;
			
		case '/':
			result= num1/num2;
			break;
			
		case '%':
			result= num1%num2;
			break;
			
		default:
			System.out.println("Invalid operation");
			break;
		}
		
		System.out.println(result);
		
	}
	
	public static void combineSwitchCase() {
		System.out.println("Enter first three character of month name");
		 String month= sc.next();
		 switch (month.toLowerCase()) {
		case "jan":
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":
			System.out.println("31 days");
			break;
		case "feb":
			System.out.println("28/29 days");
			break;
		case "apr":
		case "jun":
		case "sep":
		case "nov":
			System.out.println("30 days");
			break;
		default:
			break;
		}
	}

}














