import { Component } from '@angular/core';

@Component({
  selector: 'app-proyecto1',
  templateUrl: './proyecto1.component.html',
  styleUrl: './proyecto1.component.css'
})
export class Proyecto1Component {

  valor_input ="";
  /* palabras: { texto: string; tachado: boolean }[] = [];
  agregar(){
    this.palabras.push({ texto: this.valor_input, tachado: false });
    this.valor_input = "";
  }

  borrar(index: number) {
    this.palabras.splice(index, 1);
  }
  toggleTachado(index: number) {
    this.palabras[index].tachado = !this.palabras[index].tachado;
  } */
  palabras: { texto: string; tachado: boolean; eliminada: boolean }[] = [];
  categoriaSeleccionada: 'todas' | 'eliminadas' | 'finalizadas' = 'todas';

  agregar() {
    this.palabras.push({ texto: this.valor_input, tachado: false, eliminada: false });
    this.valor_input = "";
  }

  borrar(index: number) {
    this.palabras[index].eliminada = true;
  }

  toggleTachado(index: number, event: Event) {
    event.stopPropagation();
    this.palabras[index].tachado = !this.palabras[index].tachado;
  }

  // Funciones de filtrado
  tareasFiltradas(): { texto: string; tachado: boolean; eliminada: boolean }[] {
    switch (this.categoriaSeleccionada) {
      case 'eliminadas':
        return this.palabras.filter(tarea => tarea.eliminada);
      case 'finalizadas':
        return this.palabras.filter(tarea => tarea.tachado);
      default:
        return this.palabras.filter(tarea => !tarea.eliminada || tarea.tachado);
    }
  }
}


