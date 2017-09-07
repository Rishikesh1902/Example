package DAO_demo;

public class Main_DAO 
{
	public static void main(String []args)
	{
		Employee1_DAO em = new Employee1_DAO(101, 25000, "Flint", "Hardware");
		Employee1DAO ob = new Employee1DAOImpl();	//Upward Casting
		ob.addEmployee1(em);
		Employee1_DAO em1 = new Employee1_DAO(102, 15000, "Derek", "Software");
		ob.addEmployee1(em1);
		
		System.out.println(ob.getEmployee1());
	}
}