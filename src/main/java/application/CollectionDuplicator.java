package application;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class CollectionDuplicator {
    public List<Integer> duplicate(List<Integer> collection){
        List<Integer> duplicated = new ArrayList<>();

        IntStream.range(0,collection.size()).forEach(idx->duplicated.addAll(new ArrayList<Integer>(){{
            add(collection.get(idx));
            add(collection.get(idx));
        }}));
        return duplicated;

    }
}
