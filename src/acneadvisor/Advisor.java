package acneadvisor;

import java.util.List;

public class Advisor {
    public void giveAdvice(User user, AcneStatus status) {
        Recommendation rec = new Recommendation(user, status);
        List<String> tips = rec.getTips();

        System.out.println( user.getName() + "님을 위한 여드름 관리 팁:");
        for (String tip : tips) {
            System.out.println("- " + tip);
        }
    }
}
