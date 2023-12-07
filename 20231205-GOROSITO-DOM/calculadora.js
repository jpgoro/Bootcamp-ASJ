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
// const input = document.getElementById('miInput');
// const b0 = document.getElementById('b0');
// const b1 = document.getElementById('b1');
// const b2 = document.getElementById('b2');
// const b3 = document.getElementById('b3');
// const b4 = document.getElementById('b4');
// const b5 = document.getElementById('b5');
// const b6 = document.getElementById('b6');
// const b7 = document.getElementById('b7');
// const b8 = document.getElementById('b8');
// const b9 = document.getElementById('b9');
// const bplus = document.getElementById('bplus');
// const bmenos = document.getElementById('bmenos');
// const bmulti = document.getElementById('bmulti');
// const bdiv = document.getElementById('bdiv');
// const bigual = document.getElementById('bigual');
// const breset = document.getElementById('breset');

// //Agregamos eventos a los botones
// b0.addEventListener('click', () => {
//     console.log(input.value += '0');
// });
// b1.addEventListener('click', () => {
//     console.log(input.value += '1');
// });
// b2.addEventListener('click', () => {
//     input.value += '2';
// });
// b3.addEventListener('click', () => {
//     input.value += '3';
// });
// b4.addEventListener('click', () => {
//     input.value += '4';
// });
// b5.addEventListener('click', () => {
//     input.value += '5';
// });
// b6.addEventListener('click', () => {
//     input.value += '6';
// });
// b7.addEventListener('click', () => {
//     input.value += '7';
// });
// b8.addEventListener('click', () => {
//     input.value += '8';
// });
// b9.addEventListener('click', () => {
//     input.value += '9';
// });
// bplus.addEventListener('click', () => {
//     input.value += '+';
// });
// bmenos.addEventListener('click', () => {
//     input.value += '-';
// });
// bmulti.addEventListener('click', () => {
//     input.value += '*';
// });
// bdiv.addEventListener('click', () => {
//     input.value += '/';
// });
// //USANDO FUNCION EVAL PARA EL CALCULO EN INPUT
// bigual.addEventListener('click', () => {
//     input.value = eval(input.value);
// });
// breset.addEventListener('click', () => {
//     input.value = '';
// });

        // const input = document.getElementById('miInput');
        // const btns = document.querySelectorAll('.boton');

        // // Creamos una función para manejar el evento click
        // function hacerClick(e) {
        //     const buttonValue = e.target.textContent;
        //     input.value += buttonValue;
        // }

        // // Creamos una función para manejar el evento click del botón =
        // function igualClick() {
        //     input.value = eval(input.value);
        // }

        // // Agregamos el evento click a cada botón
        // btns.forEach((btn) => {
        //     if (btn.id === 'bigual') {
        //         btn.addEventListener('click', igualClick);
        //     } else {
        //         btn.addEventListener('click', hacerClick);
        //     }
        // });

        // // Agregamos un evento click al botón de reset
        // const resetBtn= document.getElementById('breset');
        // resetBtn.addEventListener('click', () => {
        //     input.value = '';
        // });

        
        
            const input = document.getElementById('miInput');
            const buttons = document.querySelectorAll('.boton');
        
            buttons.forEach(button => {
                button.addEventListener('click', function () {
                    handleButtonClick(this.innerText);
                });
            });
        
            document.getElementById('bigual').addEventListener('click', function () {
                try {
                    input.value = safeEval(input.value);
                } catch (error) {
                    input.value = 'Error';
                }
            });
        
            document.getElementById('breset').addEventListener('click', function () {
                input.value = '';
            });
        
            function handleButtonClick(value) {
                if (value === 'X') {
                    // Reemplaza la letra 'X' con el operador de multiplicación '*'
                    value = '*';
                }
                input.value += value;
            }
        
            function safeEval(expr) {
                const safeExpr = expr.replace(/[^\d+\-*/.]/g, '');
                return Function(`'use strict'; return (${safeExpr})`)();
            }
        
        
        
