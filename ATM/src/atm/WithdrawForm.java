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
public class WithdrawForm {
    WithdrawForm withdrawForm;
    Scene scene;
    ServiceScreen transactionScreen;
    Stage stage;
    Trasactions transaction;

    public WithdrawForm(Stage stage,Trasactions transaction) {
        this.stage = stage;
        this.transaction = transaction;
    }

    
    
    
    public void drawScene()
     {
        
        Button Done = new Button("Done");
        Button Cancel = new Button("Back");
        Label transactionLabel = new Label();
        Label amountLabel = new Label("Inseret amount:");
        TextField Amount = new TextField();
        
         GridPane grid = new GridPane();
        
        grid.add(Done,1,4);
        grid.add(Cancel,2,4);
        grid.add(transactionLabel,0,1);
        grid.add(Amount,1,0);
        grid.add(amountLabel,0,0);
        
         Done.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
                String amount = Amount.getText();
                
                int dollar = Integer.parseInt(amount);
                int x = transaction.getBalance();
                
                if (dollar>x)
                {
                    transactionLabel.setText("transaction denied");
                   // System.out.println("your balance is "+x);
                }
                else
                {
                
                transactionLabel.setText("Transaction done");  
               
                    transaction.WithDraw(amount);
                //int x = transaction.getBalance();
                
                }
                /* boolean valid = transaction.validate(amount);
             if(valid)
             {
                  transactionLabel.setText("Transaction done");
             }
             else
             {
                transactionLabel.setText("Transaction denied");
                transactionLabel.setFont(new Font ("verdana",14));
                
             }*/
              
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
}
