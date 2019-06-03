package application;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class CollectionConcatenator {
    public List<Student> concatenate(Collection<Student> collection1, Collection<Student> collection2){
        return Stream.concat(collection1.stream(),collection2.stream()).collect(Collectors.toList());
    }
}
