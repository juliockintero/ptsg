import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { ServiceService } from '../components/service/service.service';

@Component({
  selector: 'app-list-usuarios',
  templateUrl: './list-usuarios.component.html',
  styleUrls: ['./list-usuarios.component.css']
})
export class ListUsuariosComponent implements OnInit {
  datos: any;

  id: any;

  deleteUser(dato: any) {
    this.myService.deleteUsuario(dato.cedula).subscribe(resp => {
      console.log(resp)
    });
    location.reload();
  }



  constructor(private myService: ServiceService, private cdr: ChangeDetectorRef) {
  }
  ngOnInit() {

    //Llamamos el metodo de mi servicio para obtener el listado de los usuarios
    this.myService.getUsers().subscribe(data => {
      this.datos = data
      console.log(data)
      this.cdr.detectChanges();
    })


  }

}
