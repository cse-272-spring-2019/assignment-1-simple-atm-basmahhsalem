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
public class HomeScreen {
   HomeScreen homeScreen;
    Scene scene;
    ATM loginForm;
    Stage stage;
    ServiceScreen transactionScreen;

    public HomeScreen(Stage stage) {
        this.stage = stage;
    }

    /*HomeScreen(Stage primaryStage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    

    
    
    public void drawScene()
    {
       
        Button continueButton = new Button("continue");
        Button cancelButton = new Button("cancel");
        Label welcomeLabel = new Label ("Welcome user !");
         GridPane grid = new GridPane();
        
        grid.add(welcomeLabel,1,0);
       grid.add(continueButton,0,1);
        grid.add(cancelButton,2,1);
        
        cancelButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            stage.setScene(loginForm.getScene());
        
    }
    
    
});
         continueButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
            stage.setScene(transactionScreen.getScene());
        
    }
    
    
});
     scene = new Scene (grid,400,400);  }

    public Scene getScene() {
        return scene;
    }

    public void setATM(ATM loginForm) {
        this.loginForm = loginForm;
    }

    public void setServiceScreen(ServiceScreen transactionScreen) {
        this.transactionScreen = transactionScreen;
    }

    /*void setServiceScreen(ServiceScreen transactionScreen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

  

   

}