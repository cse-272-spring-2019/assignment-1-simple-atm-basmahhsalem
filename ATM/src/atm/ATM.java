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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ATM {
    
   loginValidation validation;
   Scene scene;
   HomeScreen homeScreen;
   Stage stage;
    public ATM (Stage stage)
    { 
        this.stage = stage;
    }

    /*ATM(Stage primaryStage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    public void drawScene()
     {
        validation = new loginValidation();
        
        Button enterButton = new Button("click here");
        Label codeLabel = new Label("Pin code: ");
        Label pinLabel = new Label("Pin : ");
        PasswordField codeField = new PasswordField();
        TextField pinField = new TextField();
        Label error = new Label();
        GridPane grid = new GridPane();
        
        grid.add(codeLabel,0,1);
        grid.add(pinLabel,0,0);
        grid.add(codeField,1,1);
        grid.add(pinField,1,0);
        grid.add(enterButton,1,3);
        grid.add(error,1,4);
        enterButton.setOnAction(new EventHandler<ActionEvent>()
        {@Override
            public void handle(ActionEvent event){
                String username = pinField.getText();
                String code = codeField.getText();
             /*if(code.equals("0000"))
             System.out.println("correct code");
             else
             System.out.println("error in code");*/
             boolean valid = validation.validate(code,username);
             if(valid)
             {
                 stage.setScene(homeScreen.getScene());
             }
             else
             {
                error.setText("pin / pin code might be incorrect ");
                error.setFont(new Font ("verdana",14));
                
             }
         }
        });
        
        
        
        {
        }
      scene = new Scene (grid,400,400);  
    }

   public Scene getScene() {
        return this.scene;
    }

    public void setHomeScreen(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }
    
}
