import application.CollectionDuplicator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionDuplicatorTest {
    private List<Integer> list = new ArrayList<>();
    private List<Integer> duplicated = new ArrayList<>();

    @Before
    public void setList(){
        list.add(1);
        list.add(2);
        list.add(3);

        duplicated.add(1);
        duplicated.add(1);
        duplicated.add(2);
        duplicated.add(2);
        duplicated.add(3);
        duplicated.add(3);
    }

    @Test
    public void duplicate() {
        assertArrayEquals(duplicated.toArray(),new CollectionDuplicator().duplicate(list).toArray());
    }
}