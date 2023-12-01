// palabra = "HOLA MUNDO"
// alert(palabra);

//-----Ejercicio 1------------
//const input = prompt("Ingrese un texto");
//alert(`El input tiene ${input.length} caracteres.`);

//----Ejercicio 2------------
// const edad = prompt("Ingresá tu Edad");
// const diasPorAnio = 365;
// const diasTotales = edad * diasPorAnio;

// alert(`Una persona de ${edad} años ha vivido aproximadamente ${diasTotales} días.`);

//-----Ejercicio 3------------

// const num1 = prompt('Ingresá un valor para num1: ');
// const num2 = prompt('Ingresá un valor para num2: ');
// const resultado = parseInt(num1) + parseInt(num2);

// alert(`La suma de ${num1} y ${num2} es ${resultado}.`);

//-----Ejercicio 4------------
// const edad = prompt('Ingresá tu edad: ');
// const edadMaxima = prompt('Ingresá una edad máxima: ');
// const snackFavorito = prompt('Ingresá tu snack favorito: ');
// const snacksPorDia = prompt('Ingresá la cantidad de snacks que comes por día: ');
// const diasPorAnio = 365;
// const snacksPorAnio = snacksPorDia * diasPorAnio;
// const aniosRestantes = edadMaxima - edad;
// const snacksTotales = aniosRestantes * snacksPorAnio;
// const precioPorUnidad = prompt(`Ingresá el precio por unidad de ${snackFavorito}: `);
// const gastoTotal = snacksTotales * precioPorUnidad;

// alert(`Necesitarás ${snacksTotales} ${snackFavorito} para que te alcancen hasta los ${edadMaxima} años. Esto te va a costar $ ${gastoTotal} .`);

//-----Ejercicio 5------------

// const diasDeViaje = prompt('Ingresá la cantidad de días que vas a estar de viaje: ');
// const presupuestoMaximo = prompt('Ingresá tu presupuesto máximo para todo el viaje: ');
// const comida = prompt('Ingresá la cantidad de comidas que vas a consumir en todo tu viaje: ');

// const gastoTotal = presupuestoMaximo / comida;
// const gastoPorComida = gastoTotal;

// alert(`Podés gastar $ ${gastoPorComida} en cada comida para que te alcance la plata durante los ${diasDeViaje} días de viaje.`);

//-----Ejercicio 6------------

// const nombre = "Gabriela";
// const profesion = "programadora";

// console.log(`${nombre} es ${profesion}.`);

// ----Ejercicio 7------------

const precio = prompt('Ingresá el precio del artículo: ');
const cantidad = prompt('Ingresá la cantidad que llevará: ');

const total = precio * cantidad;

alert(`El cliente debe abonar $${total} en total`);
