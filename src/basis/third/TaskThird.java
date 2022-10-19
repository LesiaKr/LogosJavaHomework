package basis.third;
//3.Вивести 10 перших чисел з ряду Фібоначі
public class TaskThird {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print(f1+" "+f2+" ");
        for (int i = 3; i <= 10; i++) {
            f3 = f1 + f2;
            System.out.print(f3 +" ");
            f1 = f2;
            f2 = f3;
        }
    }
}
