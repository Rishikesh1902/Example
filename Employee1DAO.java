//Interface

package DAO_demo;
import java.util.*;

public interface Employee1DAO 
{
	public static final List<Employee1_DAO> list = new ArrayList<>();
	public List<Employee1_DAO> getEmployee1();			//Collection of Employee
	public void addEmployee1(Employee1_DAO e);
}