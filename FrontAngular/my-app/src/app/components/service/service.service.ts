import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  data: any;
  id: any;

  constructor(private http: HttpClient) { }


  // Se crean todos los metodos del CRUD
  // Ademas se hacen 2 peticiones a la API para obtener Roles y Compañias 
  //ya que si se desea añadir una empresa sera desde la BD

  getUsers() {
    return this.http.get('http://localhost:8080/usuario')
  }

  getRoles() {
    return this.http.get("http://localhost:8080/roles")
  }
  getCompanies() {
    return this.http.get("http://localhost:8080/empresas")
  }

  createUsuario(datos: any) {
    const url = 'http://localhost:8080/usuario';
    return this.http.post(url, datos);
  }



  getUserById(id: any): Observable<any> {
    return this.http.get(`http://localhost:8080/usuario/${id}`)
  }

  deleteUsuario(id: any): Observable<any> {
    const apiUrl = 'http://localhost:8080/usuario';
    const url = `${apiUrl}/${id}`;
    return this.http.delete(url)

  }
}
