package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employer;

public class Progran {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	List<Employer> list = new ArrayList<>();
	System.out.println("How  many employees will be registered?");
	int n = sc.nextInt();
	
	for(int i=0 ; i<n ; i++ ) {
		System.out.println();
		System.out.println("Emplyer #"+(i+1)+":");
		System.out.print("Id: ");
		Integer id = sc.nextInt();
		
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Salary: ");
		Double salary = sc.nextDouble();
		
		Employer emp = new Employer(id, name, salary);
		list.add(emp);	
		
		}
		
	System.out.println("Enter the employee id that will have salary increase : ");
	
	int idsalary = sc.nextInt();	
		Integer pos =position(list,idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage:");
			double percent= sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees");
		
		for(Employer emp : list) {
			System.out.println(emp);
		}
		
	sc.close();

	}
		public static Integer position(List<Employer> list, int id) {
			for(int i = 0 ; i< list.size();i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
		}
	}

