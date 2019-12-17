package Context;


import java.util.HashMap;
import java.util.Map;


public class ScenarioContext {
    private static Map<Keys, Object> scenarioContext = new HashMap<>();

    public ScenarioContext() {
    }

    public static void set(Keys key, Object value) {
        scenarioContext.put(key, value);
    }

    public static Object get(Keys key) {
        return scenarioContext.get(key);
    }

    public static Boolean isContains(Keys key) {
        return scenarioContext.containsKey(key);
    }
}
