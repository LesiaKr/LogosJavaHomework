package core.eight_enum.LessonTask;

public enum Seasons {
    WINTER("Winter"){
        @Override
        public void phenomena() {
            System.out.println("Snow, cold");
        }
    },
    SPRING("Spring"){
        @Override
        public void phenomena() {
            System.out.println("Rain, warm");
        }
    },
    SUMMER("Summer") {
        @Override
        public void phenomena() {
            System.out.println("Sunny, hot");
        }
    },
    AUTUMN("Autumn") {
        @Override
        public void phenomena() {
            System.out.println("Rain, cold");
        }
    };

    public final String value;

    Seasons(String value) {

        this.value = value;
    }
    public abstract void phenomena();
}
