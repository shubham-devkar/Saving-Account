package controller;

import dao.Dao;
import com.entity.Employee;
public class Control {

	
		public static void main(String[] args) {
			Dao ed = new Dao();
			System.out.println(ed.showEmployeeById(1));
			System.out.println("----------------------------------------------------");
			
			
			for (Employee eee : ed.showAllEmployee()) {
				System.out.println(eee);
			}
			System.out.println("---------------------------------------------------");
			
			
			
			Employee[] testers = ed.showEmployeeDept("Tester");
			for (Employee e : testers) {
				System.out.println(e);
			}
			
			System.out.println("--------------------------------------------------");

	        System.out.println("Employee with maximum salary: " + ed.employeeMaxSalary());
	        
			System.out.println("--------------------------------------------------");
			
	        System.out.println("Employee with minimum salary: " + ed.employeeMinSalary());
	        
	        
			System.out.println("--------------------------------------------------");

	        System.out.println("Employees sorted by ascending ID:");
	        for (Employee e : ed.sortEmployeeAsc()) {
	            System.out.println(e);
	        }
	        System.out.println("--------------------------------------------------");
	   
	            System.out.println("Employees sorted by descending ID:");
	            for (Employee e1 : ed.sortEmployeeDsc()) {
	                System.out.println(e1);
	            }
		}
}

