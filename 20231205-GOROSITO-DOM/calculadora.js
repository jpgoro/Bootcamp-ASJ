//EJERCICIOS DE DOM

// let input = document.getElementById("nom")
// let btn = document.getElementById('btn');

// btn.addEventListener("click", function() {
//     let color = input.style.color;
// 				if (color === "blue") {
// 					input.style.color = "red";
// 				} else {
// 					input.style.color = "blue";
// 				}
// });






//CALCULADORA
const input = document.getElementById('miInput');
const b0 = document.getElementById('b0');
const b1 = document.getElementById('b1');
const b2 = document.getElementById('b2');
const b3 = document.getElementById('b3');
const b4 = document.getElementById('b4');
const b5 = document.getElementById('b5');
const b6 = document.getElementById('b6');
const b7 = document.getElementById('b7');
const b8 = document.getElementById('b8');
const b9 = document.getElementById('b9');
const bplus = document.getElementById('bplus');
const bmenos = document.getElementById('bmenos');
const bigual = document.getElementById('bigual');
const breset = document.getElementById('breset');

//Agregamos eventos a los botones
b0.addEventListener('click', () => {
    console.log(input.value += '0');
});
b1.addEventListener('click', () => {
    console.log(input.value += '1');
});
b2.addEventListener('click', () => {
    input.value += '2';
});
b3.addEventListener('click', () => {
    input.value += '3';
});
b4.addEventListener('click', () => {
    input.value += '4';
});
b5.addEventListener('click', () => {
    input.value += '5';
});
b6.addEventListener('click', () => {
    input.value += '6';
});
b7.addEventListener('click', () => {
    input.value += '7';
});
b8.addEventListener('click', () => {
    input.value += '8';
});
b9.addEventListener('click', () => {
    input.value += '9';
});
bplus.addEventListener('click', () => {
    input.value += '+';
});
bmenos.addEventListener('click', () => {
    input.value += '-';
});
//USANDO FUNCION EVAL PARA EL CALCULO EN INPUT
bigual.addEventListener('click', () => {
    input.value = eval(input.value);
});
breset.addEventListener('click', () => {
    input.value = '';
});

//Evento para multiplicar

//Evento para dividir
