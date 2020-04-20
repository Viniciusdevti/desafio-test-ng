package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruHome;
import com.thiago.page.PageRegister;
 
@Listeners(InvokedMethodListener.class)
	public class GuruTestRegister{
	 
	    @Test
    public void loginSucesso() throws Exception {
    	new PageRegister()
    	.openPage(PageRegister.class, "http://demo.guru99.com/test/newtours/register.php")
    	.contactInformation("name","lastName", "phone", "userNam",
    			"address1", "city", "state", "postalCod0e", "country",
    			"email", "password", "confirmPassword");
    	
    	
    	
    	

    
    	
    
    	
    	
    }
}