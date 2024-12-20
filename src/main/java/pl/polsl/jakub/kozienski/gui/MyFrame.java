/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.polsl.jakub.kozienski.gui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import pl.polsl.jakub.kozienski.controller.GradebookController;
import pl.polsl.jakub.kozienski.view.GradebookView;
import pl.polsl.jakub.kozienski.model.*;


import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;


/**
 * Class that represent initializes the main application frame.
 * @author Jakub
 */
public class MyFrame extends javax.swing.JFrame {
    GradebookModel model;
    GradebookView view;
    GradebookController controller;
    
    /**
     * Creates and initializes the main application frame.
     * This frame is the primary user interface window, holding references to 
     * the 3 MVC components: model, view, controller.
     * @param model the data model for managing gradebook data
     * @param view the view component responsible for displaying data
     * @param controller the controller component that handles user actions 
     */
     
     
   public MyFrame(GradebookModel model,GradebookView view, GradebookController controller ) {
        this.model = model;
        this.view = view;
        this.controller = controller;
        
        initComponents();
         for (Subject subject : Subject.values()) {
            subjectComboBox.addItem(subject);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        displayAssignmentsButton = new javax.swing.JButton();
        displayAverageButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        displayAllStudentsButton = new javax.swing.JButton();
        removeStudentButton = new javax.swing.JButton();
        addAssignmentGradeButton = new javax.swing.JButton();
        addExamGradeButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        operationHistory = new javax.swing.JButton();
        subjectComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dziennik ocen - Jakub Kozieński");
        setBackground(new java.awt.Color(200, 200, 200));
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titlePanel.setBackground(new java.awt.Color(0, 102, 102));

        separator.setForeground(new java.awt.Color(255, 255, 255));
        separator.setAlignmentX(20.0F);
        separator.setAlignmentY(20.0F);

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("DZIENNIK");

        titleLabel1.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel1.setText("OCEN");

        menuPanel.setBackground(new java.awt.Color(215, 215, 215));
        menuPanel.setForeground(new java.awt.Color(215, 215, 215));

        displayAssignmentsButton.setBackground(new java.awt.Color(0, 86, 86));
        displayAssignmentsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        displayAssignmentsButton.setForeground(new java.awt.Color(255, 255, 255));
        displayAssignmentsButton.setMnemonic('7');
        displayAssignmentsButton.setText("Wyswietl zadania studenta");
        displayAssignmentsButton.setToolTipText("Wyswietla zadania wybranego studenta");
        displayAssignmentsButton.setPreferredSize(new java.awt.Dimension(300, 50));
        displayAssignmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAssignmentsButtonActionPerformed(evt);
            }
        });

        displayAverageButton.setBackground(new java.awt.Color(0, 86, 86));
        displayAverageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        displayAverageButton.setForeground(new java.awt.Color(255, 255, 255));
        displayAverageButton.setMnemonic('6');
        displayAverageButton.setText("Wyswietl srednia studenta");
        displayAverageButton.setToolTipText("Wyswietla srednia wybranego studenta");
        displayAverageButton.setPreferredSize(new java.awt.Dimension(300, 50));
        displayAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAverageButtonActionPerformed(evt);
            }
        });

        addStudentButton.setBackground(new java.awt.Color(0, 86, 86));
        addStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        addStudentButton.setMnemonic('1');
        addStudentButton.setText("Dodaj studenta");
        addStudentButton.setToolTipText("Dodaje studenta do dziennika");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        displayAllStudentsButton.setBackground(new java.awt.Color(0, 86, 86));
        displayAllStudentsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        displayAllStudentsButton.setForeground(new java.awt.Color(255, 255, 255));
        displayAllStudentsButton.setMnemonic('5');
        displayAllStudentsButton.setText("Wyswietl wszystkich studentow");
        displayAllStudentsButton.setToolTipText("Wyswietla wszystkich studentow w dzienniku");
        displayAllStudentsButton.setPreferredSize(new java.awt.Dimension(300, 50));
        displayAllStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllStudentsButtonActionPerformed(evt);
            }
        });

        removeStudentButton.setBackground(new java.awt.Color(0, 86, 86));
        removeStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        removeStudentButton.setMnemonic('4');
        removeStudentButton.setText("Usun studenta");
        removeStudentButton.setToolTipText("Usuwa wybranego studenta");
        removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentButtonActionPerformed(evt);
            }
        });

        addAssignmentGradeButton.setBackground(new java.awt.Color(0, 86, 86));
        addAssignmentGradeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addAssignmentGradeButton.setForeground(new java.awt.Color(255, 255, 255));
        addAssignmentGradeButton.setMnemonic('3');
        addAssignmentGradeButton.setText("Dodaj ocene z zadania");
        addAssignmentGradeButton.setToolTipText("Dodaje studentowi ocene z przypisanego zadania");
        addAssignmentGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssignmentGradeButtonActionPerformed(evt);
            }
        });

        addExamGradeButton.setBackground(new java.awt.Color(0, 86, 86));
        addExamGradeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addExamGradeButton.setForeground(new java.awt.Color(255, 255, 255));
        addExamGradeButton.setMnemonic('2');
        addExamGradeButton.setText("Dodaj ocene z egzaminu");
        addExamGradeButton.setToolTipText("Dodaje studentowi ocene z egzaminu");
        addExamGradeButton.setActionCommand("");
        addExamGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamGradeButtonActionPerformed(evt);
            }
        });

        quitButton.setBackground(new java.awt.Color(0, 86, 86));
        quitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 255, 255));
        quitButton.setMnemonic('0');
        quitButton.setText("Wyjdz");
        quitButton.setToolTipText("");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        operationHistory.setBackground(new java.awt.Color(0, 86, 86));
        operationHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        operationHistory.setForeground(new java.awt.Color(255, 255, 255));
        operationHistory.setMnemonic('?');
        operationHistory.setText("?");
        operationHistory.setPreferredSize(new java.awt.Dimension(40, 40));
        operationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                            .addComponent(displayAssignmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(121, Short.MAX_VALUE))
                        .addGroup(menuPanelLayout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operationHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(177, Short.MAX_VALUE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayAverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayAllStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addExamGradeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addAssignmentGradeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(121, Short.MAX_VALUE))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addExamGradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addAssignmentGradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayAllStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayAverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayAssignmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operationHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        subjectComboBox.setVisible(false);
        subjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(titleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(separator))
                        .addGap(26, 26, 26))
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        String firstName = JOptionPane.showInputDialog(this, "Podaj imie studenta:");
        if (firstName == null || firstName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Imie nie moze byc puste.", "Blad", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String lastName = JOptionPane.showInputDialog(this, "Podaj nazwisko studenta:");
        if (lastName == null || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nazwisko nie moze byc puste.", "Blad", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String studentIdStr = JOptionPane.showInputDialog(this, "Podaj ID studenta:");
        if (studentIdStr == null || studentIdStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID studenta nie moze byc puste.", "Blad", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            int studentId = Integer.parseInt(studentIdStr);
            if (controller.getStudentById(studentId) != null) {
                JOptionPane.showMessageDialog(this, "Student o podanym ID juz istnieje.", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            controller.addStudent(firstName, lastName, studentId);
            JOptionPane.showMessageDialog(this, "Student zostal dodany pomyslnie.");
            model.addOperationHistory("Dodano studenta");

           
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID studenta musi byc liczba.", "Blad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void displayAllStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllStudentsButtonActionPerformed
        List<Student> students = controller.getAllStudents();

        String[] columnNames = {"Id", "Imie", "Nazwisko", "Oceny"};
        Object[][] data = new Object[students.size()][4];

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            data[i][0] = student.getStudentId();
            data[i][1] = student.getFirstName();
            data[i][2] = student.getLastName();

            List<Grade> grades = student.getGrades();
            StringBuilder gradesBuilder = new StringBuilder();

            for (Grade grade : grades) {
                gradesBuilder.append(grade.getValue()).append(", ");
            }

            if (gradesBuilder.length() > 0) {
                gradesBuilder.setLength(gradesBuilder.length() - 2);
            }

            data[i][3] = gradesBuilder.toString();
        }

        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);

        JFrame tableFrame = new JFrame("Lista studentów z ocenami");
        tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableFrame.add(scrollPane);
        tableFrame.setSize(900, 200);
        tableFrame.setLocationRelativeTo(this);
        tableFrame.setVisible(true);
        
        model.addOperationHistory("Wyswietlono liste wszystkich studentow");
    }//GEN-LAST:event_displayAllStudentsButtonActionPerformed

    private void addExamGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamGradeButtonActionPerformed
       
        try {
            String studentIdStr = JOptionPane.showInputDialog(this, "Podaj ID studenta:");
            int studentId = Integer.parseInt(studentIdStr);
            if (controller.getStudentById(studentId) == null) {
                JOptionPane.showMessageDialog(this, "Student o podanym ID nie istnieje.", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            subjectComboBox.setVisible(true);
            Subject selectedSubject = null;
            int result = JOptionPane.showConfirmDialog(
                null,
                subjectComboBox,
                "Wybierz przedmiot",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );
            
            if (result == JOptionPane.OK_OPTION) {
                selectedSubject = (Subject) subjectComboBox.getSelectedItem();
            }
            
            String gradeValueStr = JOptionPane.showInputDialog(this, "Podaj ocene (np. 4.5):");
            double gradeValue = Double.parseDouble(gradeValueStr);
            if (gradeValue < 1 || gradeValue > 6) {
                throw new InvalidGradeException("Ocena moze wynosic jedynie miedzy 1.0 a 6.0!");
            }

            String submissionDate = JOptionPane.showInputDialog(this, "Podaj date dodania oceny (format: yyyy-mm-dd):");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            dateFormat.setLenient(false); 
            try {
                dateFormat.parse(submissionDate); 
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Data musi byc w formacie yyyy-mm-dd!", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String examType = JOptionPane.showInputDialog(this, "Podaj typ egzaminu: (np. Koncowy, Poprawkowy)");

            String maxPointsStr = JOptionPane.showInputDialog(this, "Podaj maksymalna liczbe punktow:");
            int maxPoints = Integer.parseInt(maxPointsStr);

            String pointsScoredStr = JOptionPane.showInputDialog(this, "Podaj liczbe zdobytych punktów:");
            int pointsScored = Integer.parseInt(pointsScoredStr);

            controller.addGradeExamToStudent(studentId, selectedSubject, gradeValue, submissionDate, examType, maxPoints, pointsScored);

            JOptionPane.showMessageDialog(this, "Ocena egzaminu dodana pomyslnie!");
            model.addOperationHistory("Dodano ocene z egzaminu");


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID studenta, maksymalna liczba punktów i liczba zdobytych punktów musza byc liczbami!", "Blad", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidGradeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Blad oceny", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Wystapil dlad przy dodawaniu oceny egzaminu: " + e.getMessage(), "Blad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addExamGradeButtonActionPerformed

    private void addAssignmentGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAssignmentGradeButtonActionPerformed
      
        try {
            String studentIdStr = JOptionPane.showInputDialog(this, "Podaj ID studenta:");
            int studentId = Integer.parseInt(studentIdStr);
            if (controller.getStudentById(studentId) == null) {
                JOptionPane.showMessageDialog(this, "Student o podanym ID nie istnieje.", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }

            subjectComboBox.setVisible(true);
            Subject selectedSubject = null;
            int result = JOptionPane.showConfirmDialog(
                null,
                subjectComboBox,
                "Wybierz przedmiot",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );
            
            if (result == JOptionPane.OK_OPTION) {
                selectedSubject = (Subject) subjectComboBox.getSelectedItem();
            }

            String gradeValueStr = JOptionPane.showInputDialog(this, "Podaj ocene (np. 4.5):");
            double gradeValue = Double.parseDouble(gradeValueStr);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String submissionDate = JOptionPane.showInputDialog(this, "Podaj date dodania oceny (format: yyyy-mm-dd):");
            try {
                dateFormat.parse(submissionDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Data musi byc w formacie yyyy-mm-dd!", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
          
            String assignmentTitle = JOptionPane.showInputDialog(this, "Podaj nazwe zadania:");

            controller.addGradeAssignmentToStudent(studentId, selectedSubject, gradeValue, submissionDate, assignmentTitle);

            JOptionPane.showMessageDialog(this, "Ocena z zadania dodana pomyslnie!");
            model.addOperationHistory("Dodano ocene z zadania");


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID studenta i ocena musza byc liczbami!", "Blad", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Wystapil blad przy dodawaniu oceny zadania: " + e.getMessage(), "Blad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addAssignmentGradeButtonActionPerformed

    private void removeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentButtonActionPerformed
        try {
            String studentIdStr = JOptionPane.showInputDialog(this, "Podaj ID studenta do usuniecia:");
            int studentId = Integer.parseInt(studentIdStr);
            if (controller.getStudentById(studentId) == null) {
                JOptionPane.showMessageDialog(this, "Student o podanym ID nie istnieje.", "Blad", JOptionPane.ERROR_MESSAGE);
                return;
            }

            controller.removeStudent(studentId);

            JOptionPane.showMessageDialog(this, "Student zostal pomyslnie usuniety!");
            model.addOperationHistory("Usunieto studenta");


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID studenta musi bya liczbc!", "Blad", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Wystapil blad przy usuwaniu studenta: " + e.getMessage(), "Blad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeStudentButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
    }//GEN-LAST:event_quitButtonActionPerformed

    private void displayAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAverageButtonActionPerformed
        
       List<Student> students = controller.getAllStudents().stream()
        .sorted((student1, student2) -> Double.compare(student2.calculateAverageGrade(), student1.calculateAverageGrade()))
        .toList();
        
        String[] columnNames = {"Id", "Imie", "Nazwisko", "Srednia"};
        Object[][] data = new Object[students.size()][4];

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            data[i][0] = student.getStudentId();
            data[i][1] = student.getFirstName();
            data[i][2] = student.getLastName();
            data[i][3] = student.calculateAverageGrade();
        }

        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);

        JFrame tableFrame = new JFrame("Lista studentów ze srednia ocen");
        tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableFrame.add(scrollPane);
        tableFrame.setSize(900, 200);
        tableFrame.setLocationRelativeTo(this);  
        tableFrame.setVisible(true);
        model.addOperationHistory("Wyswietlono liste srednich ocen");

    }//GEN-LAST:event_displayAverageButtonActionPerformed

    private void displayAssignmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAssignmentsButtonActionPerformed
    
    List<Student> students = controller.getAllStudents();
    
    String[] columnNames = {"Id", "Imie", "Nazwisko","Zadania"};
    Object[][] data = new Object[students.size()][4];

    for (int i = 0; i < students.size(); i++) {
        Student student = students.get(i);
        data[i][0] = student.getStudentId(); 
        data[i][1] = student.getFirstName();  
        data[i][2] = student.getLastName();   

        List<Grade> grades = student.getGrades();
        StringBuilder assignmentsBuilder = new StringBuilder();

        for (Grade grade : grades) {
            if (grade instanceof AssignmentGrade) {
                AssignmentGrade assignmentGrade = (AssignmentGrade) grade;
                assignmentsBuilder.append(assignmentGrade.getSubject()).append(": ").append(assignmentGrade.getAssignmentTitle()).append(" - ocena: ").append(assignmentGrade.getValue()).append(", ");  
            }
        }

        if (assignmentsBuilder.length() > 0) {
            assignmentsBuilder.setLength(assignmentsBuilder.length() - 2);
        }
        data[i][3] = assignmentsBuilder.toString();
    }

    JTable table = new JTable(data, columnNames);
    table.setFillsViewportHeight(true);

    JScrollPane scrollPane = new JScrollPane(table);

    JFrame tableFrame = new JFrame("Lista studentów z przypisanymi zadaniami");
    tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    tableFrame.add(scrollPane);
    tableFrame.setSize(900, 200);
    tableFrame.setLocationRelativeTo(this);  
    tableFrame.setVisible(true);  
    
    model.addOperationHistory("Wyswietlono liste wszystkich zadan studentow");

    }//GEN-LAST:event_displayAssignmentsButtonActionPerformed

    private void operationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationHistoryActionPerformed

        List<OperationHistory> operationHistoryList = model.getOperationHistoryList();

        String[] columnNames = {"Id", "Opis", "Czas wykonania"};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Object[][] data = new Object[operationHistoryList.size()][3];
        for (int i = 0; i < operationHistoryList.size(); i++) {
            OperationHistory operation = operationHistoryList.get(i);
            data[i][0] = i + 1; 
            data[i][1] = operation.operation();
            data[i][2] = operation.timestamp().format(formatter); 
        }

        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame tableFrame = new JFrame("Historia Operacji");
        tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableFrame.add(scrollPane);
        tableFrame.setSize(500, 200);
        tableFrame.setLocationRelativeTo(this);
        tableFrame.setVisible(true);
    }//GEN-LAST:event_operationHistoryActionPerformed

    private void subjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboBoxActionPerformed
       
        
    }//GEN-LAST:event_subjectComboBoxActionPerformed

   /**
     * Parameters for the application: 
     * 1. First Name - the first name of the student 
     * 2. Last Name  - the last name of the student 
     * 3. Student Id  - the unique ID of the student 
     * Example Jakub Kozienski 13
     *
     * @param args firstName lastName studentId
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        GradebookModel model = new GradebookModel();
        GradebookView view = new GradebookView(model);
        GradebookController controller = new GradebookController(model, view);

        if (args.length == 3) {
            String firstName = args[0];
            String lastName = args[1];
            String studentId = args[2];
            controller.addStudent(firstName, lastName, Integer.parseInt(studentId));
        }
       
        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame(model, view, controller).setVisible(true);
                
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAssignmentGradeButton;
    private javax.swing.JButton addExamGradeButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton displayAllStudentsButton;
    private javax.swing.JButton displayAssignmentsButton;
    private javax.swing.JButton displayAverageButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton operationHistory;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton removeStudentButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JComboBox<Subject> subjectComboBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
