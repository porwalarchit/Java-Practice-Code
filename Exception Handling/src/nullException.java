public class nullException {
    String A;

    public static void main(String[] args) {
        nullException n = new nullException();
        try{
            if(n.A.equals("Hello")){
                System.out.println("If ");
            }
            else{
                System.out.println("Else");
            }
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception Caught");
        }
    }
}
