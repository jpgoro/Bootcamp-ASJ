import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  compras = ["Lechuga", "zanahoria", "morron" ];
  texto1="Comida para carpinchos"
  imagen='https://www.cronista.com/files/image/401/401221/618bebe24727e_950_534!.jpg?s=20e6325c425057ddb34c7083fff29abc&d=1652134936'
  carpinchos="Ingrese número de carpichos"
}
