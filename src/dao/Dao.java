package dao;
import com.entity.Employee;

public class Dao {
	
	
		Employee e1 = new Employee(1, "Raj patil",45000, "Developer");
		Employee e2 = new Employee(3, "Neha Singh", 48000,"Tester");
		Employee e3 = new Employee(7, "Raj rajput",47000, "Developer");
		Employee e4 = new Employee(2, "Raj patil", 65000,"Developer");
		Employee e5 = new Employee(5, "Raj patil", 55000,"Developer");
		Employee e6 = new Employee(2, "Ranbir Kapoor",70000, "HR");
		Employee e7 = new Employee(5, "Amitabh Bachchan",50000, "del");
		Employee e8 = new Employee(9, "Salman Khan",49000, "tester");
		Employee e9 = new Employee(4, "Shahrukh Khan",51000, "tester");
		Employee e10 = new Employee(6, "Deepika Padukone",120000, "Ceo");
		Employee[] emp = new Employee[10];

		public Employee showEmployeeById(int id) {
			emp[0] = e1;
			emp[1] = e2;
			emp[2] = e3;
			emp[3] = e4;
			emp[4] = e5;
			emp[5] = e6;
			emp[6] = e7;
			emp[7] = e8;
			emp[8] = e9;
			emp[9] = e10;

			int index = id - 1;
			return emp[index];

		}

		public Employee[] showAllEmployee() {
			emp[0] = e1;
			emp[1] = e2;
			emp[2] = e3;
			emp[3] = e4;
			emp[4] = e5;
			emp[5] = e6;
			emp[6] = e7;
			emp[7] = e8;
			emp[8] = e9;
			emp[9] = e10;

			return emp;

		}

		public Employee[] showEmployeeDept(String dept) {
			// First, count how many employees match the role
			int count = 0;
			for (Employee e : emp) {
				if (e.getDept().equalsIgnoreCase(dept)) {
					count++;
				}
			}

			// Create an array of the appropriate size
			Employee[] employeesByRole = new Employee[count];

			// Populate the array with matching employees
			int index = 0;
			for (Employee e : emp) {
				if (e.getDept().equalsIgnoreCase(dept)) {
					employeesByRole[index++] = e;
				}
			}

			return employeesByRole;
		}
		 public Employee employeeMaxSalary() {
		        Employee maxSalaryEmployee = emp[0];
		        for (Employee employee : emp) {
		            if (employee.getSal() > maxSalaryEmployee.getSal()) {
		                maxSalaryEmployee = employee;
		            }
		        }
		        return maxSalaryEmployee;
		 }
		 public Employee employeeMinSalary() {
		        Employee minSalaryEmployee = emp[0];
		        for (Employee employee : emp) {
		            if (employee.getSal() < minSalaryEmployee.getSal()) {
		                minSalaryEmployee = employee;
		            }
		        }
		        return minSalaryEmployee;
		    }
		 public Employee[] sortEmployeeAsc() {
		        Employee[] sortedEmployees = emp.clone();
		        for (int i = 0; i < sortedEmployees.length; i++) {
		        	 for (int j = i + 1; j < sortedEmployees.length; j++) {
		                 if (sortedEmployees[i].getEmid() > sortedEmployees[j].getEmid()) {
		                     Employee temp = sortedEmployees[i];
		                     sortedEmployees[i] = sortedEmployees[j];
		                     sortedEmployees[j] = temp;
		                 }
		             }
		         }
		         return sortedEmployees;
		     }
		 public Employee[] sortEmployeeDsc() {
		        Employee[] sortedEmployees = emp.clone();
		        for (int i = 0; i < sortedEmployees.length; i++) {
		            for (int j = i + 1; j < sortedEmployees.length; j++) {
		                if (sortedEmployees[i].getEmid() < sortedEmployees[j].getEmid()) {
		                    Employee temp = sortedEmployees[i];
		                    sortedEmployees[i] = sortedEmployees[j];
		                    sortedEmployees[j] = temp;
		                }
		          
		            }
		        }
		 
	      return  emp;
		 }

		
		}

               

	