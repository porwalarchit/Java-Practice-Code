public class stringImmutableCheck {
    public static void main(String[] args) {
        String name = "Archit";

        String name1 = "Archit";
        if(name==name1){
            System.out.println("same");
        }
        else {
            System.out.println("Different");
        }
        name1 = name1+"Porwal";
        if(name==name1){
            System.out.println("same2");
        }
        else {
            System.out.println("Different2");
        }
//        System.out.println(name);
    }
}
