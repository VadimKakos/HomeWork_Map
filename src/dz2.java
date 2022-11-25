import java.util.*;

public class dz2 {
    private static final Map<String, List<Integer>> map1 = new HashMap<>();
    private static final Map<String, Integer> map2 = new HashMap<>();

    public static void main(String[] args) {
        Random random = new Random();

        var list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (int i = 0; i < 3; i++) {
            list1.add(random.nextInt(10));
        }
        var list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (int i = 0; i < 3; i++) {
            list2.add(random.nextInt(10));
        }
        var list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (int i = 0; i < 3; i++) {
            list3.add(random.nextInt(10));
        }

        map1.put("list1", list1);
        map1.put("list2", list2);
        map1.put("list3", list3);

        System.out.println(map1);

        for (var keySet : map1.keySet()) {

            Integer sum = 0;
            List<Integer> list = map1.get(keySet);
            for (Integer integer : list) {
                sum += integer;

            }
            map2.put(keySet, sum);
        }
        System.out.println(map2);
    }
}
