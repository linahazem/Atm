package atm;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class withdraw {
	 Scene scene;
	   Login Gui;
	   trans transaction;
	   Stage stage;
	   mainTransactions objectTrans;
	   double Y;
	   int j=0;
	   ArrayList<Double> myList= new  ArrayList<Double>(5);
	   int index=0;
	   
	   public withdraw (Stage stage,mainTransactions trans) {
			this.stage=stage;
			this.objectTrans=trans;
		}
	   public void showScreen(){
		   Label amount= new Label("Enter the amount you want:");
		   TextField amountField= new TextField();
		   Button zero=new Button("0");
		   Button one=new Button("1");
		   Button two=new Button("2");
		   Button three=new Button("3");
		   Button four=new Button("4");
		   Button five=new Button("5");
		   Button six=new Button("6");
		   Button seven=new Button("7");
		   Button eight=new Button("8");
		   Button nine=new Button("9");
		   Button ok=new Button("Done");
		   Button back=new Button("back");
		   Label message= new Label();

		   GridPane grid = new GridPane();
		   grid.add(amount, 5,1 );
		   grid.add(amountField, 5, 2);
		   grid.add(zero, 2, 5);
		   grid.add(one, 1, 2);
		   grid.add(two, 2, 2);
		   grid.add(three, 3, 2);
		   grid.add(four, 1, 3);
		   grid.add(five, 2, 3);
		   grid.add(six, 3, 3);
		   grid.add(seven, 1, 4);
		   grid.add(eight, 2, 4);
		   grid.add(nine, 3, 4);
		   grid.add(ok, 1, 6);
		   grid.add(back, 3, 6);
		   grid.add(message, 5, 4);
		   grid.setAlignment(Pos.CENTER);
		   grid.setStyle("-fx-background-color : LightSlateGrey;");
           grid.setHalignment(ok, HPos.CENTER);
           grid.setHalignment(back, HPos.CENTER);
           grid.setHalignment(message, HPos.CENTER);
           grid.setHalignment(amount, HPos.CENTER);
           grid.setHalignment(one, HPos.CENTER);
           grid.setHalignment(two, HPos.CENTER);
           grid.setHalignment(three, HPos.CENTER);
           grid.setHalignment(four, HPos.CENTER);
           grid.setHalignment(five, HPos.CENTER);
           grid.setHalignment(six, HPos.CENTER);
           grid.setHalignment(seven, HPos.CENTER);
           grid.setHalignment(eight, HPos.CENTER);
           grid.setHalignment(nine, HPos.CENTER);
           grid.setHalignment(zero, HPos.CENTER);
           zero.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			one.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			two.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			three.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			four.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");	
			five.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			six.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			seven.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			eight.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			nine.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			ok.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			back.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			message.setStyle("-fx-font: normal bold 20px 'serif' ");
			amount.setStyle("-fx-font: normal bold 20px 'serif' ");
			
		   zero.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				amountField.appendText("0");
			}
		});
		   one.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("1");
				}
			});
		   two.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("2");
				}
			});
		   three.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("3");
				}
			});
		   four.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("4");
				}
			});
		   five.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("5");
				}
			});
		   six.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("6");
				}
			});
		   seven.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("7");
				}
			});
		   eight.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("8");
				}
			});
		   nine.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("9");
				}
			});
		   ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				Y=Double.parseDouble(amountField.getText());

			    if(Y<=objectTrans.getBalance()) {
					objectTrans.getWithdraw(Y);
					message.setText("Done Successfully.");
					amountField.clear();
	
				}
				else {
					message.setText("Not enough money to withdraw."+"\nYour balance "+objectTrans.getBalance());
					amountField.clear();
				}			
			
			}
			});
		    back.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					amountField.clear();
					stage.setScene(transaction.getScene());					
				}
			});
		   
		   scene = new Scene(grid,600,400);
	   }
	   
	 
	
	
	public mainTransactions getObjectTrans() {
		return objectTrans;
	}

	public void setObjectTrans(mainTransactions objectTrans) {
		this.objectTrans = objectTrans;
	}

	public trans getTransaction() {
		return transaction;
	}

	public Scene getScene() {
		return scene;
	}
	
	public void setTransaction(trans transaction) {
		this.transaction = transaction;
	}
	
	 
	   
}
