package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class Village{
    static int totalPopulation;
    int localPopulation;


    public Village(int localPopulation) {
        this.localPopulation = localPopulation;
        Village.totalPopulation += localPopulation;
    }

    public void increasePopulation(int i){
        this.localPopulation += i;
        Village.totalPopulation += i;
    }

    public static void main(String[] args) {
        //Create new Villages
        Village ubud = new Village(100);
        Village kuta = new Village(1000);
        Village seminyak = new Village(300);

        System.out.println("There's 3 villages in Bali: Ubud, Kuta & Seminyak");
        System.out.println("Their population is "   + ubud.localPopulation + ", "
                                                    + kuta.localPopulation + ", "
                                                    + seminyak.localPopulation + " respectively ");
        System.out.println("And their combined population is " + Village.totalPopulation);
        ubud.increasePopulation(13);
        System.out.println("But next month another 13 people are coming to Ubud, so the population has increased");
        System.out.println("Ubud has now : " + ubud.localPopulation + " people, and therefore Bali has now: "
                            + Village.totalPopulation + " people");

    }

}
