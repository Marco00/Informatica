/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function controlloCAP() {
    var cap = document.getElementById("cap").value;
    if (cap.length < 5) {
        alert("Campo CAP contiene deve contenere 5 cifre!");
    }
}

//Funzione principale
function main(){
    var nomeCognome = controlloCognomeNome();
    var sesso = verificaSesso();
    var ateneo = verificaAteneo();
    var studenteLavoratore = verificaStudenteLavoratore();
    if((nomeCognome && sesso && ateneo && studenteLavoratore) == true)
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