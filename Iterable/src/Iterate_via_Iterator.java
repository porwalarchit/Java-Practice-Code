import java.util.*;

public class Iterate_via_Iterator {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(20011, "Jack LongBottom");
        student.put(20013, "Harry Potter");
        student.put(20016, "Julia George");
        student.put(20017, "Tom Lucia");
        student.put(20025, "Petter Cruz");

//        Set hashmapSet = student.
        Iterator it = student.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry mapEntry = (Map.Entry) it.next();
            System.out.println("Student ID: " + mapEntry.getKey() + "\tStudent Name: " + mapEntry.getValue());
        }
    }
}
