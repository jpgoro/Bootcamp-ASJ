




// Definición del arreglo de colores
let colors = ["rgb(240, 14, 128)", "rgb(64, 224, 208)", "rgb(255, 0, 0)", "rgb(0, 255, 0)", "rgb(0, 0, 255)", "rgb(255, 255, 0)"];

// Selección de todos los cuadrados
let cuadrados = document.querySelectorAll(".square");

// Asignación de colores a los cuadrados
for (let i = 0; i < cuadrados.length; i++) {
    let cuadrado = cuadrados[i];
    cuadrado.style.backgroundColor = colors[i];

    // Evento de click en cada cuadrado
    cuadrado.addEventListener("click", () => cuadradoClickeado(cuadrado));
}

// Seleccionar el elemento colorDisplay
const colorDisplay = document.getElementById("colorDisplay");

// Variable para el color ganador
let pickedColor = pickColor();

// Mostrar el código RGB del color ganador
colorDisplay.textContent = pickedColor;

// Función para manejar cuando se hace clic en un cuadrado
function cuadradoClickeado(cuadrado) {
    const clickedColor = cuadrado.style.backgroundColor;

    // Verificar si el color clickeado es correcto
    if (clickedColor === pickedColor) {
        message.textContent = "¡Correcto!";
        changeColors(clickedColor);
        h1.style.backgroundColor = clickedColor;
        reset.textContent = "Jugar de nuevo";
    } else {
        cuadrado.style.backgroundColor = "#232323";
        message.textContent = "Inténtalo nuevamente";
    }
}

// Función para cambiar el color de todos los cuadrados
function changeColors(color) {
    for (let i = 0; i < cuadrados.length; i++) {
        cuadrados[i].style.backgroundColor = color;
    }
}

// Función para seleccionar un color aleatorio del arreglo
function pickColor() {
    const random = Math.floor(Math.random() * colors.length);
    return colors[random];
}

// Función para generar un color aleatorio en formato RGB
function randomColor() {
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);
    return `rgb(${r}, ${g}, ${b})`;
}

// Función para generar el arreglo de colores de forma aleatoria
function generateRandomColors(num) {
    const arrayColores = [];
    for (let i = 0; i < num; i++) {
        const randomColorCreated = randomColor();
        arrayColores.push(randomColorCreated);
    }
    return arrayColores;
}

// Evento de clic en el botón de reinicio
reset.addEventListener("click", () => {
    // Restablecer el juego
    colors = generateRandomColors(6);
    pickedColor = pickColor();
    colorDisplay.textContent = pickedColor;
    message.textContent = "";
    h1.style.backgroundColor = "steelblue";
    reset.textContent = "Nuevos Colores";

    // Asignar nuevos colores a los cuadrados
    for (let i = 0; i < cuadrados.length; i++) {
        cuadrados[i].style.backgroundColor = colors[i];
    }
});