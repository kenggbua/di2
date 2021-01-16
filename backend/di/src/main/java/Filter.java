import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.*;

public class Filter {


    public static void main(String[] args) throws InterruptedException {

        JSONObject result = new JSONObject();

        for (int i = 0; i < 20; i++) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            JSONArray time = new JSONArray();
            JSONObject longi = new JSONObject();
            JSONObject lati = new JSONObject();
            if(i%2 == 0){
                longi.put("longitude", 1);
                lati.put("latitude", 1);
            } else {
                longi.put("longitude", i);
                lati.put("latitude", i);
            }

            time.put(longi);
            time.put(lati);
            result.put(String.valueOf(timestamp.getTime()), time);
            System.out.println(result.toString());
            Thread.sleep(100);
        }
        ArrayList<String> list = new ArrayList<>();
        Iterator<?> keys = result.keys();
        while (keys.hasNext()) {
            list.add((String) keys.next());
        }

        Collections.sort(list);

        JSONArray test = new JSONArray();

        for (String s : list) {
            test.put(result.get(s));
        }

        JSONObject resultFin =  new JSONObject();
        try {
            Field changeMap = resultFin.getClass().getDeclaredField("map");
            changeMap.setAccessible(true);
            changeMap.set(resultFin, new LinkedHashMap<>());
            changeMap.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException ignored) {

        }


        for (int i = 0; i < test.length(); i++) {
            for (int j = 1; j < test.length(); j++) {
                if (test.get(i).toString().equals(test.get(j).toString()) && i != j) {
                    test.remove(j);
                    list.remove(j);
                    j--;
                }
            }
        }

        for (int i = 0; i < test.length(); i++) {
            resultFin.put(list.get(i), test.get(i));
        }

        System.out.println(test.toString());
        System.out.println(list.toString());
        System.out.println(resultFin.toString());

    }
}
