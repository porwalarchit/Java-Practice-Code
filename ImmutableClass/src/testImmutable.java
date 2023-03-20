// Make class as final
// Make variable as private and final
//No method should be there that is setting values in private variable

final class testImmutable {
    private final String name;
    private final int age;

    testImmutable(final String n, final int a){
        this.name = n;
        this.age = a;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        testImmutable t = new testImmutable("Archit", 22);

        System.out.println("Name: " + t.name);
        System.out.println("Age: " + t.age);
        //t.name = "Update Name"; // This will give error as we can't update a final variable
    }
}
