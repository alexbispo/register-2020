package com.alexbispo.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegisterAction extends Action {

	@Override
	public ActionForward perform(ActionMapping mapping,
									ActionForm form,
									HttpServletRequest request,
									HttpServletResponse response) {
		
		RegisterForm rf = (RegisterForm) form;
		
		String username = rf.getUsername();
		String password1 = rf.getPassword1();
		String password2 = rf.getPassword2();
		
		if (password1.equals(password2)) {
			try {
				UserDirectory.getInstance().setUser(username, password1);
				return mapping.findForward("success");
			} catch (UserDirectoryException e) {
				return mapping.findForward("failure");
			}
		}
		
		return mapping.findForward("failure");
		
	}
}
