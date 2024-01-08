import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes1',
  templateUrl: './pipes1.component.html',
  styleUrl: './pipes1.component.css'
})
export class Pipes1Component {
  title = 'Pacticando Pipes';
  nombre = 'juan pablo';
  apellido = 'GoRoSitO'
  total = 413.2;
  fechaHoy = new Date()
}
