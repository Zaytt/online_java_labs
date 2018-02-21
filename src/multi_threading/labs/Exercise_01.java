package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */



public class Exercise_01{
    public static void main(String[] args) {
        System.out.println("A race between the worlds best drivers begins!");
        System.out.println("It's Michael Schumacher vs Speed Racer vs Dominic Toretto vs Jason Statham");

        Racer racer1 = new Racer("Michael Schumacher");
        Racer racer2 = new Racer("Speed Racer");
        Racer racer3 = new Racer("Dominic Toretto");
        Racer racer4 = new Racer("Jason Statham");

        racer1.thrd.start();
        racer2.thrd.start();
        racer3.thrd.start();
        racer4.thrd.start();



        try {
            racer1.thrd.join();
            racer2.thrd.join();
            racer3.thrd.join();
            racer4.thrd.join();
            System.out.println("-----------------------------");
            System.out.println(Racer.winner + " won!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


class Racer implements Runnable{

    Thread thrd;
    static String winner = "";

    public Racer(String name) {
        this.thrd = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " Starts!");
        for(int i = 0; i < 10; i++){
            try {

                System.out.println(thrd.getName() + " is " + i + "/10 done!");
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thrd.getName() + " crossed the finish line!");

        if(winner == "") {
            winner = this.thrd.getName();
        }
    }
}
