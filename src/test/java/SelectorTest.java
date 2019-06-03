import application.Selector;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SelectorTest {

    private Map<String,Integer> map = new HashMap<>();
    private List<String> keysWhichValuesAreEven = new ArrayList<>();

    @Before
    public void setMap(){
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        keysWhichValuesAreEven.add("four");
        keysWhichValuesAreEven.add("two");
    }

    @Test
    public void selectKeysWhichValuesAreEven() {
        assertArrayEquals(keysWhichValuesAreEven.toArray(),new Selector().selectKeysWhichValuesAreEven(map).toArray());
    }
}