/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;
import javafx.scene.text.Font;

/**
 *
 * @author BASMA
 */
public class Trasactions {
    Trasactions transaction;
    private int balance = 0;
    int i=0;
    ArrayList<String> History = new ArrayList<String>();
    public Trasactions()
    {
      //transaction = new Trasactions();
    }


   /* Trasactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
 /*public boolean validate(String amount)
    {   boolean validationResult;
       int dollar = Integer.parseInt(amount);
       transaction.setBalance(balance);
        if (dollar>balance)
        {
            validationResult = true;
        } else {
            validationResult = false;
        }
        return validationResult;
    }*/
 
    public void Deposite(String amount)
    {   int dollar = Integer.parseInt(amount);
       // transaction.setBalance(balance);
         balance = balance + dollar;
         // return balance;
         History.add("you deposite "+ amount);
         i++;
         System.out.println("you deposite "+dollar);
    }
    
     public void WithDraw(String amount)
             
    { 
       int dollar = Integer.parseInt(amount);
        //transaction.setBalance(balance);
         balance = balance - dollar;
         History.add("you withdraw "+ amount);
         i++;
         System.out.println("you withdraw "+dollar);
    }
     
     public int currentBalance()
             
     { String amount = Integer.toString(balance);
         History.add("you check balance "+ amount);
         i++;
          /*transaction.setBalance(balance);
          transaction.getBalance();*/
         return balance;
     }
     public int Geti()
     {
         return i;
     }
     public int Gety()
     {
         int y = History.size();
         return y;
     }
     public String next ()
     {
         
         return History.get(++i);
     }
      public String back ()
     {
         return History.get(--i);
     }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

  
     
}