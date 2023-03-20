package default_and_static_methods_in_Interfaces;

public class MainClass {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.method2();
        ob.log("Archit");

        Interface1 i1 = new Interface1() {
            @Override
            public void method1() {
                System.out.println("Interface1: method()");
            }
        };
        i1.method1();
        i1.log("Interface1: log(string)");

        Interface2 i2 = new Interface2() {
            @Override
            public void method2() {
                System.out.println("Interface2: method()");
            }
        };
        i2.method2();
        i2.log("Interface2: log(string)");
    }
}
