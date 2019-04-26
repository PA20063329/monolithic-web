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
public class ProductForm extends ActionForm{

	 
    private static final long serialVersionUID = 1L;
    private Long id = null;
    private String prodName  = null;
    public Long getId() {
		return id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
