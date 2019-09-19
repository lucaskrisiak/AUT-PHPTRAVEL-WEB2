package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.utils.Helper;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement botaoLogin;
	
	
	public void digitar_email(String email) {
		campoEmail.sendKeys(email);	
	}
	
	public void digitar_senha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void clicar_botao_login() {
		botaoLogin.click();
	}
	
	public Boolean validar_pagina() {
		Helper.aguardar_elemento(10, botaoLogin);
		return botaoLogin.isDisplayed();
	}
	
}
