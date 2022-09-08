package six.homework.taskTwo;

public class Wheel {
    private int tireSize;
    private String season;

    public Wheel(int tireSize, String season) {
        this.tireSize = tireSize;
        this.season = season;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    public void sizeTire(){
        int size = tireSize + 5;
        System.out.println(size);
    }
    public void saySeason(){
        System.out.println("Winter");
    }

}
