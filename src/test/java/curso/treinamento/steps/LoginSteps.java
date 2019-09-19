package curso.treinamento.steps;



import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {

	private LoginPage loginpage = new LoginPage(Hooks.getDriver());
	private HomePage homepage = new HomePage(Hooks.getDriver());
	
	
	@Dado("que eu deseje logar no sistema")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {
		//Thread.sleep(3000);
		Assert.assertTrue("Pagina Login Nao Foi Encontrada.", loginpage.validar_pagina());
	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faço_login_com_o_usuário_e_senha(String email, String senha) {
		loginpage.digitar_email(email);
		loginpage.digitar_senha(senha);
		loginpage.clicar_botao_login();
	}

	@Entao("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		//Thread.sleep(3000);
		Assert.assertTrue("Login Nao foi realizado com sucesso", homepage.validar_pagina());
	}
	
	
	@Entao("e apresentado a menssagem {string}")
	public void e_apresentado_a_menssagem(String erro) throws InterruptedException {
	
	}
}
