package testPackage;

import java.util.Scanner;

/*
  if- else
  switch case
  
  if(condition){
    code
  }
 */
public class _05DecisionMaking {
static	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		loanwithcibil();
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

}
