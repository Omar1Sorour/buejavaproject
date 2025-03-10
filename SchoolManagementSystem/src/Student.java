import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String email;
    private float annualFee;
    private List<Module> enrolledModules;

    // Constructors
    public Student(int studentID) {
        this.studentID = studentID;
    }

    public Student(String name, String email, float annualFee, List<Module> enrolledModules) {
        this.name = name;
        this.email = email;
        this.annualFee = annualFee;
        this.enrolledModules = enrolledModules;
    }

    // Getters and Setters
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAnnualFee(float annualFee) {
        this.annualFee = annualFee;
    }

    public float getAnnualFee() {
        return annualFee;
    }

    public void setEnrolledModules(List<Module> enrolledModules) {
        this.enrolledModules = enrolledModules;
    }

    public List<Module> getEnrolledModules() {
        return enrolledModules;
    }

    // Methods
    public void manageAccount(int studentID, Student newDetails) {
        if (this.studentID == studentID) {
            this.name = newDetails.getName();
            this.email = newDetails.getEmail();
            this.annualFee = newDetails.getAnnualFee();
            this.enrolledModules = newDetails.getEnrolledModules();
        }
    }

    public void enrollInModule(int moduleID) {
        // Logic to enroll in a module
    }

    public void cancelEnrollment(int moduleID) {
        // Logic to cancel enrollment in a module
    }

    public void updateEnrollment(int moduleID, int newModuleID) {
        // Logic to update module enrollment
    }

    public List<Module> viewModules() {
        return enrolledModules;
    }
}
