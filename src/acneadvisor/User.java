package acneadvisor;

import java.util.List;

public class User {
    private String name;
    private List<String> skinTypes;

    public User(String name, List<String> skinTypes) {
        this.name = name;
        this.skinTypes = skinTypes;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkinTypes() {
        return skinTypes;
    }
}
