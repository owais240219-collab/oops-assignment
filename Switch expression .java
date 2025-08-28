Traditional switch expression:
public class OldSwitch {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid";
        }

        System.out.println("Day: " + dayName);
    }
}

Modern switch expression:
public class NewSwitch {
    public static void main(String[] args) {
        int day = 3;

        String dayName = switch (day) {
            case 1  -> "Monday";
            case 2  -> "Tuesday";
            case 3  -> "Wednesday";
            case 4  -> "Thursday";
            case 5  -> "Friday";
            case 6  -> "Saturday";
            case 7  -> "Sunday";
            default -> "Invalid";
        };

        System.out.println("Day: " + dayName);
    }
}
