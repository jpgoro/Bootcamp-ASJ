// Obtener el carrito del localStorage
            // let carrito = JSON.parse(localStorage.getItem('carrito')) || [];

            // // Mostrar los productos en el carrito
            // const listaCarrito = document.getElementById('listaCarrito');
            // carrito.forEach(producto => {
            //     const li = document.createElement('li');
            //     li.textContent = `${producto.nombre} - Precio: ${producto.precio}`;
            //     listaCarrito.appendChild(li);
            // });


let carrito = JSON.parse(localStorage.getItem('carrito')) || [];

function renderizarCarrito() {
    const listaCarrito = document.getElementById('listaCarrito');
    const totalPagarElement = document.getElementById('total');
    let totalPagar = 0;

    // Limpia contenido anterior
    listaCarrito.innerHTML = '';

    // Mostrar productos en el carrito en la lista y se agrega boton eliminar
    carrito.forEach((producto, index) => {
        const li = document.createElement('li');
        li.innerHTML = `
            ${producto.nombre} - Cantidad: ${producto.cantidad} - Subtotal: $${producto.subtotal.toFixed(2)}
            <button class="btn btn-danger btn-sm eliminarBtn" data-index="${index}">Eliminar</button>
        `;
        listaCarrito.appendChild(li);

        // Actualiza total a pagar
        totalPagar += producto.subtotal;
    });

    // Actualizar el total a pagar
    totalPagarElement.textContent = totalPagar.toFixed(2);

    // Asociar evento para eliminar producto
    const eliminarBtns = document.querySelectorAll('.eliminarBtn');
    eliminarBtns.forEach(btn => {
        btn.addEventListener('click', function () {
            const index = this.getAttribute('data-index');
            eliminarProducto(index);
            renderizarCarrito();
        });
    });
}

// Función para eliminar un producto del carrito
function eliminarProducto(index) {
    carrito.splice(index, 1);
    localStorage.setItem('carrito', JSON.stringify(carrito));
}

// Función para vaciar el carrito
function vaciarCarrito() {
    carrito = [];
    localStorage.setItem('carrito', JSON.stringify(carrito));
    renderizarCarrito();
}

// Función para procesar el pago
function pagar() {
    if (carrito.length > 0) {
        // Aquí puedes implementar la lógica de pago real
        // Puedes mostrar un mensaje simulando el éxito del pago
        const mensajeCompra = document.getElementById('mensajeCompra');
        mensajeCompra.textContent = 'Su compra se realizó con éxito. ¡Que la disfrutes!';
        vaciarCarrito();
    } else {
        alert('El carrito está vacío. Agrega productos antes de pagar.');
    }
}

// Renderizar el carrito al cargar la página
renderizarCarrito();

// Asociar eventos a los botones
const pagarBtn = document.getElementById('pagarBtn');
pagarBtn.addEventListener('click', pagar);

const vaciarCarritoBtn = document.getElementById('vaciarCarritoBtn');
vaciarCarritoBtn.addEventListener('click', vaciarCarrito)