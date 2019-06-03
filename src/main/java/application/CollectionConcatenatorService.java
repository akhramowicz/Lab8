package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
public class CollectionConcatenatorService {
    @Autowired
    CollectionConcatenator collectionConcatenator;

    @GetMapping(path = "concatinate",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> method(Collection<Student> collection1, Collection<Student> collection2){
        return collectionConcatenator.concatenate(collection1,collection2);
    }
}
