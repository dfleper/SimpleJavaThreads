package SimpleJavaThreads;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Ejecutable implements Runnable {

    @Override
    public void run() {
        try {
            int randomRun = ThreadLocalRandom.current().nextInt(2000, 6000);
            System.out.println("Hola Soy un Ejecutable. " + LocalDateTime.now());
            Thread.sleep(randomRun);
            System.out.println("Adios Soy un Ejecutable. " + LocalDateTime.now());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
