import { Component } from '@angular/core';

@Component({
  selector: 'app-simpson',
  templateUrl: './simpson.component.html',
  styleUrl: './simpson.component.css'
})
export class SimpsonComponent {
  nombreInput = '';
  imagenInput = '';
  profesionInput = '';
  datosTabla: { imagen: string, nombre: string, profesion: string }[] = [];

  agregarInformacion() {
    const nuevaFila = {
      imagen: this.imagenInput,
      nombre: this.nombreInput,
      profesion: this.profesionInput
    };

    this.datosTabla.push(nuevaFila);

    
    this.nombreInput = '';
    this.imagenInput = '';
    this.profesionInput = '';
  }
}
