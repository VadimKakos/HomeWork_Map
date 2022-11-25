import java.util.HashMap;
import java.util.Map;

public class RandomValue {
    private Map<String, Integer> map = new HashMap<>();

    public RandomValue() {
    }

    public void addMap(String key, Integer value) {

        if (!map.containsKey(key)) {
            map.put(key, value);
        }else
        if (map.containsKey(key) && map.get(key).equals(value)) {
            throw new RuntimeException("Такое значение уже есть!");
        }else if (
         (map.containsKey(key) && !value.equals(map.get(key)))) {
            map.put(key, value);
        }
    }

    public Integer get(String value) {

        return map.get(value);
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "RandomValue{" +
                "map=" + map +
                '}';
    }
}
