/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function main() {
    let city = document.getElementById("city").value.toLowerCase();
    let country = document.getElementById("country").value.toLowerCase();
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            // Typical action to be performed when the document is ready:
            let risposta = JSON.parse(xhttp.responseText);
            document.getElementById("pressione").innerHTML = "Pressione: " + risposta.main.pressure + " hPa";
            document.getElementById("temperatura").innerHTML = "Temperatura: "+ risposta.main.temp + " K";
            document.getElementById("umidità").innerHTML = "Umidità: " + risposta.main.humidity + " %";
        }
    };
    xhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&APPID=209a1816d8e3783a3c3b5e8ec118424f", true);
    xhttp.send();
}