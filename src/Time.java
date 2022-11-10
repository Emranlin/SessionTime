import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public int nextSecond() {

        if (second == 60) {
            second = 0;
        } else {
            second++;
        }
        return second;
    }

    public int previousSecond() {
        if (second == 0) {
            second = 60;
        } else {
            second--;
        }
        return second;
    }


    @Override
    public String toString() {
        String minuteZero = "";
        String secondZero = "";
        String result = null;

        if (minute > 0 && minute < 60) {
            if (second > 0 && second < 60) {
                if (second <= 9) {
                    minuteZero = "0";
                }
                if (minute <= 10) {
                    secondZero = "0";
                }
                result = secondZero + second + "/" + minuteZero + minute + "/" + hour;
            } else {

                result = "We have 60 minute";
            }else{
                result = "We have 60 second";
            }

        }
    }
}

