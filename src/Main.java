public class Main {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 3);
        System.out.println(time);


        time.setHour(4);
        time.setMinute(5);
        time.setSecond(6);
        System.out.println(time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        System.out.println(time.nextSecond());

        System.out.println(time.previousSecond());


    }
}