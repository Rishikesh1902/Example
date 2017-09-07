package DAO_demo;
import java.util.*;

public class Employee1DAOImpl implements Employee1DAO
{
	@Override
	public List<Employee1_DAO> getEmployee1()
	{
		return Employee1DAO.list;
	}
	
	@Override
	public void addEmployee1(Employee1_DAO e)
	{
		Employee1DAO.list.add(e);
		
	}
}