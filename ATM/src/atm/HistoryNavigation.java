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
public class HistoryNavigation {
    HistoryNavigation historyNavigation;
    Stage stage;
    Scene scene;
    ServiceScreen transactionScreen;
    HomeScreen homeScreen;
    DepositeForm depositeForm;
    WithdrawForm withdrawForm;
    CurrentBalance balanceInquiry;
    Trasactions transaction;
   
    
    public HistoryNavigation(Stage stage,Trasactions transaction) {
        this.stage = stage;
        this.transaction = transaction;
    }
    
    
    public void drawScene()
    {
        Button nextButton = new Button("next transaction");
        Button backButton = new Button("previous transaction");
         Button Cancel = new Button("Back");
        Label historyLabel = new Label();
         GridPane grid = new GridPane();
         
         grid.add(nextButton,2,0);
         grid.add(backButton,0,0);
         grid.add(Cancel,1,1);
         grid.add(historyLabel,0,2);
         
           backButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
              int i =  transaction.Geti();
            if(i>0)
            {
                historyLabel.setText(transaction.back());
            }
            else 
            {
               historyLabel.setText("There is no more Transactions "); 
            }
    }
    
    
});
       nextButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            int i =  transaction.Geti();
            int y = transaction.Gety();
            if(i>=y)
            {
                 historyLabel.setText("There is no more Transactions "); 
            }
            else
            {
                historyLabel.setText(transaction.next());
            }
    }
    
    
});
        Cancel.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
           stage.setScene(transactionScreen.getScene());
        
    }
    
    
});
          scene = new Scene (grid,400,400);  }

    public void setHomeScreen(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }

    public void setDepositeForm(DepositeForm depositeForm) {
        this.depositeForm = depositeForm;
    }

    public void setWithdrawForm(WithdrawForm withdrawForm) {
        this.withdrawForm = withdrawForm;
    }

    public void setCurrentBalance(CurrentBalance balanceInquiry) {
        this.balanceInquiry = balanceInquiry;
    }

    public void setServiceScreen(ServiceScreen transactionScreen) {
        this.transactionScreen = transactionScreen;
    }

   public Scene getScene() {
        return scene;
    } 

    
    
}


    

