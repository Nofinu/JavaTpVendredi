package org.example.avril14.Stream;

import org.example.avril14.Stream.Classes.Course;
import org.example.avril14.Stream.Classes.Student;
import org.example.avril14.Stream.Classes.Teacher;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {
    public static void main() {
        Teacher teacher1 = new Teacher("John Doe","Mathematics",2010);
        Teacher teacher2 = new Teacher("JJane Smith","Physics",2015);
        Teacher teacher3 = new Teacher("Michael Johnson","Chemistery",2005);
        Teacher teacher4 = new Teacher("Michel Papin","Informatique",2003);

        List<Teacher> teachers = Arrays.asList(teacher1,teacher2,teacher3,teacher4);

        Course course1 = new Course("Calculus",teacher1,15);
        Course course2 = new Course("Mechanics",teacher2,10);
        Course course3 = new Course("Organic Chemistry",teacher3,12);
        Course course4  = new Course("Java",teacher4,12);

        List<Course> courses = Arrays.asList(course1,course2,course3,course4);

        Student student1 = new Student("Alice Smith",18);
        Student student2 = new Student("Bob Johnson",20);
        Student student3 = new Student("Charlie Williams",19);
        Student student4 = new Student("David Brown",21);
        Student student5 = new Student("Eve Jones",22);

        student1.addCourse(course1);
        student1.addCourse(course2);

        student2.addCourse(course3);
        student2.addCourse(course1);

        student3.addCourse(course4);
        student3.addCourse(course3);
        student3.addCourse(course1);

        student4.addCourse(course3);
        student4.addCourse(course1);
        student4.addCourse(course2);
        student4.addCourse(course4);

        student5.addCourse(course1);
        student5.addCourse(course3);
        student5.addCourse(course2);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);


        //student age>20
        List<Student>student20 = students.stream()
                .filter(s -> s.getAge()>20)
                .collect(Collectors.toList());
        System.out.println(student20);

        // name teacher
        List<String> nameTeacher = teachers.stream()
                .map(Teacher::getName)
                .collect(Collectors.toList());
        System.out.println(nameTeacher);

        //subject teacher
        List<String> subjectTeacher = teachers.stream()
                .map(Teacher::getDepartement)
                .collect(Collectors.toList());
        System.out.println(subjectTeacher);

        //list teacher
        List<Teacher> teacherByCourse = courses.stream()
                .map(Course::getTeacher)
                .collect(Collectors.toList());
        System.out.println(teacherByCourse);

        //somme duree courses
        List<Integer> listeDuree =  courses.stream()
                .map(Course::getDuration)
                .collect(Collectors.toList());
        int duree =0;
        for (int d:listeDuree) {
            duree+=d;
        }
        System.out.println(duree);

        //cours + 11h
        List<Course> cours11 = courses.stream()
                .filter(c -> c.getDuration()>11)
                .sorted(Comparator.comparing(Course::getName))
                .collect(Collectors.toList());
        System.out.println(cours11);

        //regrouper Student par age
        Map<Integer,Student> studentMap =new HashMap<>();
        students.stream()
                .forEach(s -> studentMap.put(s.getAge(),s));
        System.out.println(studentMap);


        //CourseByStudents
        List<Course> CourseByStudents = students.stream()
                .flatMap(s->s.getCourse().stream())
                .collect(Collectors.toList());
        System.out.println(CourseByStudents);

        //cours + 12h
        List<Course> cours12 = courses.stream()
                .filter(c -> c.getDuration()>12)
                .sorted(Comparator.comparing(Course::getName))
                .collect(Collectors.toList());
        System.out.println(cours12);

        //teacherByYear
        Map<Integer,Teacher> teacherByYear = new HashMap<>();
        teachers.stream().forEach(t -> teacherByYear.put(t.getStratDate(),t));
        System.out.println(teacherByYear);

        //courseStudent1820
        List<Course> courseStudent1820 = students.stream()
                .filter(s -> s.getAge()<=20 && s.getAge()>=18)
                .flatMap(s -> s.getCourse().stream())
                .distinct()
                .sorted(Comparator.comparing(Course::getName))
                .collect(Collectors.toList());
        System.out.println(courseStudent1820);
    }
}
