package opunivrapp;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Academic{
    private String id = "P";
    private static int professorID = 1000001;
    private static List<Professor> professors = new ArrayList<>();

    public Professor(String firsName,String lastName,List<String> courses){
        super(firsName, lastName, courses);
        this.id = id + professorID;
        professorID ++;
    }

    public void addProfessor(Professor professor){
        professors.add(professor);
    }
}
