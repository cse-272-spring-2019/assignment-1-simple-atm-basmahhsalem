/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author BASMA
 */
public class DepositeForm {
    DepositeForm depositeForm;
    Scene scene;
    ServiceScreen transactionScreen;
    Stage stage;
    Trasactions transaction;
    

    public DepositeForm(Stage stage, Trasactions transaction) {
       this.stage = stage;
       this.transaction = transaction;
    }
    
    
    public void drawScene()
     {
        
        Button Done = new Button("Done");
        Button Cancel = new Button("Back");
        Label Successful= new Label();
        Label amountLabel = new Label("Inseret amount:");
        TextField Amount = new TextField();
        
         GridPane grid = new GridPane();
        
        grid.add(Done,1,4);
        grid.add(Cancel,2,4);
        grid.add(Successful,0,1);
        grid.add(Amount,1,0);
        grid.add(amountLabel,0,0);
        
         Done.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
                String amount = Amount.getText();
                
                Successful.setText("Transaction done");  
                transaction.Deposite(amount);
                /*int x = transaction.getBalance();
                System.out.println("the balance is: "+x);*/
              
    }
    
    
});
          Cancel.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
           stage.setScene(transactionScreen.getScene());
        
    }
    
    
});

scene = new Scene (grid,400,400);  
    }

   public Scene getScene() {
        return this.scene;
    }

    public void setServiceScreen(ServiceScreen transactionScreen) {
        this.transactionScreen = transactionScreen;
    }

    public void setTransaction(Trasactions transaction) {
        this.transaction = transaction;
    
    }

    public Trasactions getTransaction() {
        return transaction;
    }
   
}
