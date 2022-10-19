package core.five_oop.TaskOne;

public abstract class Warrior {
    public String name;
    public String weapon;
    public Integer health;
    public Integer power;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getHealth() {
        return health;
    }

    void attack (Warrior target) {
        target.health -= this.power;

        System.out.println("\n"+this.name + " поцілив у " + target.name);
        System.out.println(target.name + ": здоров'я = " + target.health);

        if (target.health <= 0) {
            System.out.println(target.name + ": помер");
        }
    }

    public void showInfo (){
        System.out.println(this.name + ": Здоров'я = " + this.health + ", Сила = " + this.power + ", Зброя = " + this.weapon);
    }
}
