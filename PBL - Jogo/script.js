let contador = 0;

function setImageVisible(id, visible) {
    var img = document.getElementById(id);
    
    if (visible){
    	img.style.visibility = 'visible';
    	adicionaContador();
    }else
    	img.style.visibility = 'hidden';

}

function adicionaContador(){
	contador++;
	console.log(contador);
}