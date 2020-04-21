package com.vinicius.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinicius.core.InvokedMethodListener;
import com.vinicius.page.PageGuruAlert;
import com.vinicius.page.PageGuruHome;
 
@Listeners(InvokedMethodListener.class)
	public class GuruAlert{
	 
	    @Test
    public void idSucess() throws Exception {
    	new PageGuruAlert()
    	.openPage(PageGuruAlert.class, "http://demo.guru99.com/test/delete_customer.php")
    	.verifiqueAlert("55");
    	
    
    	
    	
    }
}