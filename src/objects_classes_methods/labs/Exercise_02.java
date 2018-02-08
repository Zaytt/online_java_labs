package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class Exercise2{

    // 1)
    public static String staticMethod1(){
        return staticMethod2();
    }

    public static String staticMethod2(){
        return "This is a static method";
    }

    // 2)
    public static void staticMethod3(){
        Exercise2 ex2 = new Exercise2();
        ex2.method1();
    }

    // 3)
    public void method1(){

        System.out.println("This is " + method2());
    }

    public String method2(){
        return "Something";
    }

    // 4)
    public void anotherMethod1(){
        System.out.println("This is " + anotherMethod2("else"));
    }

    public String anotherMethod2(String value){
        return "Something " + value;
    }

}
