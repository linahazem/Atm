package atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class app extends Application {
	public static void main(String[] args) {
    	launch(args);
    }
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM");
        Login Gui=new Login(primaryStage);
        mainTransactions object = new mainTransactions();
        trans transaction=new trans(primaryStage,object);
        withdraw with=new withdraw(primaryStage,object);
        deposit dep =new deposit(primaryStage,object);
        
        Gui.setTransaction(transaction);
        transaction.setGui(Gui);
        transaction.setWith(with);
        transaction.setDep(dep);
        with.setTransaction(transaction);
        dep.setTransaction(transaction);
        
        
        Gui.mainscreen();
        transaction.showScreen();
        with.showScreen();
        dep.showScreen();
        
		primaryStage.setScene(Gui.getScene());
		primaryStage.show();		
	}

}
