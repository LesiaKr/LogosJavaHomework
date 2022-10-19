package core.nineteen_io.hometask;

import java.io.Serializable;

public class Employee implements Serializable{
    private String name;
    private int id;
//    private int salary; // task1, 3
//    private transient int salary; // task2
    private Salary salary = new Salary(); //task4

//    public Employee(String name, int id, int salary) { //Task 1, 2, 3
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//    }


    public void setSalary(Salary salary) { //task4
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//task 1, 2, 3
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", id = " + id +
                ", salary = " + salary +
                '}';
    }
}
