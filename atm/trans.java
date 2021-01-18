package atm;
import java.security.Principal;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Enumeration;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class trans {
	   Scene scene;
	   Login Gui;
	   Stage stage;
	   withdraw with;
	   deposit dep;
	   mainTransactions objectTrans;
	   
	   int index=0;
	   
	   double output1;
	   public trans (Stage stage, mainTransactions trans) {
			this.stage=stage;
			this.objectTrans=trans;
		}
       	   	   
	   public void showScreen() {
		   GridPane grid= new GridPane();
	
		   grid.setHgap(50);
		   grid.setVgap(20);
		   grid.setAlignment(Pos.CENTER);
		   
		   Label welcome=new Label("Welcome To Your Account.");
		   Label Output=new Label();
		   Label Output2=new Label();
		   Label Output3=new Label();
		   Button withdraw=new Button("Withdraw");
		   Button deposit=new Button("Deposit");
		   Button balance=new Button("Balance");
		   Button next=new Button("Next");
		   Button previous=new Button("Previous");
 
		   GridPane.setConstraints(welcome, 1, 0);
		   GridPane.setConstraints(balance, 0, 1);
		   GridPane.setConstraints(withdraw, 1, 1);
		   GridPane.setConstraints(deposit, 2, 1);
		   GridPane.setConstraints(next, 0, 2);
		   GridPane.setConstraints(previous, 2, 2);
		   GridPane.setConstraints(Output, 0, 3); 
		   GridPane.setConstraints(Output2, 2, 3);
		   GridPane.setConstraints(Output3, 1, 3);
			grid.setStyle("-fx-background-color : LightSlateGrey;");
			grid.setHalignment(balance, HPos.CENTER);
			grid.setHalignment(withdraw, HPos.CENTER);
			grid.setHalignment(deposit, HPos.CENTER);
			grid.setHalignment(next, HPos.CENTER);
			grid.setHalignment(previous, HPos.CENTER);
			grid.setHalignment(Output, HPos.CENTER);
			grid.setHalignment(Output2, HPos.CENTER);
			grid.setHalignment(Output3, HPos.CENTER);
			balance.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			withdraw.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			deposit.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			next.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			previous.setStyle("-fx-background-color : DimGray;-fx-text-fill: white;");
			Output.setStyle("-fx-font: normal bold 20px 'serif' ");
			Output2.setStyle("-fx-font: normal bold 20px 'serif' ");
			Output3.setStyle("-fx-font: normal bold 20px 'serif' ");
			welcome.setStyle("-fx-font: normal bold 20px 'serif' ");
		

		   grid.getChildren().addAll(welcome,balance,withdraw,deposit,next,previous,Output,Output2,Output3);
           
		  
		  next.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
              
				if(objectTrans.amounts.size() > index ) {
				    if(objectTrans.amounts.size()<=0) {
					    Output.setText("No History");
					    Output2.setText("");
					    Output3.setText("");
				     }
				    else {
				        Output.setText("History:");	
				        Output2.setText(String.valueOf(objectTrans.amounts.get(index)));
				        Output3.setText(String.valueOf(objectTrans.types.get(index)));
				        index++;
				    }
				    }
				else {
					    Output.setText("No  History.");
					    Output2.setText("");
					    Output3.setText("");
				   }
				
				
			}
		});
		  
		  previous.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(objectTrans.amounts.size()>= index ) {	
				if(index<=0) {
					Output.setText("No History");
					Output2.setText("");
					Output3.setText("");
				}
				else {
				Output.setText("History:");		
				Output2.setText(String.valueOf(objectTrans.amounts.get(index-1)));
				Output3.setText(String.valueOf(objectTrans.types.get(index-1)));
				index--;
				}
				}else {
					Output.setText("No History.");
					Output2.setText("");
					Output3.setText("");
				}
				
			}
		});
		  balance.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Output.setText("Your Balance:");		
				output1=objectTrans.getBalance();
				Output3.setText(String.valueOf(output1));
				Output2.setText("");
				
				
			}
		});
		   
		   withdraw.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(with.getScene());
			}
		});
		   deposit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					stage.setScene(dep.getScene());
							                    
                    }
			});
		   
		  
		   scene = new Scene(grid,600,400);
	   }
	  
	public void setDep(deposit dep) {
		this.dep = dep;
	}

	public void setWith(withdraw with) {
		this.with = with;
	}

	public withdraw getWith() {
		return with;
	}

	public deposit getDep() {
		return dep;
	}

	public Scene getScene() {
		return scene;
	}
	public void setGui(Login gui) {
		Gui = gui;
	}
	
}
