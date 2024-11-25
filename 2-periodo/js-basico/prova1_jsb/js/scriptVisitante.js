var txtNome = document.getElementById("txtNome")
var btn1 = document.getElementById("btn1")
var btn2 = document.getElementById("btn2")
var btn3 = document.getElementById("btn3")
var btn4 = document.getElementById("btn4")
var boasVindas = document.getElementById("boasVindas")

var imgs = [
    "img/emoji1.jpg",
    "img/emoji2.jpg",
    "img/emoji3.jpg",
    "img/emoji4.jpg",
    "img/emoji5.jpg",
]

txtNome.addEventListener("change", function (){
    boasVindas.innerHTML = "Olá, " + txtNome.value
})

btn1.addEventListener("click", function (){
    img.src = imgs[0]
})

btn2.addEventListener("mousemove", function (){
    img.src = imgs[1]
})

btn3.addEventListener("mouseleave", function (){
    img.src = imgs[2]
})

btn4.addEventListener("click", function (){
    img.src = imgs[parseInt(Math.random()*imgs.length-1)]
})
