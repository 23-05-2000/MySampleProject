package com.edubridge.app1.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeesalary;
	
	public Employee(int employeeId, String employeeName, double employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeesalary="
				+ employeesalary + "]";
	}
}

