package com.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO
    }

    private List<EmployeePayRollData> employeePayrollList;

    public EmployeePayRollService() {

    }

    public EmployeePayRollService(List<EmployeePayRollData> employeePayrollList) {
        // TODO Auto-generated constructor stub
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner sc = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(sc);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner sc) {
            System.out.println("Enter employee id : ");
            int id = sc.nextInt();
            System.out.println("Enter employee name : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter employee salary : ");
            long salary = sc.nextLong();
            employeePayrollList.add(new EmployeePayRollData(id, name, salary));
        }


    public void writeEmployeePayrollData() {

            System.out.println("Writing on console : \n" + employeePayrollList);

    }
}