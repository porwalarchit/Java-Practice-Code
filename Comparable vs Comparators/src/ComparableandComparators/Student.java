package ComparableandComparators;

public class Student
//        implements Comparable<Student>
{
    int marks;
    String name;

    public Student(int marks, String name) {
        super();
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @Override
    //This will be the method that will be used to compare two objects.
    public int compareTo(Student obj) {
        // In case when we want to sort in decreasing order
        if(this.marks > obj.marks) return -1; // If current object is greater then, +1 is returned
        else if (this.marks < obj.marks) return 1; // If current object is less then, -1 is returned
         else return 0; //For both objects to be equal, 0 must be returned.
        //When marks are same, let's sort them according to their names.
//        return this.name.compareTo(obj.name);
    }
}