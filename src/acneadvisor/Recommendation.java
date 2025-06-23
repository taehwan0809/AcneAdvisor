package acneadvisor;

import java.util.ArrayList;

public class Recommendation {
    private String[] tips;
    private User user;
    private AcneStatus status;

    public Recommendation(User user, AcneStatus status){
        this.user = user;
        this.status = status;
        this.tips = new ArrayList<>();
        generateTips();

    }

    private void generateTips(){

    }



}
