
final class Time {

    int hour;
    int minute;
    int second;

    Time(int hr, int min, int sec) {
        this.hour = hr;
        this.minute = min;
        this.second = sec;
        normalize();
    }

    void display() {
        System.out.println("HH:MM:SS = " + this.hour + "hr "
                + this.minute + "min " + this.second + "sec ");
    }

    void normalize() {
        this.minute = this.minute + this.second / 60;
        this.second = this.second % 60;
        this.hour = this.hour + this.minute / 60;
        this.minute %= 60;
    }

    static Time add(Time t1, Time t2) {
        return new Time(t1.hour + t2.hour, t1.minute + t2.minute, t1.second + t2.second);
    }

    static Time sub(Time t1, Time t2) {
        int t1sec = t1.hour * 3600 + t1.minute * 60 + t1.second;
        int t2sec = t2.hour * 3600 + t2.minute * 60 + t2.second;
        int diff = t1sec - t2sec;
        if (diff < 0) {
            diff = diff + 24 * 3600;
        }
        int hr = diff / 3600;
        int min = (diff % 3600) / 60;
        int sec = diff % 60;
        return new Time(hr, min, sec);
    }

}

public class Main {

    public static void main(String[] args) {
        Time t1 = new Time(24, 61, 70);
        Time t2 = new Time(24, 03, 04);

        t1.display();
        t2.display();

        //add two times
        Time sum = Time.add(t1, t2);
        System.out.print("Add t1 + t2 :  ");
        System.out.println(sum.hour + "hr " + sum.minute + "min " + sum.second + "sec ");

        //sub two times
        System.out.print("subtract t1 - t2 :  ");
        Time diff = Time.sub(t1, t2);
        System.out.println(diff.hour + "hr " + diff.minute + "min " + diff.second + "sec");

    }
}
