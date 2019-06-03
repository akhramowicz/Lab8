package application;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Selector {
    public List<String> selectKeysWhichValuesAreEven(Map<String, Integer> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (isEven(entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    private boolean isEven(Integer value) {
        return value % 2 == 0 ? true : false;
    }

}
