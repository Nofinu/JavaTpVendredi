package org.example.avril14.Stream.Classes;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private int duration;
    private static int cpt =1;

    public Course(String name, Teacher teacher, int duration) {
        this.id = cpt++;
        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", duration=" + duration +
                '}';
    }
}
