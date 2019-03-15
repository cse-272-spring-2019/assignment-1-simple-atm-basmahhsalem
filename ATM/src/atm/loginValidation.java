/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author BASMA
 */
public class loginValidation {
    
    public loginValidation() {
        /*userCode = new HashMap();
        userCode.put(userCode,"0000");
        userCode.put(userCode, "1234");
        userCode.put(userCode, "5555");
        userCode.put(userCode, "5432");*/
        
        
    }
    
    public boolean validate(String code, String username)
    {   boolean validationResult = false;
        String fetchedPassword;
        fetchedPassword = code;
        String fetchedUsername = username;
        if(fetchedPassword .equals("0000")&& fetchedUsername .equals("0000"))
        {
            validationResult = true;
        }
        return validationResult;
    }
    
}
