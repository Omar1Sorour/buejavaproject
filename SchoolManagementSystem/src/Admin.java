import java.util.List;
public class Admin extends Staff {
    
    // Constructor
    public Admin(int staffID, String name, String email, String role, StaffStatus status) {
        this.staffID = staffID;
        this.name = name;
        this.email = email;
        this.role = role;
        this.status = status;
        this.managedModules = managedModules;
    }

    
    public String viewStatistics() {
        
        return "Statistics displayed";
    }

    // Method to generate reports
    public String generateReports() {
        return "Report generated";
    }
}
