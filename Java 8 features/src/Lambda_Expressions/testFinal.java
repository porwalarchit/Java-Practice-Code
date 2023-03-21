package Lambda_Expressions;

public class testFinal {
    final static String s = "Hello, ";

    public static void main(String[] args) {
//        Greet g = new Greet() {
//            @Override
//            public void sayHello(String msg) {
//                System.out.println(s + msg);
//            }
//        };

        String s1 = "Hey, ";
        Greet g = msg -> {
            System.out.println(s + msg + " (final and static variable)");
            System.out.println(s1 + msg + " (local variable)");
        };

        Greet g1 = msg ->
            System.out.println("\n"+ s + msg + " (final static variable, also no paranthesis lambda expression)");

        g.sayHello("Archit!");;
        g1.sayHello("Archit Porwal!!");
    }

    interface Greet{
        void sayHello(String msg);
    }
}
