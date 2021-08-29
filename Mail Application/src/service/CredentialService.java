package service;

import java.util.Random;

import model.Department;
import model.Employee;

public class CredentialService {
	public String generateEmail(Employee employee, Department department)
	{
		String email=employee.getFirstName()+employee.getLastName()+"."+department.getDepartmentName()+"@company.com";
		return email;
	}
	public String generatePassword()
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random rnd=new Random();
		char[] p=new char[8];
		for(int i=0;i<p.length;i++)
		{
			p[i]=values.charAt(rnd.nextInt(values.length()));
		}
		return new String(p);
	}
	public void showCredentials(String email, String password, Employee employee)
	{
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email -> "+email);
		System.out.println("Password -> "+password);
	}
}
