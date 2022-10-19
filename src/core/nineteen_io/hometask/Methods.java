package core.nineteen_io.hometask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та
десереалізацію. Результат Десереалізації вивести на консоль.
2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
Результат вивести на екран.
3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.*/
public class Methods {

    void serialize() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("dataIO.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
          // task1
//        Employee employee = new Employee("Anna", 526, 5000); //task1
//        objectOutputStream.writeObject(employee); //task1

          // task3
//        List<Employee> empList = new ArrayList<>(); //task3
//        Employee employee = new Employee("Anna", 526, 5000); //task3
//        empList.add(employee); //task3
//        objectOutputStream.writeObject(empList); //task3

          //task4
        Employee employee = new Employee(); //task4
        employee.setName("Iryna");//task4
        employee.setId(457);//task4
        Salary salary = new Salary();//task4
        salary.setSalary(7000);//task4
        employee.setSalary(salary);//task4
        objectOutputStream.writeObject(employee);//task4

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("datssa.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // task1
//        Employee employee = (Employee) objectInputStream.readObject(); //task1
//        System.out.println(employee); //task1

        // task3
//        List<Employee> empList = (List<Employee>) objectInputStream.readObject(); //task3
//        System.out.println(empList); //task3

        // task4
        Employee employee = (Employee) objectInputStream.readObject(); //task4
        System.out.println(employee); //task4
    }
}
