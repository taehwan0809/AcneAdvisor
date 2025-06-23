package acneadvisor;

public class AcneStatus {
    private String area;
    private String severity;
    private boolean redness;


    public AcneStatus(String area, String severity, boolean redness){
        this.severity = severity;
        this.redness = redness;
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    public boolean isRedness() {
        return redness;
    }

    public String getSeverity(){
        return severity;
    }






}
