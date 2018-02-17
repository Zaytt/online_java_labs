package packages_interfaces.labs.package1;

public class Class1 {

    public void publicMethod(){
        System.out.println("This method is public and accessible to other packages.");
    }

    protected void protectedMethod(){
        System.out.println("This method is protected and not available to other packages.");
    }
}
