package practice;
/*You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or
other items. We want to create the text that should be displayed next to such an item.
Implement the function which takes an array containing the names of people that like an item.
It must return the display text as shown in the examples:
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.*/

public class Task_1 {
    public static void main(String[] args){
        String[] name0 = new String[] {};
        String[] name1 = new String[] {"Peter"};
        String[] name2 = new String[] {"Jacob", "Alex"};
        String[] name3 = new String[] {"Max", "John", "Mark"};
        String[] name4 = new String[] {"Alex", "Jacob", "Mark", "Max"};
        String[] name5 = new String[] {"Alex", "Jacob", "Mark", "Max", "Oleg"};
        String[] name = new String[] {null};

        getNames(name0);
        getNames(name1);
        getNames(name2);
        getNames(name3);
        getNames(name4);
        getNames(name5);
        getNames(name);
    }

    public static String[] getNames(String[] names){
        switch (names.length){
            case 0:
                System.out.println("no one likes this"); //"no one likes this"
                break;
            case 1:
                for(String n: names)
                System.out.println(n + " likes this"); //"Peter likes this"
                break;
            case 2:
                for (int i = 0; i < names.length - 1; i++) //"Jacob and Alex like this"
                System.out.println(names[0] + " and " + names[1] + " like this");
                break;
            case 3:
                for (int i = 0; i < names.length - 2; i++) //"Max, John and Mark like this"
                System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
                break;
            default:
                int count = names.length-2;
                for (int i = 3; i < names.length-2; i++) //"Alex, Jacob and 2 others like this"
                    count++;
                System.out.println(names[0] + ", " + names[1] + " and " + count + " like this");
        }
        return names;
    }
}
