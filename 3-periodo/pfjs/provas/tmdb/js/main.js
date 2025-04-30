const apiKey = '35207dcad657c86430d0637f1dc99f32';
const apiUrl = 'https://api.themoviedb.org/3/movie/popular?api_key=' + apiKey + '&language=pt-BR&page=1';
const genreUrl = 'https://api.themoviedb.org/3/genre/movie/list?api_key=' + apiKey + '&language=pt-BR';

// Função para buscar os gêneros de filmes
let generos = {};

async function buscarGeneros() {
    const resp = await fetch(genreUrl);
    if (!resp.ok) {
        throw new Error('Erro ao buscar gêneros');
    }
    const data = await resp.json();
    generos = data.genres.reduce((ref, genero) => {
        ref[genero.id] = genero.name;
        return ref;
    }, {});

}

buscarGeneros();

// Função para buscar os filmes populares
async function buscarFilmes() {
    try {
        const resp = await fetch(apiUrl);
        if (!resp.ok) {
            throw new Error('A resposta da rede não foi bem-sucedida');
        }
        const data = await resp.json();
        mostraFilmes(data.results.slice(0, 10)); // Limita a 10 filmes
    } catch (error) {
        console.error('Houve um problema com o fetch:', error);
        document.getElementById('msgAlerta').innerText = 'Falha ao carregar os filmes. Por favor, tente novamente mais tarde.';
    }
}

function mostraFilmes(filmes) {
    const filmePainel = document.getElementById('painel');
    filmePainel.classList.add('filme-painel');
    filmePainel.innerHTML = ''; 

    filmes.forEach((filme, index) => {
        const filmeDiv = document.createElement('div');
        filmeDiv.classList.add('filme');
        filmeDiv.classList.add(index % 2 === 0 ? 'layout-normal' : 'layout-invertido'); // Alterna o layout

        // Adiciona a imagem e a nota do filme
        const filmeCapaDiv = document.createElement('div');
        filmeCapaDiv.classList.add('filme-capa');

        const filmeCapa = document.createElement('img');
        filmeCapa.src = 'https://image.tmdb.org/t/p/w500' + filme.poster_path;
        filmeCapa.alt = filme.title;

        const filmeNota = document.createElement('div');
        filmeNota.classList.add('filme-nota');
        filmeNota.innerText = filme.vote_average.toFixed(1); // Exibe com 1 casa decimal

        filmeCapaDiv.appendChild(filmeCapa);
        filmeCapaDiv.appendChild(filmeNota);

        // Adiciona as informações do filme
        const filmeInfoDiv = document.createElement('div');
        filmeInfoDiv.classList.add('filme-info');

        const filmeTitulo = document.createElement('h2');
        filmeTitulo.innerText = filme.title;

        const filmeData = document.createElement('p');
        const dataFormatada = new Date(filme.release_date).toLocaleDateString('pt-BR'); // Formata a data para o padrão brasileiro
        filmeData.classList.add('filme-data');
        filmeData.innerHTML = `<strong>Data de lançamento</strong><br> ${dataFormatada}`;

        const filmeDescricao = document.createElement('p');
        filmeDescricao.classList.add('filme-descricao');
        filmeDescricao.innerHTML = `<strong>Descrição</strong><br> ${filme.overview || 'Descrição não disponível.'}`;

        const filmeGeneros = document.createElement('p');
        const generosNomes = filme.genre_ids.map(id => generos[id]).join(', ');
        filmeGeneros.innerHTML = `<strong>Gêneros</strong><br> ${generosNomes}`;

        filmeInfoDiv.appendChild(filmeTitulo);
        filmeInfoDiv.appendChild(filmeData);
        filmeInfoDiv.appendChild(filmeGeneros);
        filmeInfoDiv.appendChild(filmeDescricao);

        // Adiciona os elementos ao contêiner principal
        if (index % 2 === 0) {
            filmeDiv.appendChild(filmeCapaDiv);
            filmeDiv.appendChild(filmeInfoDiv);
        } else {
            filmeDiv.appendChild(filmeCapaDiv);
            filmeDiv.appendChild(filmeInfoDiv);
        }

        filmePainel.appendChild(filmeDiv);
    });
}

document.addEventListener('DOMContentLoaded', buscarFilmes);