package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02{
    public static void main(String[] args) {

        MyThread thread = new MyThread("Thread 1");
        try {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Main thread processing...");
            Thread.sleep(300);
        }

        thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(this.getName() + " processing...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread finished.");

    }
}

