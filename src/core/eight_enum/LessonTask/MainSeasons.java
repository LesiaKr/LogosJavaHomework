package core.eight_enum.LessonTask;

public class MainSeasons {
    public static void main(String[] args) {
        Seasons season = Seasons.AUTUMN;
        season.phenomena();
        System.out.println(season.value);

        switch (season){
            case SPRING -> {
                System.out.println("It's spring");
                break;
            }
            case SUMMER -> {
                System.out.println("It's summer");
                break;
            }
            case AUTUMN -> {
                System.out.println("It's autumn");
                break;
            }
            case WINTER -> {
                System.out.println("It's winter");
                break;
            }
            default -> System.out.println("It's not the season");
        }

    }
}
