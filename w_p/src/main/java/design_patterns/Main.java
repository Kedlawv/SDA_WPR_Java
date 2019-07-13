package design_patterns;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> config = ConfigHelper.getInstance().getConfig();
        System.out.println(config.get("log.tag"));
    }

}
