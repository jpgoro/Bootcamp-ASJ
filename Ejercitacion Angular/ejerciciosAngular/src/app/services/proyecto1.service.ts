import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Proyecto1Service {

  constructor(private http: HttpClient) {}
  URL_API = 'http://localhost:8080/tareas';



  //GET Tareas
  public getTareas(): Observable<any[]> {
    console.log('HTTP GET');
    return this.http.get<any[]>(this.URL_API);
  }

  //DELETE Tarea
  public deleteTarea(id: any): Observable<any> {
    return this.http.delete<any>(this.URL_API + '/' + id);
  }

  //POST Tarea
  public createTarea(tarea: any): Observable<any> {
    console.log('HTTP POST');
    //return this.http.put<any>(this.URL_API + '/' + id, tarea, {observe: 'reponse', responseType:'text'});
    return this.http.post(this.URL_API, tarea);
  }

  //PUT Tarea
  public updateTarea(id: number, tarea: any): Observable<any> {
    return this.http.put<any>(this.URL_API + '/' + id, tarea);

  }



}
