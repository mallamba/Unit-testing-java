/**
 *
 * @author Louay Khalil
 */



public class Clock {

    private Time theTime;
    private Date theDate;
    private States theState;

    private enum States {
        state1, state2, state3, state4
    }

    public Clock() {
        theState = States.state1;
        theDate = new Date();
        theTime = new Time();
    }

    public String changeMode() {
        String result = "";
        switch(theState) {
            case state1:
                result = theDate.showDate();
                theState = States.state2;
                break;
            case state2:
                result = theTime.showTime();
                theState = States.state1;
                break;
            case state3:
                result = "State3: un-available";
                theState = States.state1;
                break;
            case state4:
                result = "State4: un-available";
                theState = States.state2;
                break;
        }

        return result;
    }

    public String ready() {
        String result = "";
        switch(theState) {
            case state1:
                result = "Give Time";
                theState = States.state3;
                break;
            case state2:
                result = "Give Date";
                theState = States.state4;
                break;
            case state3:
                result = "Ready State3: un-available";
                theState = States.state1;
                break;
            case state4:
                result = "Ready State4: un-available";
                theState = States.state2;
                break;
        }

        return result;
    }

    public String set(int p1, int p2, int p3) {
        String result = "";
        switch(theState) {
            case state1:
                result = "Set State1: un-available";
                theState = States.state3;
                break;
            case state2:
                result = "Set State2: un-available";
                theState = States.state4;
                break;
            case state3:
                result = theTime.timeSet(p1, p2, p3);
                theState = States.state1;
                break;
            case state4:
                result = theDate.dateSet(p1, p2, p3);
                theState = States.state2;
                break;
        }

        return result;
    }



    public static class Time {
        int theHour = 0, theMinute = 0, theSecond = 0;

        protected String timeSet(int hour, int minute, int second) {
            if(hour >= 0 && hour <= 24 && minute >= 0 && minute <= 60 && second >= 0  && second <= 60 ) {
                theHour = hour;
                theMinute = minute;
                theSecond = second;
                return (hour + ":" + minute + ":" + second);
            }
            else
                return "error";
        }

        protected String showTime() {
            return (theHour + ":" + theMinute + ":" + theSecond);
        }

    }


    public static class Date {
        int theYear = 2000, theMonth = 1, theDay = 1;

        protected String dateSet(int year, int month, int day) {
            if(String.valueOf(year).length() == 4 && month <= 12 && month >= 1 && day <= 31 && day >= 1 ) {
                theYear = year;
                theMonth = month;
                theDay = day;;
                return (theYear + "-" + theMonth + "-" + theDay);
            }
            else
                return "error";
        }

        protected String showDate() {
            return (theYear + "-" + theMonth + "-" + theDay);
        }

    }

}
