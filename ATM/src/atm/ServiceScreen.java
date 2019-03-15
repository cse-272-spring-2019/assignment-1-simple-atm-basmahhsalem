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
public class ServiceScreen {
    Scene scene;
    ServiceScreen transactionScreen;
    HomeScreen homeScreen;
    Stage stage;
    DepositeForm depositeForm;
    WithdrawForm withdrawForm;
    CurrentBalance balanceInquiry;
    Trasactions transaction;
    HistoryNavigation historyNavigation;
  


    public ServiceScreen(Stage stage,Trasactions transaction) {
        this.stage = stage;
        this.transaction = transaction;
    }
    
    
    public void drawScene()
    {
        Button depositeButton = new Button("     Deposite     ");
        Button withdrawButton = new Button("    With draw     ");
        Button checkBalance = new Button("  Check balance  ");
        Button historyButton = new Button("transaction history");
        
         GridPane grid = new GridPane();
        
        grid.add(depositeButton,1,0);
        grid.add(withdrawButton,1,2);
        grid.add(checkBalance,1,3);
        grid.add(historyButton,1,4);

        
      
       depositeButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
                       stage.setScene(depositeForm.getScene());

        
    }
    
    
});
       withdrawButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            stage.setScene(withdrawForm.getScene());
        
    }
    
    
});
       checkBalance.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            
                 stage.setScene(balanceInquiry.getScene());
        
    }
    
    
});
      historyButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            
                 stage.setScene(historyNavigation.getScene());
        
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

    public void setHistoryNavigation(HistoryNavigation historyNavigation) {
        this.historyNavigation = historyNavigation;
    }
    

   public Scene getScene() {
        return scene;
    } 

   
    
}

