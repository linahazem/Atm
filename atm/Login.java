package atm;
import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Login {
	account acc;
	Scene scene;
	trans transaction;
	Stage stage;
	public Login (Stage stage) {
		this.stage=stage;
	}
	public void mainscreen() {
        
		acc= new account();
		
		Label pincodeLabel= new Label("Enter your pincode:");
		PasswordField pincodeField= new PasswordField();
		Button login=new Button("Login");
		Label validation= new Label();
		Label welcome= new Label("WELCOME TO ATM");
		Label hi= new Label();

		
		GridPane grid = new GridPane();
		grid.add(pincodeLabel, 1, 2);
		grid.add(pincodeField, 1, 3);
		grid.add(login, 1, 4);
		grid.add(validation, 1, 5);
		grid.add(welcome, 1, 0);
		grid.add(hi, 1, 1);


		grid.setAlignment(Pos.CENTER);
		grid.setHalignment(pincodeLabel, HPos.CENTER);
		grid.setHalignment(pincodeField, HPos.CENTER);
		grid.setHalignment(login, HPos.CENTER);
		grid.setHalignment(validation, HPos.CENTER);
		grid.setHalignment(welcome, HPos.CENTER);
        
		grid.setStyle("-fx-background-color : LightSlateGrey;");
		pincodeLabel.setStyle("-fx-font: normal bold 20px  'serif' ");
		validation.setStyle("-fx-font: normal bold 20px 'serif' ");
		welcome.setStyle("-fx-font: normal bold 20px 'serif' ");
		login.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");	

		
		login.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				String pincode=pincodeField.getText();
				boolean valid=acc.Login(pincode);
				if(valid) {
					pincodeField.clear();
					stage.setScene(transaction.getScene());
				}
				else {
					validation.setText("please try again.");
					pincodeField.clear();

				}
			}
		});
		
		scene=new Scene(grid,600,400);
	}
    public Scene getScene() {
    	return this.scene;
    }
	public void setTransaction(trans transaction) {
		this.transaction = transaction;
	}
	
    
}
