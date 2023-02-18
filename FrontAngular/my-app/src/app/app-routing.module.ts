import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ListUsuariosComponent } from './list-usuarios/list-usuarios.component';

import { FormUsuarioComponent } from './form-usuario/form-usuario.component';


const routes: Routes = [

  { path: "", component: ListUsuariosComponent },
  { path: "addUser", component: FormUsuarioComponent },
  { path: "editUser/:cedula", component: FormUsuarioComponent },

]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
