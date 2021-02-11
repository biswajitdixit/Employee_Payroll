package com.io;

public class EmployeePayRollData {
    public int id;
    public String name;
    public long salary;

    public EmployeePayRollData(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "NAME : " + name + ", ID : " + id + ", SALARY : " + salary + "\n";
    }
}
