import { Component } from '@angular/core';

@Component({
  selector: 'app-proyecto1',
  templateUrl: './proyecto1.component.html',
  styleUrl: './proyecto1.component.css'
})
export class Proyecto1Component {

  valor_input ="";
  palabras: { texto: string; tachado: boolean }[] = [];
  agregar(){
    this.palabras.push({ texto: this.valor_input, tachado: false });
    this.valor_input = "";
  }

  borrar(index: number) {
    this.palabras.splice(index, 1);
  }
  toggleTachado(index: number) {
    this.palabras[index].tachado = !this.palabras[index].tachado;
  }

}
