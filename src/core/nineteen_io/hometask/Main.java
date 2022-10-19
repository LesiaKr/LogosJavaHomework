package core.nineteen_io.hometask;

import java.io.IOException;

/*Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля повинні бути private.
Описати getters and setters. Створити клас Methods де описати всього два методи serialize() and deserialize().
1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та
десереалізацію. Результат Десереалізації вивести на консоль.
2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
Результат вивести на екран.
3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.*/
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Methods methods = new Methods();
        methods.serialize();
        methods.deserialize();
    }
}
