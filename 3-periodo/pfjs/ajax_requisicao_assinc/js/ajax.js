let url = "https://arthurz7.github.io/sistemas-para-internet/3-periodo/pfjs/ajax/ajax.json";

function getXMLHttpRequest() {
    let req = new XMLHttpRequest();
    
    req.onreadystatechange = () => {
        if (req.readyState === 4 && req.status === 200) {
            let dados = JSON.parse(req.responseText);
            document.write("<h3>Dados por 'XMLHttpRequest':</h3>");
            document.write("<p> Nome: " + dados.nome + "</p>")
            document.write("<p> Idade: " + dados.idade + "</p>")
        }
        
    }
    req.open("GET", url, true);
    req.send();
}

// Fetch .then...
function getFetch() {
    const url = "https://arthurz7.github.io/sistemas-para-internet/3-periodo/pfjs/ajax/ajax.json";
    fetch (url)
        //Recebe os dados da url como json
        .then(resposta => resposta.json())
        .then(dados => {
            document.write("<h3>Dados por 'Fetch':</h3>")
            document.write("<p> Nome: " + dados.nome + "</p>")
            document.write("<p> Idade: " + dados.idade + "</p>")
        })
        .catch(error => console.log(error))
}

const ajax = {
    getFetch,
    getXMLHttpRequest,
}

export default ajax;