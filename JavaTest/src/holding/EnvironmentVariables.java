package holding;

import java.util.Map;

/**
 * Created by King on 2016/2/3.
 */
public class EnvironmentVariables {
    public static void main(String[] args){
        for (Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
