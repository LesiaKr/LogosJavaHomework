package core.four_oop.lesson;

public class Horse extends Animals {
    public void igogo(){
        System.out.println("The voice of a dog 'I-go-go'");
    }
    @Override
    public void voice(){
        this.igogo();
    }
}
