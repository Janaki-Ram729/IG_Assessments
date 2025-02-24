package Threading;

import java.text.SimpleDateFormat;
import java.util.Date;

class Clock extends Thread {
    public void run() {
        while (true) {
            Date date = new Date();
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            String formattedTime = timeFormat.format(date);
            String formattedDate = dateFormat.format(date);

            System.out.println("\u000C");
            System.out.println("Time: " + formattedTime);
            System.out.println("Date: " + formattedDate);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DigitalClock {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}