/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function controllaCampi() {
    var cognome = document.getElementById("cognome").value;
    var nome = document.getElementById("nome").value;
    var matricola = document.getElementById("matricola").value;
    var regione = document.forms.registrazione.regione.value;
    var email = document.getElementById("email").value;
    var telefono = document.getElementById("telefono").value;
    var richieste = document.getElementById("richieste").value;
    var checked = true;
    if (cognome == "") {
        alert("Campo cognome non compilato!");
        document.getElementById("cognome").focus();
        checked = false;
    }
    if (nome == "") {
        alert("Campo nome non compilato!");
        document.getElementById("nome").focus();
        checked = false;
    }
    var i = 0;
    while(i < matricola.length){
        if(matricola.charAt(i) == '0' || matricola.charAt(i) == '1' || matricola.charAt(i) == '2' || 
           matricola.charAt(i) == '3' || matricola.charAt(i) == '4' || matricola.charAt(i) == '5' || 
           matricola.charAt(i) == '6' || matricola.charAt(i) == '8' || matricola.charAt(i) == '9') {
            i++;
        } else {
            alert(i);
            alert("Campo matricola non è un numero!");
            document.getElementById("richieste").focus();
            checked = false;
            break;
        }
    }
    if(regione == ""){
        alert("Campo regione non compilato!");
        document.getElementById("regione").focus();
        checked = false;
    }
    if (email == "") {
        alert("Campo email non compilato!");
        document.getElementById("email").focus();
        checked = false;
    }
    if (telefono == "") {
        alert("Campo telefono non compilato!");
        document.getElementById("telefono").focus();
        checked = false;
    }
    if (richieste == "") {
        alert("Campo richieste non compilato!");
        document.getElementById("richieste").focus();
        checked = false;
    }
    if(checked == true)
        alert("Form compilato con successo");
}

function doReset(){
    document.forms.registrazione.reset();
}
