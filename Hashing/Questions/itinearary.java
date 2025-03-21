import java.util.HashMap;

public class itinearary{
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("Chennai", "Beng");
        map.put("Mumbai", "Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start = getStart(map);

        while(map.containsKey(start)){
            System.out.println(start);
            start = map.get(start);
        }
        
        System.out.println(start);
    }
    public static String getStart(HashMap<String, String> tick){
        HashMap <String, String> revMap = new HashMap<>();
        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}