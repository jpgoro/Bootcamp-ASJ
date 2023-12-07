// const boton = document.getElementById('boton');
// const nombreProducto = document.getElementById('nombre').textContent;
// const precioProducto = document.getElementById('precio').textContent;

// boton.addEventListener('click', function () {
//     // Crear un objeto con la información del producto
//     const producto = {
//         nombre: nombreProducto,
//         precio: precioProducto
//     };

//     // Obtener el carrito actual del localStorage (si existe)
//     let carrito = JSON.parse(localStorage.getItem('carrito')) || [];

//     // Agregar el nuevo producto al carrito
//     carrito.push(producto);

//     // Guardar el carrito actualizado en el localStorage
//     localStorage.setItem('carrito', JSON.stringify(carrito));
// });


const boton = document.getElementById('boton');
const nombreProducto = document.getElementById('nombre').textContent;
const precioProducto = parseFloat(document.getElementById('precio').textContent.replace('$', ''));

boton.addEventListener('click', function () {
    // Crear un objeto con la información del producto
    const producto = {
        nombre: nombreProducto,
        precio: precioProducto,
        cantidad: 1,
        subtotal: precioProducto
    };

    // Obtener el carrito actual del localStorage en caso de que exista
    let carrito = JSON.parse(localStorage.getItem('carrito')) || [];

    // Verificar si el producto ya está en el carrito
    const productoExistente = carrito.find(item => item.nombre === producto.nombre);
    if (productoExistente) {
        // Incrementar la cantidad y actualizar el subtotal
        productoExistente.cantidad++;
        productoExistente.subtotal = productoExistente.cantidad * productoExistente.precio;
    } else {
        // Agregar el nuevo producto al carrito
        carrito.push(producto);
    }

    // Guardar el carrito actualizado en el localStorage
    localStorage.setItem('carrito', JSON.stringify(carrito));
});

