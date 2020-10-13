package com.practice.fileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	private List<EmployeePayRollData> employeePayRollList;

	public EmployeePayrollService() {
		this.employeePayRollList = new ArrayList<>();
	}

	public List<EmployeePayRollData> getEmployeePayRollList() {
		return employeePayRollList;
	}

	public void setEmployeePayRollList(List<EmployeePayRollData> employeePayRollList) {
		this.employeePayRollList = employeePayRollList;
	}
	
	public static void main(String args[]) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		Double salary = consoleInputReader.nextDouble();
		employeePayRollList.add(new EmployeePayRollData(id, name, salary));
	}
	
	private void writeEmployeePayrollData() {
		System.out.println("Employee PayRoll Data :"+employeePayRollList);
	}

}
