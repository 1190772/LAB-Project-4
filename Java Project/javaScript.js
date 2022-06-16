var number = 0;
function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("update").innerHTML =
                this.responseURL;
            number++;
            document.getElementById("test").innerHTML = number;
        }
    };
    xhttp.open("GET", "warehouse.png", true);
    xhttp.send();
}

loadDoc(); // This will run on page load
setInterval(function(){
    loadDoc() // this will run after every 5 seconds
}, 5000);