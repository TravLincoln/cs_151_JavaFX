package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Student> students = new ArrayList<>();
        VBox vb = new VBox();
        students.add(new Student("Travis",1234,"SE"));
        students.add(new Student("Travis",1234,"SE"));

        for(Student s: students){
            vb.getChildren().add(getStudent(s));
        }


        BorderPane bp = new BorderPane();
        bp.setCenter(vb);


        Scene scene = new Scene(bp, 320, 240,Color.LIGHTYELLOW);
        stage.setTitle("MyShapes with JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class Student{
        public String name;

        public Student(String name, int studentID, String major) {
            this.name = name;
            this.studentID = studentID;
            this.major = major;
        }

        public int studentID;

        public String major;
    }

    private VBox getStudent(Student s){
        VBox student = new VBox();
        student.getChildren().add(new Text("Name : " +s.name));
        student.getChildren().add(new Text("ID : "+s.studentID));
        student.setBackground(new Background(new BackgroundFill(Color.HONEYDEW,null, null)));
        student.setPadding(new Insets(10));
        student.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED, null,null)));
        student.setStyle("-fx-background-color: yellow");
        return student;
    }



}