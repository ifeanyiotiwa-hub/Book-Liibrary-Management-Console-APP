package people;

import libusertype.UserType;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator<Person> {
    private final String fName;
    private final String lName;
    private static int pops = 0;
    private final int creationNo;
    private int queuePrecedence;
    private UserType role;


    public Person(){
        this("non-person", "character");
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        this.creationNo = ++pops;
    }

    public String getName() {
        return fName + " " + lName;
    }

    @Override
    public String toString() {
        return "Person"+ creationNo +
                " FullName: " + this.getName();
    }

    public UserType getRole() {
        return role;
    }

    public void setRole(UserType role) {
        this.role = role;
    }


    public int getQueuePrecedence() {
        return queuePrecedence;
    }

    public void setQueuePrecedence(int queuePrecedence) {
        if(this.getRole() == UserType.TEACHER)
            this.queuePrecedence = UserType.TEACHER.getQueuePrecedence();
        else if(this.getRole() == UserType.SNR_STUDENT)
            this.queuePrecedence = UserType.SNR_STUDENT.getQueuePrecedence();
        else
            this.queuePrecedence = UserType.JNR_STUDENT.getQueuePrecedence();
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, creationNo);
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getRole().ordinal() > o2.getRole().ordinal())
            return 1;
        else if(o1.getRole().ordinal() < o2.getRole().ordinal())
            return 0;
        else if(o1.getRole().ordinal() == o2.getRole().ordinal())
            return -1;
        else
            throw new IllegalStateException("Not a valid User Type");
    }
}
