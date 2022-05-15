import java.util.Date;
public class StopWatch {
    /** время старта секундомера в миллисекундах */
    private long startTime;
    /** время остановки секундомера в миллисекундах */
    private long endTime;
    /** возвращает время старта секундомера в миллисекундах */
    public long getStartTime() {
        return startTime;
    }
     /** возвращает время остановки секундомера в миллисекундах */
    public long getEndTime() {
        return endTime;
    }
     /** инициализация секундомера с текущем временем в миллисекундах */
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        //System.out.println("start= " + startTime);
    }
    /** сбрасывает startTime на текущее время миллисекундах */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    /** время остановки секундомера в миллисекундах */
    public void stop() {
        this.endTime = System.currentTimeMillis();
        //System.out.println("stop= " + endTime);
    }
    /** возвращает прошедшее время на секундомере в миллисекундах */
    public long getElapsedTime() {
        return ((this.endTime - this.startTime) >= 0 ? (this.endTime - this.startTime) : 0);
    }
}
