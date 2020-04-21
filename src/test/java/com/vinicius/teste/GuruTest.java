package com.vinicius.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinicius.core.InvokedMethodListener;
import com.vinicius.page.PageGuruHome;
 
@Listeners(InvokedMethodListener.class)
	public class GuruTest{
	 
	    @Test
    public void loginSucesso() throws Exception {
    	new PageGuruHome()
    	.openPage(PageGuruHome.class, "http://demo.guru99.com/test/login.html")
    	.acessarLoginGuru("vinicius@gmail.com", "123")
    	.validarAcessoOK();
    	
    	
    	
    }
}