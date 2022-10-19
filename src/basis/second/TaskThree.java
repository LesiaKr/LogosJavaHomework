package basis.second;
// Перші 55 елементів послідовності 1 3 5 7 9 ...
public class TaskThree {
    //1. Варіант мій
//    public static void main(String[] args) {
//        for (int i = 1, n = 0; n < 55; i+=2, n++){
//            System.out.println(i);
//        }
//    }
    // 2. Підказка від викладача
    public static void main(String[] args) {
        for (int i = 0; i < 55; i++){
            System.out.println(i*2 + 1);
        }
    }
}
