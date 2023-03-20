package practice;

import java.util.Objects;

public class Employee_Overloaded {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ //If two objects are pointing toward same references then it should return true.
            return true;
        }
        if (o == null || getClass() != o.getClass()){ //If object is null, or also they are not equal then it should return false.
            return false;
        }

        Employee_Overloaded e = (Employee_Overloaded) o;// Typecasted object of object o to Employee e.
        return (this.getId() == e.getId()); // If Employee id of two objects are same that means two particular objects are same then it should return true, else return false.
    }

    @Override
    public int hashCode() {
//        Many more ways to implement hashcode such as take a prime number and use it to calculate a hashcode that is unique for different values.
//        This is the simplest way of implementing it
//        Because id is also an integer and it sure that for all the employee it is going to remain integer and primary.
        return getId();
//        return Objects.hash(id, name);
    }
}


/*
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
*/