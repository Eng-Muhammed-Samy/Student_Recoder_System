
package student_recoder;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Eng muhamed
 */
public class Student_recoder extends Application {
    TextField txt1 = new TextField();
    TextField txt2 = new TextField();
    TextField txt3 = new TextField();
    TextField txt4 = new TextField();
    TextField txt5 = new TextField();
    static ArrayList<Student> students = new ArrayList<Student>();
    private static String path = "student.json";
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        BorderPane.setMargin(grid, new Insets(15, 15, 10, 20));
        root.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,null, new BorderWidths(3))));
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        root.setTop(grid);
        root.setBottom(box);
        
        
         txt1.setFont(Font.font("Arial", FontWeight.THIN, 20));
         txt1.setMinSize(350, 50);
         txt1.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        
         txt2.setFont(Font.font("Arial", FontWeight.THIN, 20));
         txt2.setMinSize(350, 50);
         txt2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        
         txt3.setFont(Font.font("Arial", FontWeight.THIN, 20));
         txt3.setMinSize(350, 50);
         txt3.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        
         txt4.setFont(Font.font("Arial", FontWeight.THIN, 20));
         txt4.setMinSize(350, 50);
         txt4.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        
         txt5.setFont(Font.font("Arial", FontWeight.THIN, 20));
         txt5.setMinSize(350, 50);
         txt5.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         
        Label lbl1 = new Label("ID") ;
         lbl1.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
         lbl1.setMinSize(140, 50);
         lbl1.setPadding(new Insets(0, 0, 0, 10));
         lbl1.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        Label lbl2 = new Label("Name");
         lbl2.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
         lbl2.setMinSize(140, 50);
         lbl2.setPadding(new Insets(0, 0, 0, 10));
         lbl2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        Label lbl3 = new Label("Bench Number");
         lbl3.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
         lbl3.setMinSize(140, 50);
         lbl3.setPadding(new Insets(0, 0, 0, 10));
         lbl3.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        Label lbl4 = new Label("E-mail");
         lbl4.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
         lbl4.setMinSize(140, 50);
         lbl4.setPadding(new Insets(0, 0, 0, 10));
         lbl4.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        Label lbl5 = new Label("Telephone");
         lbl5.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
         lbl5.setMinSize(140, 50);
         lbl5.setPadding(new Insets(0, 0, 0, 10));
         lbl5.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        
        grid.add(lbl1, 0, 0);
        grid.add(txt1, 1, 0);
        grid.add(lbl2, 0, 1);
        grid.add(txt2, 1, 1);
        grid.add(lbl3, 0, 2);
        grid.add(txt3, 1, 2);
        grid.add(lbl4, 0, 3);
        grid.add(txt4, 1, 3);
        grid.add(lbl5, 0, 4);
        grid.add(txt5, 1, 4);
        
       
        
        Button btn1 = new Button("Add Student");
         AddStudent add = new AddStudent();
         btn1.setOnAction(add);
         btn1.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 14));
         btn1.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn1.setMinSize(90, 40);
         btn1.setCursor(Cursor.HAND);
         HBox.setMargin(btn1, new Insets(15, 10, 10,10));
        Button btn2 = new Button("Search");
         Search search = new Search();
         btn2.setOnAction(search);
         btn2.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 14));
         btn2.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn2.setMinSize(90, 40);
         btn2.setCursor(Cursor.HAND);
         HBox.setMargin(btn2, new Insets(15, 10, 10, 10));
        Button btn3 = new Button("Modify");
         Modify modify = new Modify();
         HBox.setMargin(btn3, new Insets(15, 10, 10, 10));
         btn3.setOnAction(modify);
         btn3.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 14));
         btn3.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn3.setMinSize(90, 40);
         btn3.setCursor(Cursor.HAND);
        Button btn4 = new Button("Delete");
        Delete delete = new Delete();
         btn4.setOnAction(delete);
         btn4.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 14));
         btn4.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn4.setMinSize(90, 40);
         btn4.setCursor(Cursor.HAND);
         HBox.setMargin(btn4, new Insets(15, 10, 10, 10));
         Button btn5 = new Button("Clear");
         Clear clear = new Clear();
         btn5.setOnAction(clear);
         btn5.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 14));
         btn5.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn5.setMinSize(90, 40);
         btn5.setCursor(Cursor.HAND);
         HBox.setMargin(btn5, new Insets(15, 10, 10, 10));
         box.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
         Scene scene = new Scene(root, 580, 400);
         
         BorderPane pane = new BorderPane();
         Scene scene2 = new Scene(pane,580,400);
         Button btn =new Button("Student Recoder");
         btn.setMinSize(150, 50);
         btn.setFont(new Font("Tahoma", 16));
         btn.setCursor(Cursor.HAND);
         btn.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         btn.setOnAction((ActionEvent e) -> {
             primaryStage.setScene(scene);
        });   
         Label lbl = new Label("Welcom to Student Recoder to Add \n or Search or Modify or Delete \n please click the Button ...");
         lbl.setFont(new Font("Arial", 20));
         lbl.setTextAlignment(TextAlignment.CENTER);
         lbl.setPadding(new Insets(10));
         lbl.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
         pane.setCenter(lbl);
         pane.setBottom(btn);
         pane.setMargin(btn, new Insets(50,210,130,210));
        primaryStage.setTitle("Student Recoder");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      //  students = Services.loadStudents(path).getStudent();
        launch(args);
    }
    // compleate
    class AddStudent implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) { 
                Student student = new Student();
                student.setId(txt1.getText());
                student.setName(txt2.getText());
                student.setBench_Number(txt3.getText());
                student.setE_mail(txt4.getText());
                student.setTelephone(txt5.getText());
                students.add(student);
                Students std = new Students(students);
		Services.writestudent(std, path);
        }
        
    }
    //complete
    class Search implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            int x = Integer.parseInt(txt1.getText());           
            for (int i = 0; i < students.size(); i++) {
                if(Integer.parseInt(students.get(i).getId()) == x ){
                    txt1.setText(students.get(i).getId());
                    txt2.setText(students.get(i).getName());
                    txt3.setText(students.get(i).getBench_Number());
                    txt4.setText(students.get(i).getE_mail());
                    txt5.setText(students.get(i).getTelephone());
                }
            }

        
         }
    }
    class Modify implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            int x = Integer.parseInt(txt1.getText());   
            Student student = new Student();
            int i ;
            for (i = 0; i < students.size(); i++) {
                if(Integer.parseInt(students.get(i).getId()) == x ){
                    
                     student.setId(txt1.getText());
                     student.setName(txt2.getText());
                     student.setBench_Number(txt3.getText());
                     student.setE_mail(txt4.getText());
                     student.setTelephone(txt5.getText());
                     students.set(i, student);
                }
            }
            
            System.out.println("size: "+ students.size());
            Students std = new Students(students);
	    Services.writestudent(std, path);     
                          
        }
 
    }
    //complete
    class Delete implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            int x = Integer.parseInt(txt1.getText());
            for (int i = 0; i < students.size(); i++) {
                if(Integer.parseInt(students.get(i).getId()) == x){
                    students.remove(i);
                }
            }
            System.out.println(students.size());
            Students std = new Students(students);
            Services.writestudent(std, path);
        }
        
    }
    //complete
    class Clear implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           	txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
    }
}
}
