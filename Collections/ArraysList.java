package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {

    public static void main(String[] args) {

        List<String> sequence = new ArrayList<>();
        List<Integer> intSequence = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();

        intSequence.add(1);
        intSequence.add(2);
        intSequence.add(3);
        intSequence.add(4);



        sequence.add("Farinon");
        sequence.add("tactic");
        sequence.add("browser");
        sequence.add("history");
        sequence.add("civics");
        sequence.add("politics");

        //To print all the elements in the list together
        for(int i=0; i<sequence.size(); i++){
            System.out.println(sequence.get(i));
        }

        intSequence.add(1);
        intSequence.add(2);
        intSequence.add(3);
        intSequence.add(4);
        intSequence.add(5);
        intSequence.add(6);
        intSequence.add(7);
        intSequence.add(8);
        intSequence.add(9);
        intSequence.add(10);

        for(int i= 0; i<intSequence.size();i++){
            System.out.println(intSequence.get(i));
        }

        Employee e1 = new Employee("123", "Siri");
        Employee e2 = new Employee("456", "Nithin");
        Employee e3 = new Employee("678", "Sumanth");
        Employee e4 = new Employee("782","Charlie");
        Employee e5 = new Employee("007", "Sophie");
        Employee e6 = new Employee("183","peter");

        //Student list creation

        List<Student> studentList= new ArrayList<>();
        Student s1 = new Student(23,"max","2020");
        Student s2 = new Student(22, "peter", "2020");
        Student s3 = new Student(18,"tim","2022");
        Student s4= new Student(21, "carry", "2023");
        Student s5= new Student(19,"harry", "2024");
        Student s6= new Student(17,"goat","2025");
        Student s7 = new Student(16,"payne","2026");
        Student s8= new Student(15,"David", "2027");

        //add students
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);

        //get student data
        System.out.println(studentList.get(0));
        studentList.get(1);
        studentList.get(2);
        studentList.get(3);
        studentList.get(4);
        studentList.get(5);
        studentList.get(6);
        studentList.get(7);


        //To add values in the list
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        //to retrieve values
        employeeList.get(0);
        employeeList.get(1);
        employeeList.get(2);
        employeeList.get(3);
        employeeList.get(4);
        employeeList.get(5);


        //size
        employeeList.size();

    }
}
