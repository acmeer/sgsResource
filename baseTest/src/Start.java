import java.text.ParseException;
import java.util.HashMap;

public class Start {

    public static void main(String[] args) throws ParseException {

        extendTest<String, Object> map = new extendTest<>();
        map.replace("1", "2");
        System.out.println(map);
    }

    public static class extendTest<K, V> extends HashMap<K, V> {
        @Override
        public V replace(K key, V value) {
            return null;
        }
    }


}
