package acneadvisor;

public class AcneStatus {
    private String area;
    private String severity;
    private boolean redness;

    public AcneStatus(String area, String severity, boolean redness) {
        this.area = area;
        this.severity = severity;
        this.redness = redness;
    }

    public String getArea() {
        return area;
    }

    public String getSeverity() {
        return severity;
    }

    public boolean isRedness() {
        return redness;
    }
}
