package org.example.avril14.Stream.Classes;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<Course> course;
    private static int cpt =1;

    public Student( String name, int age) {
        this.id = cpt++;
        this.name = name;
        this.age = age;
        this.course = new ArrayList<>();
    }

    public void addCourse (Course course){
        this.course.add(course);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
