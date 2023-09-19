package SimpleJavaThreads;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Hilo extends Thread {

    @Override
    public void run() {
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 6000);
            System.out.println("Hola Soy un Hilo. " + LocalDateTime.now());
            Thread.sleep(randomNum);
            System.out.println("Adios Soy un Hilo. " + LocalDateTime.now());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
