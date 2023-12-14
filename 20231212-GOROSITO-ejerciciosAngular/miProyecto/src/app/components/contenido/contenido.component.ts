import { Component } from '@angular/core';

@Component({
  selector: 'fernet',
  templateUrl: './contenido.component.html',
  styleUrl: './contenido.component.css'
})
export class ContenidoComponent {
texto="Aguante boquita"

numero: number=0;

generarAleatorio(){
  this.numero = Math.floor(Math.random()*10);
}
incrementar(){
  this.numero++;
}
decrementar(){
  this.numero--;
}

flag=false;

compras = ["frutas", "carne", "morron" ];
}
