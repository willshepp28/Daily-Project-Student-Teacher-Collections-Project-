package com.company;

import java.util.*;

public class Main {

    private int i;

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();






        // create an ArrayList of 15 students which represents all the 1st grade students at an elementary school.
        students.add(new Student("tom", "brown", 1,1));
        students.add(new Student("john", "wright", 2,1));
        students.add(new Student("sarah", "brown", 3,1));
        students.add(new Student("terry", "smalls", 4,1));
        students.add(new Student("brittany", "simmons", 5,1));
        students.add(new Student("jay", "don", 6,1));
        students.add(new Student("jesus", "christ", 7,1));
        students.add(new Student("buddah", "tye", 8,1));
        students.add(new Student("lisa", "greene", 9,1));
        students.add(new Student("tyler", "green", 10,1));
        students.add(new Student("lovely", "hairy", 11,1));
        students.add(new Student("john", "doe", 12,1));
        students.add(new Student("jane", "doe", 13,1));
        students.add(new Student("perry", "davis", 14,1));
        students.add(new Student("tike", "honna", 15,1));






        // Instantiate 3 Teachers
        teachers.add(new Teacher("Bubba", "B", 1, 1));
        teachers.add(new Teacher("Calvin", "Webb", 1, 2));
        teachers.add(new Teacher("Chris", "Nimmons", 1, 3));




        // Code a HashMap that takes a Teacher for a key
        Set<Student> class1 = new HashSet<>();
        Set<Student> class2 = new HashSet<>();
        Set<Student> class3 = new HashSet<>();


        // add class1 students to hashmap
        class1.add(students.get(0));
        class1.add(students.get(1));
        class1.add(students.get(2));
        class1.add(students.get(3));
        class1.add(students.get(4));




        // add class2 students to hashmap
        class2.add(students.get(5));
        class2.add(students.get(6));
        class2.add(students.get(7));
        class2.add(students.get(8));
        class2.add(students.get(9));




        // add class3 students to hashmap
        class3.add(students.get(10));
        class3.add(students.get(11));
        class3.add(students.get(12));
        class3.add(students.get(13));
        class3.add(students.get(14));
        System.out.println(class3);





        Map<Teacher, String> teachersToStudents = new HashMap<>();

        teachersToStudents.put(teachers.get(0), class1.toString());
        teachersToStudents.put(teachers.get(1), class2.toString());
        teachersToStudents.put(teachers.get(2), class3.toString());
//
//
        System.out.println("-------------------");





        // Print out the map keys in a for loop (use the keySet() method). Print out the map values in a for loop (use the values() method).
        //iterating over keys only
        for (Teacher key : teachersToStudents.keySet()) {
            System.out.println("Key = " + key);
        }

        //iterating over values only
        for ( String  value : teachersToStudents.values()) {
            System.out.println("Value = " + value);
        }








    }
}
