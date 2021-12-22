package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	
	public static Employee employee = new Employee("kiran","kumar");
	public static Scanner scanner = new Scanner(System.in);
	public static CredentialService credentialService = new CredentialService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    displaymenu();
    int userChoice = scanner.nextInt();
    String Email="";
    String password="";
    switch (userChoice) {
	    case 1:Email = credentialService.generateEmailAddress(employee.getfirstName(),employee.getlastName(),"tech");
	           password = credentialService.generatePassword();
	           credentialService.showCredentials(Email,password);
	    	break;
	    case 2:Email = credentialService.generateEmailAddress(employee.getfirstName(),employee.getlastName(),"adm");
	           password = credentialService.generatePassword();
	           credentialService.showCredentials(Email,password);
	    	break;
	    case 3:Email = credentialService.generateEmailAddress(employee.getfirstName(),employee.getlastName(),"hr");
	           password = credentialService.generatePassword();
	           credentialService.showCredentials(Email,password);
	    	break;
	    case 4:Email = credentialService.generateEmailAddress(employee.getfirstName(),employee.getlastName(),"lg");
	           password = credentialService.generatePassword();
	           credentialService.showCredentials(Email,password);
	    	break;
	    default:System.out.println("Invalid Choice");
	    }
    	System.out.println(Email);
    	System.out.println(password);
	}
	private static void displaymenu() {
		System.out.println("Please enter deptartment from given:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
}
