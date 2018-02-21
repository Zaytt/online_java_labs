package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class Exercise_03{
    public static void main(String[] args) {
        System.out.println("A race between the worlds best drivers begins!");
        System.out.println("It's Michael Schumacher vs Speed Racer vs Dominic Toretto vs Jason Statham");

        Racer racer1 = new Racer("Michael Schumacher");
        Racer racer2 = new Racer("Speed Racer");
        Racer racer3 = new Racer("Dominic Toretto");
        Racer racer4 = new Racer("Jason Statham");

        racer1.thrd.setPriority(2); //I mean, it's Schumacher but look at the competition!
        racer2.thrd.setPriority(8); //Because the Mach 5, best car ever.
        racer3.thrd.setPriority(10); //Because Family.
        racer4.thrd.setPriority(5); //He's good, but he's not transporting anything right now.

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


