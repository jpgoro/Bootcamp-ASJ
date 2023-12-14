// Vinculamos la función cargarCiudad al botón "ENVIAR"
document.getElementById("enviar").addEventListener("click", cargarCiudad);

function cargarCiudad() {
  // Obtenemos el valor ingresado en el input de la ciudad
  const ciudad = document.getElementById("ciudad").value;
  const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${ciudad}&appid=TU_API_KEY`;

  fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
      // Hacemos visible el contenedor
      document.querySelector(".container").style.visibility = "visible";

      // Mostramos el nombre de la ciudad
      document.getElementById("ciudad").textContent = data.name;

      // Mostramos la temperatura actual con el símbolo de Celsius
      document.getElementById("temperatura").innerHTML = `${data.main.temp}<sup>°C</sup>`;

      // Mostramos el ícono que ilustra la condición climática
      const iconUrl = `https://openweathermap.org/img/w/${data.weather[0].icon}.png`;
      document.getElementById("wicon").src = iconUrl;

      // Mostramos la descripción del clima actual
      document.getElementById("descripcion").textContent = data.weather[0].description;
    })
    .catch(error => {
      console.error("Error al cargar los datos:", error);
    });
}