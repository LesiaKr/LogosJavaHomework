package six.homework.taskTwo;

public class Wheel {
    private int tireSize;
    private String season;

    public Wheel(int tireSize, String season) {
        this.tireSize = tireSize;
        this.season = season;
    }

    //замість конструктора вище можемо використати set, щоб задати параметри
//    public void setTireSize(int tireSize) {
//        this.tireSize = tireSize;
//    }
//    public void setSeason(String season) {
//        this.season = season;
//    }

    public int getTireSize() {
        return tireSize += 5;
    }

    public String getSeason() {
        return season;
    }
}
