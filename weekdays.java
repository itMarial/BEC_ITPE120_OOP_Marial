public class weekdays {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        //weakdays
        //enum is like int
    }
    public static void main(String[] args) {
        // today is wed
        Day today = Day.SATURDAY;

        // switch statement
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday. Time to go to class!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
               System.out.println("It's a weekday. Keep studying!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Time to sleep!");
                break;
           

            default:
                System.out.println("not a day");
        }
    }
}
