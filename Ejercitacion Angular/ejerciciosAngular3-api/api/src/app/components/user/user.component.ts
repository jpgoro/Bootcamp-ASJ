import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
})
export class UserComponent implements OnInit {
  constructor(public userService: UserService) {}

  usuarios: any = [];

  mensaje: string = '';

  ngOnInit(): void {
    this.list();
  }

  resetForm(form: NgForm) {
    form.reset();
    this.userService.datosUsuario = {
      id: -1,
    };

    setTimeout(() => {
      this.mensaje = '';
      console.log('Esperandooooo...');
    }, 2500);
  }

  //Listado de Usuarios
  list() {
    this.userService.getUsers().subscribe((res) => {
      //console.log('Respuesta del GET ', res);
      this.usuarios = res.data;
      console.log('Listado actualizado');
    });
  }

  //Nuevo Usuario
  create(form: NgForm) {
    if (form.value.id != -1) {
      //actualizo
      this.userService.updateUser(form.value).subscribe((res) => {
        console.log('Respuesta del PUT' + res);
        this.mensaje = 'Usuario actualizado correctamente';
        this.resetForm(form); //llamo al metodo resetForm
        this.list(); //actualizo listado
      });
    } else {
      //crear un nuevo usuario
      if (!form.valid) {
        console.log('Formulario invalido');
        return;
      } else {
        const usu = {
          name: form.value.name,
          job: form.value.job,
        };
        this.userService.createUser(usu).subscribe((res) => {
          console.log('Respuesta del POST' + res);
          this.mensaje = 'Usuario creado correctamente';
          this.resetForm(form); //limpia los inputs del formulario
          this.list(); //actualizo listado
        });
        console.log('PROBANDOOOOO');
      }
    }
  }

  //Eliminar Usuario
  delete(id: any) {
    let confirmacion = confirm('¿Desea eliminar el Usuario #' + id + '?');
    if (confirmacion) {
      this.userService.deleteUser(id).subscribe((res) => {
        console.log('Respuesta del DELETE', res);
        this.list();
      });
    }
  }

  //Actualiza Usuario
  update(usu: any) {
    console.log(usu);
    this.userService.datosUsuario = {
      id: usu.id,
      name: usu.first_name,
      job: 'Astrofísico',
    };
  }
}
