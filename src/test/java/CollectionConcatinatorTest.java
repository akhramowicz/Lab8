import application.CollectionConcatenator;
import application.Student;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionConcatinatorTest {

    List<Student> studentList1 = new ArrayList<>();
    List<Student> studentList2 = new ArrayList<>();
    List<Student> expected = new ArrayList<>();
    @Before
    public void setUp(){
        studentList1.add(new Student("Ivan"));
        studentList1.add(new Student("Dima"));
        studentList1.add(new Student("Petya"));

        studentList2.add(new Student("Lol"));
        studentList2.add(new Student("Kek"));
        studentList2.add(new Student("Cheburek"));

        expected.addAll(studentList1);
        expected.addAll(studentList2);
    }

    @org.junit.Test
    public void concatinate() {
        CollectionConcatenator concatenator = new CollectionConcatenator();
        List<Student> actual = concatenator.concatenate(studentList1,studentList2);
        assertArrayEquals(actual.toArray(),expected.toArray());
    }
}