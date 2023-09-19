package SimpleJavaThreads;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Soy el Hilo Principal.");
        Hilo hilo = new Hilo();
        hilo.start();

        Ejecutable ejecutable = new Ejecutable();
        Thread thread = new Thread(ejecutable);
        thread.start();
        System.out.println("Adios Soy el Hilo Principal.");
    }
}
