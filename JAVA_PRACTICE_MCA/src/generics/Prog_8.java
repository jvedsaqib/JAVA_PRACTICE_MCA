package generics;

public class Prog_8 {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\t\tThread: " + Thread.currentThread().getId() + ", Count: " + i+"\n");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        myThread.start();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count " + i+"\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
