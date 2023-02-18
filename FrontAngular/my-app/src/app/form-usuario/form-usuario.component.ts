import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../components/service/service.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-form-usuario',
  templateUrl: './form-usuario.component.html',
  styleUrls: ['./form-usuario.component.css']
})
export class FormUsuarioComponent implements OnInit {

  companies: any;
  roles: any;
  id: any;
  dataForm = {
    "cedula": "",
    "primernombre": "",
    "segundonombre": "",
    "primerapellido": "",
    "segundoapellido": "",
    "password": "",
    "email": "",
    "estado": 1,
    "empresa": {
      "nit": "",
      "nombre": "",
      "estado": null,
      "libre": null
    },
    "rol": {
      "id": "",
      "rol": "",
      "estado": ""
    }
  }

  usuario: any[] = [];

  createUser() {
    console.log(this.dataForm)
    this.myService.createUsuario(this.dataForm).subscribe(resp => {
      console.log(resp)

      this.router.navigate(['/']);

    })
  }
  constructor(private myService: ServiceService, private router: Router, private route: ActivatedRoute) { }
  ngOnInit(): void {

    this.id = this.route.snapshot.paramMap.get('cedula')
    if (this.id !== null && this.id !== undefined) {
      this.myService.getUserById(this.id).subscribe(resp => {
        console.log(resp)
        this.dataForm = resp
      })
    }


    this.myService.getCompanies().subscribe(resp => {
      this.companies = resp
    })


    this.myService.getRoles().subscribe(resp => {
      this.roles = resp

    })


  }

}
