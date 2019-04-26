/**
 * 
 */
package com.wipro.webApp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.common.plugin.HibernatePlugin;
import com.wipro.dao.ItemLookupDAO;
import com.wipro.dao.entity.Item;
import com.wipro.webApp.form.ItemLookupForm;

/**
 * @author PA20063329
 *
 */
public class ItemLookupAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Inside Item Lookup Action");
		ItemLookupForm loginForm = (ItemLookupForm) form;
		
		ItemLookupDAO dao = new ItemLookupDAO();
		if(loginForm.getId() == null)
			System.out.println("ID Is null");
		SessionFactory sessionFactory = 
		         (SessionFactory) servlet.getServletContext()
	                            .getAttribute(HibernatePlugin.KEY_NAME);

		Session session = sessionFactory.openSession();
		Item i = dao.findById(loginForm.getId(), session);
		//copy customerform to model
		/*BeanUtils.copyProperties(customer, customerForm);
			
		//save it
		customer.setCreatedDate(new Date());
			
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
*/
		if(i == null) {
			return mapping.findForward("failure");
		}else {
			return mapping.findForward("success");
		}
		/*if (loginForm.getUserName() == null || loginForm.getPassword() == null
				|| !loginForm.getUserName().equalsIgnoreCase("Mukesh")
				|| !loginForm.getPassword().equals("kumar")) {
			return mapping.findForward("failure");
		} else
			return mapping.findForward("success");*/
	}
}
