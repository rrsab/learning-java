public class MyTime {
    private final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
            MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;
    private long hour;
    private long minute;
    private long second;

    public MyTime() {
        long totalMilliseconds, totalSeconds, totalMinutes, totalHours;
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        second = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        minute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        hour = totalHours % HOURS_PER_DAY;
    }
    public MyTime(long elapseTime) {
        long totalMilliseconds, totalSeconds, totalMinutes, totalHours;
        totalMilliseconds = elapseTime;
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        second = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        minute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        hour = totalHours % HOURS_PER_DAY;
    }

    public MyTime(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalMilliseconds, totalSeconds, totalMinutes, totalHours;
        totalMilliseconds = elapseTime;
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        this.second = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        this.minute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        this.hour = totalHours % HOURS_PER_DAY;
    }
}
