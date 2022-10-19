package core.six_interface.TaskOne;

public class WorkerHoursSalary implements Salary{
    double forHour = 110;
    int workDays = 21;
    int hoursWork = 8;

    @Override
    public void Salary() {
        System.out.println("An employee with an hourly salary receives: " + ((workDays * hoursWork) * forHour));
    }
}
