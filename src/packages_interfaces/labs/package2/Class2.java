package packages_interfaces.labs.package2;

import packages_interfaces.labs.package1.Class1;
public class Class2 {

    public static void main(String[] args) {

        Class2 class2 = new Class2();
        Class1 class1 = new Class1();

        //Using this class own protected method
        class2.myProtectedMethod();

        //Now using Class1 public method.
        class1.publicMethod();

        //Can't use class1 protected method.
        //class1.protectedMethod();

    }

    protected void myProtectedMethod(){
        System.out.println("This is Class2 own protected method. It can be used between classes inside package2.");
    }
}
