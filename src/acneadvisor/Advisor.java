package acneadvisor;

public class Advisor {
    public void giveAdvice(User user, AcneStatus status){
        Recommendation rec = new Recommendation(user,status);
        List<String> tips = rec.getTips();



    }

}
