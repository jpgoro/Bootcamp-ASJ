import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceRickService {

  constructor(private http: HttpClient) { }
  public getDataAPI(){
    return this.http.get('https://rickandmortyapi.com/api/character/?page=1')
  }

  /* public getDataAPI(id:number){
    return this.http.get('https://rickandmortyapi.com/api/character/' + id);
  } */
}
