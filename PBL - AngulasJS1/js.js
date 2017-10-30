var listaEmails = [];
var listaSenhas = [];

function adicionaDados(){
	console.log("Entrou no adicionaDados");
	var email = document.getElementById('email').value;
	console.log(email);
	var senha = document.getElementById('senha').value;
	var senhac = document.getElementById('senhac').value;
	console.log(senha);
	console.log(senhac);
	if (verificaEmail(email) === false && comparaSenhas(senha,senhac) === false){
		console.log("Os dois são falsos");
		document.getElementById('emailExistente').innerHTML = "Email já existente.";
		document.getElementById('senhaIgual').innerHTML = "Senha não compatível com a confirmação";
	}else if (verificaEmail(email) === false || comparaSenhas(senha,senhac) === false){
		if (verificaEmail(email) === false){
			console.log("O email é falso");
			document.getElementById('emailExistente').innerHTML = "Email já existente.";
		}else if (comparaSenhas(senha,senhac) === false){
			console.log("A senha é falsa");
			document.getElementById('senhaIgual').innerHTML = "Senha não compatível com a confirmação";
		}
	}else{
		console.log("Tudo true");
		document.getElementById('emailExistente').innerHTML = "";
		document.getElementById('senhaIgual').innerHTML = "";
		listaEmails.push(email);
		listaSenhas.push(senha);
		console.log(listaEmails);
		console.log(listaSenhas);
	}
	
}

function verificaEmail(email){
	let cont = 0;
	for (var i = 0 ; i < listaEmails.length ; i++){
		if (email === listaEmails[i]){
			cont++;
		}			
	}
	if (cont === 0 ){
		return true;
	}else{
		return false;
	}

}

function comparaSenhas(senha1,senha2){
	if (senha1 === senha2){
		return true;
	}else{
		return false;
	}

}