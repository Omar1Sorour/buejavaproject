import java.util.*;

public class Enrollment{
    private int enrollmentID;
    private int studentID;
    private int moduleID;
    private Status enrollmentStatus;
    public enum Status {
        ACTIVE, CANCELLED;
    }
}