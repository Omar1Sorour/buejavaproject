import java.util.List;

public class Admin extends Staff {
    
    public String viewStatistics() {
        
        return "Statistics displayed";
    }

    // Method to generate reports
    public String generateReports() {
        return "Report generated";
    }
}
