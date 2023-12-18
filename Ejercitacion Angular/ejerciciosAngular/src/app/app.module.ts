import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MainComponent } from './components/main/main.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { SideComponent } from './components/side/side.component';
import { Proyecto1Component } from './components/proyecto1/proyecto1.component';
import { SimpsonComponent } from './components/simpson/simpson.component';
import { HomeComponent } from './components/home/home.component';
import { RickAndMortyComponent } from './components/rick-and-morty/rick-and-morty.component';
import { CardRickAndMortyComponent } from './components/rick-and-morty/card-rick-and-morty/card-rick-and-morty.component';
import { ServiceRickService } from './services/service-rick.service';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    HeaderComponent,
    FooterComponent,
    SideComponent,
    Proyecto1Component,
    SimpsonComponent,
    HomeComponent,
    RickAndMortyComponent,
    CardRickAndMortyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule, NgbModule, HttpClientModule
  ],
  providers: [ServiceRickService],
  bootstrap: [AppComponent]
})
export class AppModule { }
