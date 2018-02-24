package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01{

    public static void main(String[] args) {
        LinkedList<String> stringList1 = new LinkedList<String>("I'm");
        LinkedList<String> stringList2 = new LinkedList<String>(" what ");
        LinkedList<String> stringList3 = new LinkedList<String>("I am");

        stringList1.setNext(stringList2);
        stringList2.setNext(stringList3);

        LinkedList<Integer> integerList1;
        LinkedList<Integer> integerList2;
        LinkedList<Integer> integerList3;

        integerList3 = new LinkedList<Integer>(3);
        integerList2 = new LinkedList<Integer>(2, integerList3 );
        integerList1 = new LinkedList<Integer>(1, integerList2);

        System.out.print(stringList1.getData());
        System.out.print(stringList1.getNext().getData());
        System.out.println(stringList1.getNext().getNext().getData());

        System.out.println(integerList1.getData() + integerList2.getData() + integerList3.getData());




    }


}

class LinkedList<T>{
    private T data;
    private LinkedList next;


    public LinkedList(T data) {
        this.data = data;
    }

    public LinkedList(T data, LinkedList next) {

        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

}