// 7. Construa uma página web para exibir no corpo do documento um número sorteado de um
// dado de 6 lados. Porém, ao invés de exibir o número deverá ser exibida uma imagem
// correspondente ao número sorteado, semelhante a imagem a seguir. OBS: Sinta-se à vontade
// para escolher as imagens na web ou se preferir você poderá criá-las.

var nroAleatorio = parseInt(Math.random()*6);

let imagens = ["face-1.png", "face-2.png", "face-3.png", "face-4.png", "face-5.png", "face-6.png"]

document.write(`<h1>Sorteador Dado de 6 lados</h1>`)
document.write(`<img src="img/${imagens[nroAleatorio]}" alt="">`)