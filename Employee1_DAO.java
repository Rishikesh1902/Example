//POJO Class
package DAO_demo;

public class Employee1_DAO 
{
	private int eid, salary;
	private String name, department;
	public Employee1_DAO(int eid, int salary, String name, String department) 
	{
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}
	
	public String toString()
	{
		return "EID : "+eid+"\tNAME : "+name+"\tSalary : "+salary+"\tDepartment : "+department;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}