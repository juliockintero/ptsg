import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UsuarioComponent } from './components/usuario/usuario.component';
import { ListUsuariosComponent } from './list-usuarios/list-usuarios.component';
import { AppRoutingModule } from './app-routing.module';
import { FormUsuarioComponent } from './form-usuario/form-usuario.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';



@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    ListUsuariosComponent,
    FormUsuarioComponent,
    NavbarComponent,


  ],
  imports: [
    BrowserModule, AppRoutingModule, HttpClientModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
