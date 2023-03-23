public class ShallowCopyExample {
    static class ABC {
        // instance variable of the class ABC
        int x = 30;
    }
    public static void main(String argvs[]) {
        ABC obj1 = new ABC();
        ABC obj2 = obj1;

        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);

        //Adding this comment for checking merge conflicts.
    }
}   