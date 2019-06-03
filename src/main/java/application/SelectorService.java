package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SelectorService {
    @Autowired
    Selector selector;

    @GetMapping(path = "select-keys-which-values-are-even",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> selectKeysWhichValuesAreEven(Map<String,Integer> map){
        return selector.selectKeysWhichValuesAreEven(map);
    }
}
