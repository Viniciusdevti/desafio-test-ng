package com.vinicius.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinicius.core.InvokedMethodListener;
import com.vinicius.page.PageGuruHome;
import com.vinicius.page.PageRegister;
 
@Listeners(InvokedMethodListener.class)
	public class GuruTestRegister{
	 
	    @Test
    public void loginSucesso() throws Exception {
    	new PageRegister()
    	.openPage(PageRegister.class, "http://demo.guru99.com/test/newtours/register.php")
    	.contactInformation("name","lastName", "phone", "email@email.com",
    			"address1", "city", "state", "postalCod0e", "BRAZIL",
    			"email", "password", "password")
    	 	.validarAcessoOK();
    	
    	
    	
    	

    
    	
    
    	
    	
    }
}