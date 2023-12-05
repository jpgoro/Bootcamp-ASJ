// // MOZO ELECTRONICO CON FUNCIONES

// //Mozo virtual

// let total = 0;
// let propina = 0;
// let pedido = "";
// let chiste = "";
// const contarChiste  = () => chiste = prompt("¿Qué le dice la foca a su madre? I love you, mother foca.");
// const presentacion = () => pedido = prompt("¿Qué desea? (Escriba 'salir' para terminar)\n\nCerveza - $200\n Vino - $300\n Agua - $100\n Gaseosa - $150\n Café - $100\n Té - $120\n Chiste\n Cuenta\n Salir");
// while (pedido !== "salir") {
//     // pedido = prompt("¿Qué desea? (Escriba 'salir' para terminar)\n\nCerveza - $200\n Vino - $300\n Agua - $100\n Gaseosa - $150\n Café - $100\n Té - $120\n Chiste\n Cuenta\n Salir");
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
//             contarChiste();
//             // chiste = prompt("¿Qué le dice la foca a su madre? I love you, mother foca.");
//             break;
//         case "cuenta":
//             propina = total*0.1;
//             alert(`El total de la cuenta es $${total}. La propina es $${propina}. El total con propina es $${calcularCuenta(total,propina)}.`);
//             break;
//         case "salir":
//             alert("¡Gracias por visitarnos! ¡Que tengas un buen día!");
//             break;
//         default:
//             alert("Lo siento, no entendí lo que pediste. Por favor, intentá de nuevo.");
//     }
// }

// // function propina(total, propina) {
// //     return propina = total*0.1;
// // }

// function calcularCuenta(total, propina){
//     return total+ propina;
// }


//Función de Fibonacci

// function fibonacci(num) {
//     let fibo = [0, 1];
//     for (let i = 2; i < num; i++) {
//         fibo[i] = fibo[i - 1] + fibo[i - 2];
//     }
//     console.log(fibo);
// }


// fibonacci(20);

//----------------------------------------------------------------



        