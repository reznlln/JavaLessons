package main.java.ru.yandex.praktikum.lessons.abstractTest;

public abstract class Person {
    protected String name;
    protected Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Student extends Person{
    private int groupId;
    public Student(String name, int groupId){
        super(name);
        this.groupId = groupId;
    }
}

class Teacher extends Person{
    private int courseId;
    public Teacher(String name, int courseId){
        super(name);
        this.courseId = courseId;
    }
}
