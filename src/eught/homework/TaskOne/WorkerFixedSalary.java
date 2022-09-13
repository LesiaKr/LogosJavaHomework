package eught.homework.TaskOne;

public class WorkerFixedSalary implements Salary {
    double forDay = 857.14;
    int workDays = 21;

    @Override
    public void Salary() {
        System.out.println("An employee with a fixed monthly salary receives: " + (forDay * workDays));
    }
}
