#language: pt

	Funcionalidade: Login
	@LoginSucesso
	Cenario: 	Realizar login com sucesso
		Dado que eu deseje logar no sistema
		Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
		Entao sou autenticado com sucesso
		
	@LoginInvalido
	Cenario: 	Realizar login invalido
		Dado que eu deseje logar no sistema
		Quando faço login com o usuário "teste" e senha "demoadmin"
		Entao e apresentado a menssagem "The Email field must contain a valid email address."