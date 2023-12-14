import { Component } from '@angular/core';

@Component({
  selector: 'mi-componente',
  standalone: true,
  imports: [],
  templateUrl: './mi-componente.component.html',
  styleUrl: './mi-componente.component.css'
})
export class MiComponenteComponent {
texto = "Componente secundario";
imagen= "https://st3.depositphotos.com/16706896/34396/i/950/depositphotos_343965250-stock-photo-capybara-in-natural-park-in.jpg"
}
