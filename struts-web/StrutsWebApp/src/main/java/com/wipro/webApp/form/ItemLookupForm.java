/**
 * 
 */
package com.wipro.webApp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * @author PA20063329
 *
 */
public class ItemLookupForm extends ActionForm{

	 
    private static final long serialVersionUID = 1L;
    private String userName = null;
    private String password = null;
    private Long id = null;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.password = null;
    }
 

}
