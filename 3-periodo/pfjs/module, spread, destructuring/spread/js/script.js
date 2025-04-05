window.addEventListener("DOMContentLoaded", () => {
    // var vet = [10, 20, 30];
    // var vet2 = [10, 20, 30];
    // var vet3 = [...vet, ...vet2];

    // // var a = vet[0];
    // // var b = vet[1];
    // // var c = vet[2];

    // // Como realizar a atribuição acima utilizando o recurso de SPREAD do Javascript?

    // [a, b, c] = [...vet]

    // console.log(a, b, c);
    // console.log(vet3);

    // var maior = Math.max(...vet);
    // console.log(maior)

    // Exemplos de Spread com objetos
    const user1 = {nome: "Arthur", idade: 20};
    const user2 = {...user1};
    console.log(user2)
    
    // Exc2
    const user3 = {...user1, sexo: "M"}
    console.log(user3)
    
    //Exc3
    const user4 = {...user1, idade: 10}
    console.log(user4)

})