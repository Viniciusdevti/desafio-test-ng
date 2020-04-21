package com.vinicius.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinicius.core.InvokedMethodListener;
import com.vinicius.page.PageGoogle;
 
@Listeners(InvokedMethodListener.class)
public class GoogleSearchTest{
 
    @Test
    public void google0() throws Exception {
    	new PageGoogle()
    	.openPage(PageGoogle.class, "http://www.google.com")
    	.buscarNoGoogle("recursividade");
    	
    }
    @Test
    public void google1() throws Exception {
    	new PageGoogle().openPage(PageGoogle.class, "http://www.google.com").buscarNoGoogle("selenium");
    }
}