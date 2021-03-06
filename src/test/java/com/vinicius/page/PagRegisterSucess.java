
package com.vinicius.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vinicius.core.CorePage;
import com.vinicius.core.util.Utils;
import com.vinicius.driver.TLDriverFactory;
import com.vinicius.teste.GuruTestRegister;

public class PagRegisterSucess extends CorePage<PageGuruSucess>{
	
	PageRegister gurutest = new PageRegister();

	public PagRegisterSucess() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(xpath = "//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")
	private WebElement msgSucesso;
	
	public void validarAcessoOK() {
		aguardarElementoVisivel(msgSucesso);
		Assert.assertEquals(getTextElement(msgSucesso), "Thank you for registering. You may now sign-in using the user name and password you've just entered." );
		Utils.takeScreenshot("loginSucesso", "001");
	}
}
