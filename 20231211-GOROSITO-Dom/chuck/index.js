//Ejemplo guia

/* fetch(`https://api.chucknorris.io/`)
  .then((response) => response.json()) //convertir a JSON
  .then((json) => {
    console.log(json.name);
    info.innerText = json.name;
    imagen.setAttribute("src", json.sprites.front_default);
  })
  .catch((error) => console.log("Ocurrió un error: " + error)); */



//Fetch

document.addEventListener("DOMContentLoaded", () => {
  const updateButton = document.getElementById("updateButton");
  const jokeElement = document.getElementById("joke");

  updateButton.addEventListener("click", () => {
      // Llamada a la API utilizando fetch
      fetch("https://api.chucknorris.io/jokes/random")
          .then(response => response.json())
          .then(data => jokeElement.textContent = data.value)
          .catch(error => {
              console.error("Error fetching Chuck Norris joke:", error);
          });
  });
});

//Asyn await

/* const consultarApi = async() => {
  const response = await fetch(`https://api.chucknorris.io/jokes/random`)
  const json = await response.json();
  console.log(json.value); */
    //.then((response) => response.json())
    //.then((json) => {
    //  /* json.forEach(comentario => {
    //    console.log(comentario);
    //  }) */
    //  console.log(json.value);
  //  })
//}



/* function sumar(numero, numero2){
  console.log(numero + numero2);
}

const a = () => {
  console.log("hola");
}

const b = (numero, numero2) => numero + numero2; */

/* fetch(`http://www.google.com`)
.then((response) => response.json)
.then(json => {
  console.log(json.value);
}) */