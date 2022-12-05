class Employee{
	String name;
	int age;
	int phnum;
	String address;
	double salary;
	String spec;
	String dep;
	public void printSalary(){
				System.out.println("**Salary=" + salary);
			}
	public void printInfo() {
		System.out.println("NAME: " + name + "\nAGE: " + age + "\nPHONE NUMBER: " + phnum  + "\nADDRESS: " + address);
		}
	}
			class Officer extends Employee{
	String spec;
		 Officer(String name, int age, int phnum, double salary,String address,String spec){
			this.name=name;
			this.age=age;
			this.phnum= phnum;
			this.address= address;
			this.salary=salary;
			this.spec=spec;
			
			this.printInfo();
			this.printSpec();
		}
		public void printSpec(){
			System.out.println("**Specialization: " + spec);
		}
	}
	class Manager extends Employee{
	String dep;
		 Manager(String name, int age, int phnum,  double salary,String address,String dep){
			this.name=name;
			this.age=age;
			this.phnum= phnum;
			this.address= address;
			this.salary=salary;
			this.dep=dep;
			
			this.printInfo();
			this.printDep();
		}
		public void printDep(){
			System.out.println("**Department: " + dep);
		}
	}
	public class emp{
		public static void main(String[] args){
			System.out.println("\n~~COMPANY EMPLOYEE LIST~~\n");
			Officer officer=new Officer("RAHUL",25,998877455,25000,"HOUSE NO 18, 513", "HR");
			officer.printSalary();
			System.out.println(" ");
			Manager manager=new Manager("RAM",32,998854545,32000,"HOUSE NO 45, JK STREET", "DESIGN");
			manager.printSalary();
		}
	}
