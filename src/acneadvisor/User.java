package acneadvisor;

public class User {
    private String name;
    private String[] skinType;

    public User(String name, String[] skinType){
        this.name = name;
        this.skinType = skinType;
    }

    public String getName(){
        return name;
    }
    public String[] getSkinType(){
        return skinType;
    }



}
