package TimeMachine;

import java.util.Date;
import java.util.Random;

public class TimeMachine {
    //private String FormattedTimes;
    private int timeOne;
    private int timeTwo;

    public TimeMachine() {
        Random rand = new Random();
        timeOne = rand.nextInt(24)+1;
        timeTwo = rand.nextInt(24)+1;
    }

    public String[] getFormattedTimes() {
        String times[] = new String[2];

        // Convert from 24 ...
        if(timeOne > 12) {
            times[0] = (timeOne - 12) + "PM";
        } else {
            times[0] = timeOne + "AM";
        }

        // Convert from 24 hr + format string
        if(timeTwo > 12) {
            times[1] = (timeTwo - 12) + "PM";
        } else {
            times[1] = timeTwo + "AM";
        }

        //Times are ordered by earliest occurrence
        if(timeOne > timeTwo) {
            String temp1 = times[0];
            String temp2 = times[1];

            times[0] = temp2;
            times[1] = temp1;
        }

        return times;
    }

    public int getHoursInBetweenTimes() {
        if(timeOne > timeTwo) {
            return timeOne - timeTwo;
        } else {
            return timeTwo-timeOne;
        }
    }
}
