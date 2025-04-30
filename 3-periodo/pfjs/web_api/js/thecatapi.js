const getCats = async () => {
    try {
        // const response = await fetch('https://api.thecatapi.com/v1/images/search?limit=10');
        // Com chave
         const response = await fetch('https://api.thecatapi.com/v1/images/search?limit=10&api_key=live_3bwJ2UU4PH1Snk7qlFaM6ifxqt9RkpcIjP9Wb3JiYrrgvGcQ5ycJwXUd1igf3XYc');
        const data = await response.json();
        return data; //vetor contendo os gatos
    }
    catch(error) {
        console.log(error)
        return []; // vetro vazio: erro
    }
}

export default getCats;
