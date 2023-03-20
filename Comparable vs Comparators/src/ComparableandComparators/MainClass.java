package ComparableandComparators;
import java.util.*;

public class MainClass  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Ram"));
        students.add(new Student(35, "Shyam"));
        students.add(new Student(83, "Aman"));
        students.add(new Student(13, "Rohit"));
        students.add(new Student(13, "Anuj"));


        //Let's sort the List using Collections.sort();
//        Collections.sort(students);

//        Collections.sort(students, new SortByNameThenMarks());

//        Collections.sort(students, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.name.equals(o2)) {
//                    return o1.marks - o2.marks;
//                } else {
//                    return o1.name.compareTo(o2.name);
//                }
//            }
//        });

        //After Java 8, lambda functions got introduced.
//        Collections.sort(students, (Student o1, Student o2) -> {
//                if (o1.name.equals(o2)) {
//                    return o1.marks - o2.marks;
//                } else {
//                    return o1.name.compareTo(o2.name);
//                }
//        });

        // One line solution using lambda function accessiblity
        //Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));

        //Using Inbuilt Comparator function to implement SortByNameThenMarks fn functionality.
//        Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

        //.reversed() method also can be used to reverse the order.
        Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

        students.forEach(System.out::println); //Lambda Function-> Used to optimise code so that we don't need to write more code.
    }
}

//class SortByNameThenMarks implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.name.equals(o2)){
//            return o1.marks-o2.marks;
//        }
//        else{
//            return o1.name.compareTo(o2.name);
//        }
//    }
//}