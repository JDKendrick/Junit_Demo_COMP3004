package common;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScreen extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		intUI(primaryStage);
		
	}

	private void intUI(Stage primaryStage) {
		
		Pane canvas = new Pane();
		canvas.setStyle("-fx-background-color: white");
		
		addControlsToCanvas(canvas);
		
		Scene scene = new Scene(canvas, 320 ,300);		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
		
	}

	private void addControlsToCanvas(Pane canvas) {
		
		Label label = new Label("Calculator");
		label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		label.relocate(20, 20);
		
		TextField leftOperandTextBox = new TextField();
		leftOperandTextBox.relocate(20, 60);
		leftOperandTextBox.setMaxWidth(50);
		
		ComboBox<String> operatorTextBox = new ComboBox<String>();
		operatorTextBox.getItems().addAll("+", "-", "*", "/", "%");
		operatorTextBox.setValue("+");
		operatorTextBox.setMaxWidth(60);
		operatorTextBox.relocate(80, 60);
		
		TextField rightOperandTextBox = new TextField();
		rightOperandTextBox.setMaxWidth(50);
		rightOperandTextBox.relocate(145, 60);
		
		Button solution = new Button("=");
		solution.relocate(205, 60);
		
		TextField answerTextBox = new TextField();
		answerTextBox.setMaxWidth(50);
		answerTextBox.relocate(20, 100);
		answerTextBox.setEditable(false);		
		
		solution.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Double leftOperand = Double.valueOf(leftOperandTextBox.getText());
				Double rightOperand = Double.valueOf(rightOperandTextBox.getText());
				String operator = operatorTextBox.getValue();
				
				ArithmeticSolver solver = new ArithmeticSolver();
				
				String answer = String.valueOf(solver.solve(operator, leftOperand, rightOperand));
				
				answerTextBox.setText(answer);
			}
		});
		
		canvas.getChildren().addAll(label, leftOperandTextBox, rightOperandTextBox, operatorTextBox, solution, answerTextBox);
		
	}

	public static void main (String[] args) {
		
		launch(args);
		
	}	
}
