// let texto = document.getElementById('texto');
// let resultado = document.getElementById('resultado');

// texto.addEventListener('keydown', (e) => {
//     let tecla = e.key;
//     if (tecla == 'a' || tecla == 'e' || tecla == 'i' || tecla == 'o' || tecla == 'u' || tecla == 'A' || tecla == 'E' || tecla == 'I' || tecla == 'O' || tecla == 'U') {
//         resultado.innerHTML += '_';
//     } else {
//         resultado.innerHTML += tecla;
//     }
// });


let texto = document.getElementById('texto');
        let resultado = document.getElementById('resultado');
        let vocales = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];

        function actualizarResultado() {
            let contenido = '';
            for (let i = 0; i < texto.value.length; i++) {
                let caracter = texto.value[i];
                if (vocales.includes(caracter)) {
                    contenido += '_';
                } else {
                    contenido += caracter;
                }
            }
            resultado.innerHTML = contenido;
        }

        texto.addEventListener('keydown', actualizarResultado);
        texto.addEventListener('keyup', actualizarResultado);