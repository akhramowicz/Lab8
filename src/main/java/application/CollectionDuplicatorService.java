package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class CollectionDuplicatorService {
    @Autowired
    CollectionDuplicator collectionDuplicator;

    @GetMapping(path = "duplicate",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> duplicate(List<Integer> collection){
        return collectionDuplicator.duplicate(collection);
    }
}
