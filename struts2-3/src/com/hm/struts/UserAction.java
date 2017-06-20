package com.hm.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


public class UserAction implements SessionAware
{
	
	public String execute(){
		return "login-success";
		
		
	}
	private Map<String , Object> session;

	@Override
	public void setSession(Map<String, Object> session)
	{
		this.session=session;
		
		
	}

}
