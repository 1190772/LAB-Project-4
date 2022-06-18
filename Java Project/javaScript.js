var agv = document.getElementById("agv");
/*function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("update").innerHTML = this.responseURL;
            number++;
            document.getElementById("test").innerHTML = number;
        }
    };
    xhttp.open("GET", "warehouse.png", true);
    xhttp.send();
}*/

function loadJSON(){
    $.getJSON("AGV.json", function (json){
        console.log(json)
        renderHtml(json);
    })
}

function renderHtml(data){
    var htmlString = "";

    for (i = 0; i < data.length; i++){
        var status = stat(data[i].STATUS);
        htmlString += "<p> AGV with ID " + data[i].ID + " is " + status;
    }

    agv.insertAdjacentHTML("beforeend", htmlString);
}

function stat(status){
    if(status === 0){
        return  status = "free";
    }else if(status === 1){
        return status = "charging";
    }else if (status === 2){
        return status = "occupied";
    }else{
        return status = "with unknown status"
    }
}

function updateJSON(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("update").innerHTML = this.responseURL;
        }
    };

}

//loadDoc(); // This will run on page load
loadJSON();

setInterval(function(){
    //loadDoc() // this will run after every 5 seconds
    updateJSON()
}, 5000);