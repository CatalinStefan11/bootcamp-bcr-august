package ro.bcr.advanced._8_tdd.junit;

public class MyCalendar {

    public static boolean isWeekend(Day d) {
        return d.equals(Day.SATURDAY) || d.equals(Day.SUNDAY);
    }

    // java 17
    public static String getMonthName(int number){
        return switch (number){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 6 -> "Jun";
            case 12 -> "Dec";
            default -> "not a month";
        };
    }

    // java 11
    public static String getMonthNameJava11(int number){
        switch (number){
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 6:
                return "Jun";
            case 12:
                return "Dec";
            default:
                return "not a month";
        }
    }
}
