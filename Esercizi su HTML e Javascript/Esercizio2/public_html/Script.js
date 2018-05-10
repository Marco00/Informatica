/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

let checkedCAP = true;

function controlloCAP() {
    var cap = document.getElementById("cap").value;
    var checked = true;
    if (cap.length < 5) {
        checkedCAP = false;
        alert("Campo CAP contiene deve contenere 5 cifre!");
    } else {
        var i = 0;
        while (i < cap.length) {
            if (cap.charAt(i) == '0' || cap.charAt(i) == '1' || cap.charAt(i) == '2' ||
                cap.charAt(i) == '3' || cap.charAt(i) == '4' || cap.charAt(i) == '5' ||
                cap.charAt(i) == '6' || cap.charAt(i) == '8' || cap.charAt(i) == '9') {
                i++;
            } else {
                alert("Campo CAP non formato da soli numeri!");
                document.getElementById("cap").focus();
                checkedCAP = false;
                break;
            }
        }
    }
    return checked;
}

//Funzione principale
function main(){
    var nomeCognome = controlloCognomeNome();
    var sesso = verificaSesso();
    var ateneo = verificaAteneo();
    var studenteLavoratore = verificaStudenteLavoratore();
    if((nomeCognome && sesso && ateneo && studenteLavoratore && checkedCAP) == true)
        alert("Form inviato con successo");
}

function controlloCognomeNome() {
    var cognomeNome = document.getElementById("cognomeNome").value;
    var checked = true;
    if (cognomeNome == ""){
        alert("Campo \"Cognome e nome\" non compilato!");
        document.getElementById("cognomeNome").focus();
        checked = false;
    }
    else {
        var i = 0;
        while (i < cognomeNome.length) {
            if (cognomeNome.charAt(i) == '0' || cognomeNome.charAt(i) == '1' || cognomeNome.charAt(i) == '2' ||
                    cognomeNome.charAt(i) == '3' || cognomeNome.charAt(i) == '4' || cognomeNome.charAt(i) == '5' ||
                    cognomeNome.charAt(i) == '6' || cognomeNome.charAt(i) == '8' || cognomeNome.charAt(i) == '9') {
                alert("Campo matricola non è un numero!");
                document.getElementById("cognomeNome").focus();
                checked = false;
                break;
            } else {
                i++;
            }
        }
    }
    return checked;
}

function verificaSesso(){
    var sesso = document.forms.registrazione.sesso.value;
    if(sesso == null){
        alert("Sesso non selezionato!");
        return false;
    } else
        return true;
}

function verificaAteneo(){
    var ateneo = document.forms.registrazione.ateneo.value;
    if(ateneo == ""){
        alert("Ateneo non selezionato!");
        document.forms.registrazione.ateneo.focus();
        return false;
    } else
        return true;
}

function verificaStudenteLavoratore(){
    var studenteLavoratore = document.forms.registrazione.studenteLavoratore.value;
    var checked = true;
    if(studenteLavoratore != null){
        var lavoroSvolto = document.getElementById("lavoro").value;
        if(lavoroSvolto == ""){
            alert("Campo \"Descrizione lavoro svolto\" non compilato!");
            document.getElementById("lavoro").focus();
            checked = false;
        }
    }
    return checked;
}

function doReset(){
    document.forms.registrazione.reset();
}