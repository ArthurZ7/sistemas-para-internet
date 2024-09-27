// 7. Construa uma página web capaz de solicitar ao usuário três valores numéricos diferentes,
// correspondentes aos valores RGB, nesta ordem. Informe na caixa de diálogo que cada valor
// deverá estar dentro do intervalo [0,255]. Após a leitura dos três valores, o texto “Fundamentos
// de Web Design II” deverá ser exibido ao usuário no corpo do documento da página com a cor
// informado pela usuário.

r = prompt("Para montar uma cor RGB, insira o valor de Red (R), dentro do intervalo [0, 255]: ")
g = prompt("insira o valor de Green (G), dentro do intervalo [0, 255]: ")
b = prompt("insira o valor de Blue (B), dentro do intervalo [0, 255]: ")

document.write(`<h1 style="color: rgb(${r}, ${g}, ${b})">Fundamentos
de Web Design II</h1>`)