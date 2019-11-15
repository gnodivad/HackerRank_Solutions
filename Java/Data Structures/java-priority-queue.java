import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    public int compareTo(Student student) {
        if (this.getCGPA() > student.getCGPA()) {
            return -1;
        } else if (this.getCGPA() < student.getCGPA()) {
            return 1;
        } else {
            if (this.getName() != student.getName()) {
                return this.getName().compareTo(student.getName());
            } else {
                if (this.getID() > student.getID()) {
                    return 1;
                } else if (this.getID() < student.getID()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();

        for (int i = 0; i < events.size(); i++) {
            String[] eventDetails = events.get(i).split(" ");
            if (eventDetails[0].equals("ENTER")) {
                studentPriorityQueue.add(new Student(
                    Integer.parseInt(eventDetails[3]), 
                    eventDetails[1], 
                    Double.parseDouble(eventDetails[2])    
                ));
            } else {
                if (!studentPriorityQueue.isEmpty()) {
                    studentPriorityQueue.remove();                
                }
            }
        }

        List<Student> students = new ArrayList();
        while (!studentPriorityQueue.isEmpty()) {
            students.add(studentPriorityQueue.remove());
        }

        return students;
    }
}

