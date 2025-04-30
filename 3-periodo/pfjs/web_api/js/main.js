import getCats from './thecatapi.js';

window.addEventListener('DOMContentLoaded', () => {
    document.getElementById('btnShowCats').addEventListener('click', showCats);
})

const showCats = async () => {
    showMsgAlerta('Processando. Aguarde...');
    const vetCats = await getCats();
     
    if (vetCats.length > 0) {
        const catPainel = document.getElementById('catPainel');

        // Imprime todos os gatos
        vetCats.forEach(cat => {
            const img = document.createElement('img');
            // const parag = document.createElement('p');
            // parag.textContent = cat.breeds[0].name;
            img.src = cat.url;
            img.className = 'cat';
            img.alt = 'Gato';
            catPainel.appendChild(img);
            // catPainel.appendChild(parag);
        });

        // Para 1 cato por vez
        // img.src = vetCats[0].url;
        // img.className = 'cat';
        // img.alt = 'Gato';
        // catPainel.appendChild(img);
        showMsgAlerta('');
    } else {
        console.log('erro');
    }
}

const showMsgAlerta = (msg) => {
    document.getElementById("msgAlerta").innerHTML = msg;
}