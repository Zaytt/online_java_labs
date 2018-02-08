package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class LifeController{

    public static void main(String[] args) {

        Dog myDog = new Dog("Rocky", "Rottweiler", "Black", 'M');
        Eagle myEagle = new Eagle("Helena", 'F');

        myDog.setWeight(40.5);
        myEagle.setWingspan(130);

        System.out.println("My dog is named " + myDog.getName() + " and weights " + myDog.getWeight() + "kgs");
        System.out.println( "My eagle is named " + myEagle.getName() + " and has a wingspan of  "
                            + myEagle.getWingspan() + "cm");

    }


}

class Animal{
    private String animalClass;
    private String Species;
    private Boolean vertebrate;

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public Boolean getVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(Boolean vertebrate) {
        this.vertebrate = vertebrate;
    }
}

class Dog extends Animal{
    private String name;
    private String breed;
    private String haircolor;
    private Double weight;
    private char sex; //'M' for male, 'F' for female

    public Dog(String name, String breed, String haircolor, char sex) {
        this.name = name;
        this.breed = breed;
        this.haircolor = haircolor;
        this.sex = sex;
        this.setAnimalClass("Mammal");
        this.setSpecies("Canis lupus familiaris");
        this.setVertebrate(true);
    }


    public String getHaircolor() {
        return haircolor;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Animal{
    private  double wingspan;
    private double weight;
    private String name;
    private char sex;

    public Eagle(String name, char sex) {
        this.name = name;
        this.sex = sex;
        this.setAnimalClass("Bird");
        this.setSpecies("Aquila chrysaetos");
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
