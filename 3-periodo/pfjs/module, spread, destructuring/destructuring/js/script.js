window.addEventListener("DOMContentLoaded", () => {
    var vet = [10, 20, 30];
    
    const [a, b, c] = vet

    console.log(a, b, c)

     // Exemplos de Destructuring com objetos
    const user = {nome: "Arthur", idade: 20};
    const {nome: nome1} = user;

     console.log(nome1)
})