//Author: Ovidio
//Purpose: To set a day of the week and return the day asked
//Date: 12/11/2017
//License: GNU


public class Day {
    int idxDay;

    private String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public void setDay(String day) {
        for (int i=0; i<days.length; i++) {
            if(day.equals(days[i])){
                this.idxDay = i;
                break;
            }

        }
    }
    public void setDay(int day){
        this.idxDay = day;
    }


                //method for logic

    public String calculateDay (int number) {
        if(number<0)
            return days[(7+this.idxDay-Math.abs(number)%7)%7];
        else
            return days[(this.idxDay+number)%7];
    }

            //next day method
    public String nextDay() {
        return calculateDay(1);
    }

    public String previousDay(){
        return calculateDay(-1);
    }
}