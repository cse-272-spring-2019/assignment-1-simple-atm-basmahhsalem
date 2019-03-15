/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author BASMA
 */
public class AutomatedTellerMachine extends Application {
     public static void main(String[] args) {
       launch(args);
    }
     @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Welcome To ATM");
        ATM loginForm;
         loginForm = new ATM (primaryStage);
        HomeScreen homeScreen = new HomeScreen(primaryStage);
        
        Trasactions transaction = new Trasactions();
        ServiceScreen transactionScreen = new ServiceScreen(primaryStage,transaction);
        DepositeForm depositeForm = new DepositeForm (primaryStage,transaction);
        WithdrawForm withdrawForm = new WithdrawForm(primaryStage,transaction );
        CurrentBalance balanceInquiry = new CurrentBalance (primaryStage,transaction );
        HistoryNavigation historyNavigation = new HistoryNavigation(primaryStage,transaction);

        loginForm.setHomeScreen(homeScreen);
        homeScreen.setATM(loginForm);
        homeScreen.setServiceScreen(transactionScreen);
        depositeForm.setServiceScreen(transactionScreen);
        transactionScreen.setDepositeForm(depositeForm);
        transactionScreen.setWithdrawForm(withdrawForm);
        withdrawForm.setServiceScreen(transactionScreen);
        transactionScreen.setCurrentBalance(balanceInquiry);
        balanceInquiry.setServiceScreen(transactionScreen);
        historyNavigation.setServiceScreen(transactionScreen);
        transactionScreen.setHistoryNavigation(historyNavigation);
 
        loginForm.drawScene();
        homeScreen.drawScene();
        transactionScreen.drawScene();
        depositeForm.drawScene();
        withdrawForm.drawScene();
        balanceInquiry.drawScene();
        historyNavigation.drawScene();
        
        
        primaryStage.setScene(loginForm.getScene());
        primaryStage.show();
        
    }
}
