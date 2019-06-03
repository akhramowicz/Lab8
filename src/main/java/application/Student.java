package application;

public class Student implements Comparable{
    private String name;
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Object o) {
        return this.name.equals(o) == true ? 1 : 0;
    }
}
