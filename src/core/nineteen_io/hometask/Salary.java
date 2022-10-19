package core.nineteen_io.hometask;

import java.io.Serializable;
//task4
public class Salary implements Serializable {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "" + salary +
                "";
    }
}
