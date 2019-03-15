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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author BASMA
 */
public class CurrentBalance {
    CurrentBalance balanceInquiry;
    Scene scene;
    ServiceScreen transactionScreen;
    Stage stage;
    Trasactions transaction;
    
    public CurrentBalance(Stage stage,Trasactions transaction) {
        this.stage = stage;
        this.transaction = transaction;
    }
    public void drawScene()
     { 
         Label balanceLabel = new Label();
         Button okayButton = new Button("okay");
          Button Cancel = new Button("Back");

         
          GridPane grid = new GridPane();
        
        grid.add(balanceLabel,0,0);
        grid.add(okayButton,0,1);
         grid.add(Cancel,2,1);
        
     
     
  okayButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            //transaction.currentBalance();
                int x = transaction.currentBalance();
               balanceLabel.setText("your current balance is "+x); 
        
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

