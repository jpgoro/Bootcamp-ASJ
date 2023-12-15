import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './components/main/main.component';
import { Proyecto1Component } from './components/proyecto1/proyecto1.component';
import { SimpsonComponent } from './components/simpson/simpson.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent },
  {path: 'todo', component: Proyecto1Component},
  {path: 'simpson', component: SimpsonComponent},
  {path:'**', pathMatch:'full', redirectTo:'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
