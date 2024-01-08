import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs'; //Gracias Bill!!!!
//import { Usuario } from '../models/Usuarios';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}

  URL_API = 'https://reqres.in/api/users';

  //import models

  datosUsuario: any = {
    id: -1,
    name: '',
    job: '',
  };

  //GET Usuarios
  public getUsers(): Observable<any> {
    console.log('HTTP GET');
    return this.http.get(this.URL_API);
  }

  //POST Usuario
  public createUser(usuario: any): Observable<any> {
    console.log('HTTP POST');
    return this.http.post(this.URL_API, usuario);
  }

  //DELETE Usuario
  public deleteUser(id: any): Observable<any> {
    return this.http.delete(this.URL_API + '/' + id);
  }

  //PUT Usuario
  public updateUser(usuario: any): Observable<any> {
    return this.http.put(this.URL_API + '/' + this.datosUsuario.id, usuario);
  }
}

// COMPONENTE A <---> SERVICIO <----> SERVIDOR/BD/BACKEND
// COMPONENTE B
