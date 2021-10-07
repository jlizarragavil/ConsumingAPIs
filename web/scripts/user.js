let url = 'http://localhost:8080/userTable/all'
llamada(url);
function callApi(){
    let url = 'http://localhost:8080/userTable/allSorted'
    llamada(url);
}
function calearFilters(){
    let url = 'http://localhost:8080/userTable/all'
    llamada(url);
}
function llamada(url){
    if (document.contains(document.getElementById("tabla"))) {
        document.getElementById("tabla").remove();
    }
    var body = document.getElementsByTagName("body")[0]
    
    fetch(url)
    .then(function (response){
        return response.json()
    }).then(function (obj){
    var table = document.createElement("table");
    var tbody = document.createElement("tbody");
    table.setAttribute("border", "2");
    table.setAttribute("id", "tabla");
    console.log("Longitud" + obj.length)
        for (let i = 0; i < obj.length; i++){
            
            console.log("Table data: " + obj[i]['name'] + ", " + obj[i]['id'] + ", " + obj[i]['age']);
            var hilera = document.createElement("tr");
            for (let j = 0; j < 3; j++){
                var celda = document.createElement("td");
                if(j==0)
                    var text = document.createTextNode(obj[i]['name']);
                if(j==1)
                    var text = document.createTextNode(obj[i]['id']);
                if(j==2)
                    var text = document.createTextNode(obj[i]['age']);
                celda.appendChild(text)
                hilera.appendChild(celda)
            }
            tbody.appendChild(hilera)
        }
        table.appendChild(tbody);
        body.appendChild(table)
    }).catch(function (err){
        console.log("Error caught: " + err)
    })
}