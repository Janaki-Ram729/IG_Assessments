package Threading;

class ConferenceRoomBookingJob {
    private boolean roomAvailable = true;
    public synchronized boolean bookRoom() {
        if (roomAvailable) {
            roomAvailable = false;  
            System.out.println(Thread.currentThread().getName() + " has booked the room.");
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " found the room unavailable.");
            return false;
        }
    }

    public synchronized void releaseRoom() {
        roomAvailable = true; 
        System.out.println(Thread.currentThread().getName() + " has released the room.");
    }

    public void conductMeeting() {
        try {
            System.out.println(Thread.currentThread().getName() + " is conducting the meeting.");
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println(Thread.currentThread().getName() + " has finished the meeting.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Manager extends Thread {
    private ConferenceRoomBookingJob bookingJob;

    public Manager(ConferenceRoomBookingJob bookingJob) {
        this.bookingJob = bookingJob;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is checking room availability.");
        while (true) {
            if (bookingJob.bookRoom()) {
                bookingJob.conductMeeting();
                bookingJob.releaseRoom();
                break; 
            } else {
                try {
                    System.out.println(Thread.currentThread().getName() + " will retry after a short wait.");
                    Thread.sleep((long) (Math.random() * 3000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ConferenceRoom {
    public static void main(String[] args) {
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();

        Manager manager1 = new Manager(bookingJob);
        Manager manager2 = new Manager(bookingJob);

        manager1.start();
        manager2.start();

        try {
            manager1.join();
            manager2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
