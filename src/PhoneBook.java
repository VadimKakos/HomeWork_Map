import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();

    public PhoneBook() {
    }

    public void addPerson(String map, String map1) {
        this.map.put(map, map1);
    }

    public Map<String, String> getMap() {
        return map;

    }

}
