public class DayDriver {
    public static void main(String[] args){
        Day day = new Day();
        day.setDay("Monday");

        System.out.println("Today is Monday");
        System.out.println("Tomorrow is " + day.nextDay());
        System.out.println("Yesterday was " + day.previousDay());
        System.out.println("Next week it will be " + day.calculateDay(7));
    }
}