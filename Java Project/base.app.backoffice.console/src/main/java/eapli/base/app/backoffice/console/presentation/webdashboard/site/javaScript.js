var agv = document.getElementById("agv");
var agvPos = document.getElementById("agvPos");

function loadJSON(){
    $.getJSON("AGV.json", function (json){
        console.log(json)
        renderStatus(json);
        renderPos(json);
    })
}

function renderStatus(data){
    var htmlString = "";

    for (i = 0; i < data.length; i++){
        var status = stat(data[i].STATUS);
        if(data[i].STATUS === 2){
            htmlString += "<p> AGV with ID " + data[i].ID + " is " + status + " with the order of ID " + data[i].ORDER_ID;
        }else{
            htmlString += "<p> AGV with ID " + data[i].ID + " is " + status;
        }


    }

    agv.insertAdjacentHTML("beforeend", htmlString);
}

function renderPos(data){
    var htmlString = "";

    for (i = 0; i < data.length; i++){
            htmlString += "<p> AGV with ID " + data[i].ID + " is position (" + data[i].POSITIONX + ", " + data[i].POSITIONY + ") ";

    }

    agvPos.insertAdjacentHTML("beforeend", htmlString);
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
            document.getElementById("agv").innerHTML = this.responseURL;
        }
    };

}


loadJSON(); // This will run on page load

setInterval(function(){
    updateJSON() // this will run after every 5 seconds

}, 5000);