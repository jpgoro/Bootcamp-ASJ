import { Component, OnInit } from '@angular/core';
import { Proyecto1Service } from '../../services/proyecto1.service';

@Component({
  selector: 'app-proyecto1',
  templateUrl: './proyecto1.component.html',
  styleUrl: './proyecto1.component.css'
})

export class Proyecto1Component implements OnInit {


  valor_input = "";
  descripcion_input = "";
  estado_input = "";
  palabras: {nombre: string; descripcion: string; estado: boolean, tachado: boolean; eliminada: boolean}[] = [];
  categoriaSeleccionada: 'todas' | 'eliminadas' | 'finalizadas' = 'todas';

  constructor(private proyecto1Service: Proyecto1Service) {}

  ngOnInit(): void {
    this.obtenerTareas();
  }

  agregar() {
    const nuevaTarea = { nombre: this.valor_input, descripcion: this.descripcion_input, estado: this.estado_input };
    //this.proyecto1Service.createTarea(nuevaTarea).subscribe(
      this.proyecto1Service.createTarea(nuevaTarea).subscribe((res)=>{
        console.log(res);
        alert("usuario creado")
      }
    );
  }

  borrar(id: number) {
    this.proyecto1Service.deleteTarea(id).subscribe(
      response => {
        console.log(response);
        this.obtenerTareas();
      },
      error => {
        console.error(error);
      }
    );
  }

  toggleTachado(id: number, event: Event) {
    event.stopPropagation();
    const tarea = this.palabras.find(t => t.id === id);
    if (tarea) {
      tarea.tachado = !tarea.tachado;
      this.proyecto1Service.updateTarea(id, tarea).subscribe(
        response => {
          console.log(response);
        },
        error => {
          console.error(error);
        }
      );
    }
  }

  obtenerTareas() {
    this.proyecto1Service.getTareas().subscribe(
      tareas => {
        this.palabras = tareas;
      },
      error => {
        console.error(error);
      }
    );
  }

  //Funciones de filtrado
   tareasFiltradas(): { id: number; texto: string; tachado: boolean; eliminada: boolean }[] {
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

/* export class Proyecto1Component {

  valor_input ="";
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
} */


