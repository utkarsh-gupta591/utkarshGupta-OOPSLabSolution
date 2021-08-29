package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Utkarsh", "Gupta");
		System.out.println("Enter your Department");
		System.out.println("1. Technical\n2. Legal\n3. HR\n4. Managerial");
		Scanner sc=new Scanner(System.in);
		Department department=new Department();
		CredentialService credentialService=new CredentialService();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			department.setDepartmentName("Technical");
			break;
		case 2:
			department.setDepartmentName("Legal");
			break;
		case 3:
			department.setDepartmentName("HR");
			break;
		case 4:
			department.setDepartmentName("Managerial");
			break;
		}
		String email=credentialService.generateEmail(employee, department);
		String password=credentialService.generatePassword();
		credentialService.showCredentials(email, password, employee);
	}

}
