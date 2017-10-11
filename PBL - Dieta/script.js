let produtos = [];
let horarios = [];

function adicionarProduto(){
	var produto = document.getElementById('nomeProduto').value;
	var horario = document.getElementsByName('horario');
	
	produtos.push(produto);
	
	for (var i = 0;i < horario.length;i++){
		if (horario[i].checked === true) {
			horarios.push(horario[i].value);
			break;
		}
	}
	console.log(produto);
	console.log(horario);
	console.log(produtos);
	console.log(horarios);

	
}

function mostraProdutos(){
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
	var produtoAleatorio = Math.random();
	var horarioAleatorio = Math.random();
	produtoAleatorio = Math.floor(produtoAleatorio * produtos.length);
	horarioAleatorio = Math.floor(horarioAleatorio * horarios.length);

	document.getElementById('produtoSorteado').innerHTML = "Refeição:";
	document.getElementById('produtoSorteado').innerHTML += "<br>" + produtos[produtoAleatorio];
	document.getElementById('horarioSorteado').innerHTML = "Horário:";
	document.getElementById('horarioSorteado').innerHTML += "<br>" + horarios[horarioAleatorio];

}