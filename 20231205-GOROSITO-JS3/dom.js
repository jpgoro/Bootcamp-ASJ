//DOM

let input = document.getElementById("nom")
let btn = document.getElementById('btn');

btn.addEventListener("click", function() {
    let color = input.style.color;
				if (color === "blue") {
					input.style.color = "red";
				} else {
					input.style.color = "blue";
				}
});






