public class DeepCopyExample {
    static class ABC {
        int x = 30;
    }
    public static void main(String argvs[]) {
        ABC obj1 = new ABC();
        ABC obj2 = new ABC();

        // updating the value to 6 using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}