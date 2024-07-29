package thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CheckThenAct {
    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();

        for(int i=0; i<10000; i++){
            if(map.containsKey("key")){
                map.remove("key");
            }
        }
    }
}
