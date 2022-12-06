$(document).ready(function() {
    $('#example').DataTable( {
        dom: 'Bfrtip',
            buttons: [
                'copy', 'csv', 'excel', 'pdf', 'print'
            ]
        } );
    } );

    

var correo = document.querySelector('#correo');
var contrasenia = document.querySelector('#contrasenia');
var ingresar = document.querySelector('#ingresar');
var errorCorreo = document.querySelector('#errorCorreo');
var errorContrasenia = document.querySelector('#errorContrasenia')
var expReg= /^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/;
var entrar = false;

ingresar.onclick = function(){
    
    if(expReg.test(correo.value) == false){
        errorCorreo.innerHTML = `El correo no cumple con las caracteriscas requeridas <br> Ejemplo: prueba@prueba.com <br>`;
    }else{
        errorCorreo.style.display = 'none'
    }


    if(contrasenia.value.length <= 6 ){
        errorContrasenia.innerHTML = `La contraseña debe tener minimo 6 caracteres`
    }else{
        errorContrasenia.style.display = 'none'
    }


    if(expReg.test(correo.value) == true && contrasenia.value.length > 6){
        //alert('Inicio de sesion Exitoso')
        location.href = "tablero.html"
    }
}


