const boton = document.getElementById('boton');
const nombreProducto = document.getElementById('nombre').textContent;
const precioProducto = document.getElementById('precio').textContent;

boton.addEventListener('click', function () {
    // Crear un objeto con la información del producto
    const producto = {
        nombre: nombreProducto,
        precio: precioProducto
    };

    // Obtener el carrito actual del localStorage (si existe)
    let carrito = JSON.parse(localStorage.getItem('carrito')) || [];

    // Agregar el nuevo producto al carrito
    carrito.push(producto);

    // Guardar el carrito actualizado en el localStorage
    localStorage.setItem('carrito', JSON.stringify(carrito));
});