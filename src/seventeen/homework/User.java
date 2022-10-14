package seventeen.homework;

import java.util.Locale;

public class User {
    public int ID;
    private String name;
    private int age;
    private String email;
    private double discount;

    public User(int ID, String name, int age, String email, double discount) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.discount = discount;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private void showIdWithName(){
        System.out.println("User ID: " + ID + " name: " + name);
    }
    protected double getTotalPrice(double price){
        double userDiscount = (discount * price) / 100;
        return price - userDiscount;
    }
    void nameConvert(){
        String name = this.getName();
        this.setName(name.toUpperCase(Locale.ROOT));
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                '}';
    }
}
