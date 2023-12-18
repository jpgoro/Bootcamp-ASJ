import { Component, OnInit } from '@angular/core';
import { ServiceRickService } from '../../services/service-rick.service';

@Component({
  selector: 'app-rick-and-morty',
  templateUrl: './rick-and-morty.component.html',
  styleUrl: './rick-and-morty.component.css'
})
export class RickAndMortyComponent implements OnInit {

  personajes: any = [];

  constructor(public miServicio : ServiceRickService){}

  ngOnInit(): void {
    this.miServicio.getDataAPI().subscribe((data: any)=>{
      console.log(data);
      this.personajes = data;
    })

  }

}
