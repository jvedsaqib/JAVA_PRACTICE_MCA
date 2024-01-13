package interfaceClass;

/*1. Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main( ), create an object of your class and pass it to
each of the methods.*/

interface I1{
    void M1();
    void M2();
}

interface I2{
    void M3();
    void M4();
}

interface I3{
    void M5();
    void M6();
}

interface I4 extends I1,I2,I3{
    void M7();
}


class Concrete{
    void M8(){
        System.out.println("Hello java");
    }
}

class TestClass extends Concrete implements I4{
    

    public void M1() {
        // TODO Auto-generated method stub
        System.out.println("hi");
    }

    public void M2() {
        // TODO Auto-generated method stub
        System.out.println("hii");
    }

    public void M3() {
        // TODO Auto-generated method stub
        System.out.println("hiii");
    }

    public void M4() {
        // TODO Auto-generated method stub
        System.out.println("hiiii");
    }

    public void M5() {
        // TODO Auto-generated method stub
        System.out.println("hiiiii");
    }

    public void M6() {
        // TODO Auto-generated method stub
        System.out.println("hiiiiiii");
    }

    public void M7() {
        // TODO Auto-generated method stub
        System.out.println("hiiiiiiiiii");
    }
    
}
public class Prog_1 {
    public static void method_1(I1 i){
        i.M1();
        i.M2();
    }
public static void method_2(I2 i){
        i.M3();
        i.M4();
    }
public static void method_3(I3 i){
        i.M5();
        i.M6();
}
public static void method_4(I4 i){
    i.M7();
}
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestClass m = new TestClass();
        method_1(m);
        method_2(m);
        method_3(m);
        method_4(m);
    }

}
