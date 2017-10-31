var listaEmails = [];
var listaSenhas = [];
var nascimento = {
	dia:'',
	mes:'',
	ano:'',
};
var cont=0;


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

function pegaMes(){
	console.log("Entrou no pegaMes");
	 var valorMes = document.getElementsByName('mesNascimento')[0];
	 if (cont === 0 ){
	 	 var opcao = valorMes.options[valorMes.selectedIndex].value;
	 }else{
	 	 var opcao = valorMes.options[valorMes.selectedIndex].value -1;
     }
    console.log(opcao);
    if (opcao == 1 ){
        nascimento.mes = 'Janeiro';      
    }else if(opcao == 2){
        nascimento.mes = 'Fevereiro';
    }else if(opcao == 3){
        nascimento.mes = 'Março';
    }else if(opcao == 4){
        nascimento.mes = 'Abril';
    }else if(opcao == 5){
        nascimento.mes = 'Maio';
    }else if(opcao == 6){
        nascimento.mes = 'Junho';
    }else if(opcao == 7){
        nascimento.mes = 'Julho';
    }else if(opcao == 8){
        nascimento.mes = 'Agosto';
    }else if(opcao == 9){
        nascimento.mes = 'Setembro';
    }else if(opcao == 10){
        nascimento.mes = 'Outubro';
    }else if(opcao == 11){
        nascimento.mes = 'Novembro';
    }else if(opcao == 12){
        nascimento.mes = 'Dezembro';
    }
    cont++;
    console.log(nascimento.mes);
}