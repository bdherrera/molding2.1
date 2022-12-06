var correo = document.querySelector('#correo')
var contrasenia = document.querySelector('#contrasenia')
var comfirmarContrasenia = document.querySelector('#comfirmarContrasenia')
var ingresar = document.querySelector('#ingresar')
var menor = document.form.edad


var errorCorreo = document.querySelector('#errorCorreo')
var errorContrasenia = document.querySelector('#errorContrasenia')
var errorComfirmar = document.querySelector('#errorComfirmar')
var errorRadio = document.querySelector('#errorRadio')
var errorSelect = document.querySelector('#errorSelect')
var errorCheck = document.querySelector('#errorCheck')

var valid = false


var expReg= /^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/;
var entrar = false

//que hace esto, si no sabe uste
ingresar.onclick = function(){
    if(expReg.test(correo.value) == false){
        errorCorreo.innerHTML = `Este correo no es valido`
    }else{
        errorCorreo.style.display = 'none'
    }
    if(contrasenia.value.length <= 6 ){
        errorContrasenia.innerHTML = "La contraseña debe tener mas de 6 caracteres"
    }else{
        errorContrasenia.style.display = 'none'
    }
    if(comfirmarContrasenia.value.length == 0){
      errorComfirmar.innerHTML = "Ingresa tu nombre"
    }else if(contrasenia.value != comfirmarContrasenia.value){
      errorComfirmar.innerHTML = "Ingresa tu nombre"
    }else{
      errorComfirmar.style.display = 'none'
    }
    for(var i =0;i<menor.length;i++){
    if(menor[i].checked){
     valid = true
     break
    }}
    if(valid == false){
      errorRadio.innerHTML= "seleccione uno"
    }else{
      errorRadio.style.display ='none'
    }
    if(document.form1.genero.selectedIndex == null || document.form1.genero.selectedIndex == ""){
      errorSelect.innerHTML = 'Seleccione uno'
    }else{
      errorSelect.style.display= 'none'
    }
    let terminos = document.form.condicion
    if( !terminos.checked){
      errorCheck.innerHTML='Seleccione este campo'
    }else{
      errorCheck.style.display = 'none'
      window.location.href="../listados.html"
    }
    

    var dateControl = document.querySelector('input[type="date"]');
dateControl.value = "2017-06-01";
console.log(dateControl.value); // imprime "2017-06-01"
console.log(dateControl.valueAsNumber); // imprime 1496275200000, una marca de fecha (en ms) en JavaScript.
    }


