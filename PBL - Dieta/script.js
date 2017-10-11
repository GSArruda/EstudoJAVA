let produtos = [];
let horarios = [];

function adicionarProduto(){
	var produto = document.getElementById('nomeProduto').value;
	var horario = document.getElementsByName('horario'); 
	var cont = 0;
	console.log(horario.length);

	for (var i = 0;i < horario.length;i++){
		if (horario[i].checked === true) {
			cont++;		
		}
	}	

	if (produto == ""){
		alert("Campo produto está inválido!!!");

	}else if (cont === 0){
		alert("Campo horário está inválido!!!");
	}else{
		produtos.push(produto);	
		for (var i = 0;i < horario.length;i++){
			if (horario[i].checked === true) {
				horarios.push(horario[i].value);
				break;
			}
		}			
	}

	document.getElementById('prd').innerHTML = "Refeição:"
	console.log('entrou na função mostraProdutos');
	
	for (var i = produtos.length - 1; i >= 0; i--) {
		
		document.getElementById('prd').innerHTML += "<br>" + produtos[i];

	}

	document.getElementById('hr').innerHTML = "Horário:"
	for (var j = horarios.length - 1; j >= 0; j--) {
		
		document.getElementById('hr').innerHTML += "<br>" + horarios[j];

	}	
	
}


function gerarDieta() {

	document.getElementById('produtoSorteado').innerHTML = "Refeição:";
	for (var i = 0 ; i < 6; i++){	
		var produtoAleatorio = Math.random();
		produtoAleatorio = Math.floor(produtoAleatorio * produtos.length);
		document.getElementById('produtoSorteado').innerHTML += "<br>" + produtos[produtoAleatorio];
	}

	
	document.getElementById('horarioSorteado').innerHTML = "Horário:" + "<br>";
	document.getElementById('horarioSorteado').innerHTML += "6:00" + "<br>" ;
	document.getElementById('horarioSorteado').innerHTML += "9:00" + "<br>" ;
	document.getElementById('horarioSorteado').innerHTML += "12:00" + "<br>" ;
	document.getElementById('horarioSorteado').innerHTML += "15:00" + "<br>" ;
	document.getElementById('horarioSorteado').innerHTML += "18:00" + "<br>" ;
	document.getElementById('horarioSorteado').innerHTML += "21:00" + "<br>" ;

}