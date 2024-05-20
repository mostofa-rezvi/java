package pkg27.testgenerics;

import java.util.LinkedList;

public class TestGenerics {

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Student s1 = new Student("Towhid", 1281524);
        Student s2 = new Student("agasdfg", 1281359);
        Student s3 = new Student("r6ftgybu", 2859645);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);

        LinkedList<Teacher> teachers = new LinkedList<>();

        Teacher t1 = new Teacher(40, 4000.00, "gbfgh", 4532);
        teachers.add(t1);
        System.out.println(teachers);
    }

}
