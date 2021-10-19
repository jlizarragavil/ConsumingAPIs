const url = "http://localhost:8080/userTable/all";

printTable(url);

function callApi() {
  orderBy = document.getElementById("usersCombo").value;
  const urlOrderby = `${url}/sort/${orderBy}`;
  printTable(urlOrderby);
}

function clearFilters() {
  printTable(url);
}

async function getData(url) {
  const response = await fetch(url);
  let data = await response.json();
  return data;
}

function printTable(url) {
  if (document.contains(document.getElementById("tbody"))) {
    document.getElementById("tbody").remove();
  }

  getData(url)
    .then(function (obj) {
      var table = document.getElementById("tabla");
      var tbody = document.createElement("tbody");
      tbody.setAttribute("id", "tbody");
      console.log("Longitud" + obj.length);
      for (let i = 0; i < obj.length; i++) {
        console.log(
          "Table data: " +
          obj[i]["name"] +
          ", " +
          obj[i]["id"] +
          ", " +
          obj[i]["age"]
        );
        var hilera = document.createElement("tr");
        for (let j = 0; j < 3; j++) {
          var celda = document.createElement("td");
          if (j == 0) var text = document.createTextNode(obj[i]["name"]);
          if (j == 1) var text = document.createTextNode(obj[i]["id"]);
          if (j == 2) var text = document.createTextNode(obj[i]["age"]);
          celda.appendChild(text);
          hilera.appendChild(celda);
        }
        tbody.appendChild(hilera);
        table.appendChild(tbody);
      }
    })
    .catch(function (err) {
      console.log("Error caught: " + err);
    });
}
