/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.users;

/**
 *
 * @author HiGien
 */
public class UserErrorMessage {
    private String errorUsername;
    private String errorPassword;
    private String errorName;
    private String errorConfirm;
    private String errorDuplicate;

    public String getErrorDuplicate() {
        return errorDuplicate;
    }

    public void setErrorDuplicate(String errorDuplicate) {
        this.errorDuplicate = errorDuplicate;
    }

    
    public String getErrorUsername() {
        return errorUsername;
    }

    public void setErrorUsername(String errorUsername) {
        this.errorUsername = errorUsername;
    }

    public String getErrorPassword() {
        return errorPassword;
    }

    public void setErrorPassword(String errorPassword) {
        this.errorPassword = errorPassword;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }
    
    public String getErrorConfirm() {
        return errorConfirm;
    }

    public void setErrorConfirm(String errorConfirm) {
        this.errorConfirm = errorConfirm;
    }
    
    
}
