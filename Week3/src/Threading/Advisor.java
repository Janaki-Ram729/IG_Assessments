package Threading;

import java.util.Random;

class AdvisorThread extends Thread {

    private String[] advices = {
        "Never begin to stop and never stop to begin.",
        "Only destination isn’t important, one should enjoy the journey.",
        "Impossible itself says 'I’m possible'.",
        "The best way to predict the future is to create it.",
        "Success is not a Destination, Success is a Journey.",
        "Great Powers come from Greater Responsibility"
    };
    
    public void run() {
        Random random = new Random();
        int index = random.nextInt(advices.length); 
        System.out.println("Advice: " + advices[index]);
    }
}

public class Advisor {
    public static void main(String[] args) {
        AdvisorThread advisorThread = new AdvisorThread();
        advisorThread.start();
        AdvisorThread advisorThread1 = new AdvisorThread();
        advisorThread1.start();
    }
}
