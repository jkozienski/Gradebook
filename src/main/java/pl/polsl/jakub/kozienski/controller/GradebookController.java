/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.controller;

import pl.polsl.jakub.kozienski.view.*;
import pl.polsl.jakub.kozienski.model.*;
import java.util.Scanner;
import java.util.List;
import lombok.*;


/**
 * Controller class for managing interaction between the model and the view.
 * Handles operations related to students and grades, providing feedback to the
 * view.
 *
 * @author Jakub Kozienski
 * @version 1.0
 */
@Getter
public class GradebookController {

    /**
     * Reference to the GradebookModel, containing student and grade data
     */
    private GradebookModel model;

    /**
     * Reference to the GradebookView for displaying messages and data
     */
    private GradebookView view;

    /**
     * Scanner used for reading user input from the console.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Constructs a GradebookController with references to the GradebookModel
     * and GradebookView.
     *
     * @param model the GradebookModel to manage, representing the data
     * structure for storing students and grades
     * @param view the GradebookView to interact with, responsible for
     * displaying messages and output to the user
     */
    public GradebookController(GradebookModel model, GradebookView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Handles command line arguments for adding a student, if correctly
     * provided.
     *
     * @param args an array of command line arguments for a new student,
     * expected to contain first name, last name, and studentId
     */
    private void handleArguments(String[] args) {
        if (args.length == 3) {
            try {
                String firstName = args[0];
                String lastName = args[1];
                int studentId = Integer.parseInt(args[2]);
                this.addStudent(firstName, lastName, studentId);
            } catch (NumberFormatException e) {
                view.displayError("\nID studenta musi byc liczba! Spróbuj ponownie.");
            }
        } else if (args.length > 3) {
            view.displayError("\nZbyt wiele argumentow! Kolejnosc parametrow: imie nazwisko ID (np. Tomasz Nowak 3)");
        } else if (args.length > 0) {
            view.displayError("\nZbyt malo argumentow! Kolejnosc parametrow: imie nazwisko ID (np. Tomasz Nowak 3)");
        }
    }

    /**
     * Adds a new student to the Gradebook and updates the view.
     *
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param studentId the unique identifier for the student
     */
    public void addStudent(String firstName, String lastName, int studentId) {
        Student student = new Student(firstName, lastName, studentId);
        model.addStudent(student);
        //view.displayMessage("\nDodano nowego studenta: " + firstName + " " + lastName + " ID:" + studentId);
    }

    /**
     * Removes a student from the Gradebook by ID and updates the view.
     *
     * @param studentId the unique identifier of the student to remove
     */
    public void removeStudent(int studentId) {
        boolean removed = model.removeStudentById(studentId);
        if (removed) {
            //view.displayMessage("Student o ID " + studentId + " zostal usuniety.");
        } else {
            //view.displayError("Nie znaleziono studenta o ID " + studentId);
        }
    }

    /**
     * Adds an assignment grade to a student by their ID
     *
     * @param studentId the ID of the student receiving the grade
     * @param subject the subject of the assignment
     * @param value the value of the grade
     * @param submissionDate the date of submission
     * @param assignmentTitle the title of the assignment
     */
    public void addGradeAssignmentToStudent(int studentId, Subject subject, double value, String submissionDate, String assignmentTitle) {
        Student student = model.getStudentById(studentId);
        if (student != null) {
            try {
                AssignmentGrade grade = new AssignmentGrade(subject, value, submissionDate, assignmentTitle);
                student.addGrade(grade);
            } catch (InvalidGradeException e) {
                //   System.out.println("Niepoprawna wartosc oceny: " + e.getMessage());
            }
        } else {
            // System.out.println("Student o podanym ID nie istnieje.");
        }
    }

    /**
     * Adds an exam grade to a student by their ID
     *
     * @param studentId the ID of the student receiving the grade
     * @param subject the subject of the exam
     * @param value the value of the grade
     * @param submissionDate the date of submission
     * @param examType the type of exam (e.g., "midterm", "final")
     * @param maxPoints the maximum points possible on the exam
     * @param pointsScored the points scored by the student
     */
    public void addGradeExamToStudent(int studentId, Subject subject, double value, String submissionDate, String examType, int maxPoints, int pointsScored) {
        Student student = model.getStudentById(studentId);
        if (student != null) {
            try {
                ExamGrade grade = new ExamGrade(subject, value, submissionDate, examType, maxPoints, pointsScored);
                student.addGrade(grade);
            } catch (InvalidGradeException e) {
                //  view.displayError("Niepoprawna wartosc oceny: " + e.getMessage());
            }
        }
    }

    /**
     * Calculates and displays the average grade of a student by ID.
     *
     * @param studentId the ID of the student whose average grade to display
     */
    public void displayStudentAverage(int studentId) {
        Student student = model.getStudentById(studentId);
        if (student != null) {
            double average = student.calculateAverageGrade();
        }
    }

    /**
     * Displays the list of all students in the Gradebook through the view.
     */
    public void displayAllStudents() {
        //view.displayAllStudents();
    }

    /**
     * Displays all assignments of a student and updates the view.
     *
     * @param studentId the unique identifier of the student
     */
    public void displayStudentAssignments(int studentId) {
    }

    /**
     * Retrieves the list of students
     *
     * @return list of students in the gradebook
     */
    public List<Student> getAllStudents() {
        return model.getStudents();
    }

    /**
     * Finds student by their ID
     *
     * @param id the Id of the student to find
     * @return the specific student
     */
    public Student getStudentById(int id) {
        return model.getStudentById(id);
    }
}
