//WHILE
/*
Contador De Positivos

En este ejercicio deberás crear un programa que le pida al usuario que ingrese un número entero. El programa terminará cuando se ingrese un número negativo.
Al terminar, mostrarle un mensaje con la cantidad de números positivos que ingresó.
*/

// let cantidadPositivos = 0;
// let numero = 0;
// while (numero >= 0) {
//   numero = parseInt(prompt("Ingresá un número entero: "));
//   if (numero >= 0) {
//     cantidadPositivos++;
//   };
// };
// alert("Fueron ingresados " + cantidadPositivos + " números positivos.");

//----------------------------------------------------------------

//FizzBuzz

// let i = 1;
// while (i <= 100) {
//     if (i % 3 === 0 && i % 5 === 0) {
//         console.log("FizzBuzz");
//     } else if (i % 3 === 0) {
//         console.log("Fizz");
//     } else if (i % 5 === 0) {
//         console.log("Buzz");
//     } else {
//         console.log(i);
//     }
//     i++;
// }

//----------------------------------------------------------------

//Mozo virtual

// let total = 0;
// let propina = 0;
// let pedido = "";
// let chiste = "";

// while (pedido !== "salir") {
//     pedido = prompt("¿Qué desea? (Escriba 'salir' para terminar)\n\nCerveza - $200\n Vino - $300\n Agua - $100\n Gaseosa - $150\n Café - $100\n Té - $120\n Chiste\n Cuenta\n Salir");
//     switch (pedido.toLowerCase()) {
//         case "cerveza":
//             total += 200;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "vino":
//             total += 300;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "agua":
//             total += 100;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "gaseosa":
//             total += 150;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "cafe":
//             total += 100;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "te":
//             total += 120;
//             alert(`Agregaste ${pedido} a tu pedido. El total es $${total}.`);
//             break;
//         case "chiste":
//             chiste = prompt("¿Qué le dice la foca a su madre? I love you, mother foca.");
//             break;
//         case "cuenta":
//             propina = total * 0.1;
//             alert(`El total de la cuenta es $${total}. La propina es $${propina}. El total con propina es $${total + propina}.`);
//             break;
//         case "salir":
//             alert("¡Gracias por visitarnos! ¡Que tengas un buen día!");
//             break;
//         default:
//             alert("Lo siento, no entendí lo que pediste. Por favor, intentá de nuevo.");
//     }
// }

//Piramide de asteriscos

// const filas = parseInt(prompt('Ingre la cantidad de filas a dibujar'));
// for (let i = 0; i < filas; i++) {
//     let dibujo = '';
//     if (i < (filas / 2)) { //crecee 
//         for (let j = 0; j <= i; j++) {
//             dibujo = dibujo + '*';
//         }
//     } else { //decrece
//         for (let j = 0; j < filas - i; j++) {
//             dibujo = dibujo + '*';
//         }
//     }
//     console.log(dibujo);
// }


//Cálculo de factorial de un número

// let num = parseInt(prompt('Ingrese un número'));
// let factorial = 1;

// for (let i = num; i > 0; i--) {
//   factorial *= i;
// }

// alert(`El factorial de ${num} es ${factorial}`);
