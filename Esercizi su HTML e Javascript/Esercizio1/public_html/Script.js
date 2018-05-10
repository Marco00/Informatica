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
    while (i < matricola.length) {
        if (matricola.charAt(i) == '0' || matricola.charAt(i) == '1' || matricola.charAt(i) == '2' ||
                matricola.charAt(i) == '3' || matricola.charAt(i) == '4' || matricola.charAt(i) == '5' ||
                matricola.charAt(i) == '6' || matricola.charAt(i) == '8' || matricola.charAt(i) == '9') {
            i++;
        } else {
            alert("Campo matricola non è un numero!");
            document.getElementById("matricola").focus();
            checked = false;
            break;
        }
    }
    if (regione == "") {
        alert("Campo regione non compilato!");
        document.getElementById("regione").focus();
        checked = false;
    }
    if (email == "") {
        alert("Campo email non compilato!");
        document.getElementById("email").focus();
        checked = false;
    } else {
        if (email.includes('@')) {
            let pos = email.indexOf('@');
            if (email.indexOf('.', pos) != -1) {
            } else {
                checked = false;
                alert("Campo email non compilato correttamente!");
            }
        } else {
            checked = false;
            alert("Campo email non compilato correttamente!");
        }
    }
    if (telefono == "") {
        alert("Campo telefono non compilato!");
        document.getElementById("telefono").focus();
        checked = false;
    } else {
        var i = 0;
        while (i < telefono.length) {
            if (telefono.charAt(i) == '0' || telefono.charAt(i) == '1' || telefono.charAt(i) == '2' ||
                telefono.charAt(i) == '3' || telefono.charAt(i) == '4' || telefono.charAt(i) == '5' ||
                telefono.charAt(i) == '6' || telefono.charAt(i) == '8' || telefono.charAt(i) == '9') {
                i++;
            } else {
                alert("Campo telefono non formato da soli numeri!");
                document.getElementById("telefono").focus();
                checked = false;
                break;
            }
        }
    }
    if (richieste == "") {
        alert("Campo richieste non compilato!");
        document.getElementById("richieste").focus();
        checked = false;
    }
    if (checked == true)
        alert("Form compilato con successo");
}

function doReset() {
    document.forms.registrazione.reset();
}
