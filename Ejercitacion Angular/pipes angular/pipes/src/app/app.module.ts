import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Pipes1Component } from './components/pipes1/pipes1.component';
import { MiPipeComponent } from './pipe/mi-pipe/mi-pipe.component';
import { MiPipePipe } from './pipe/mi-pipe.pipe';
import { CuadradoPipe } from './pipe/cuadrado.pipe';

@NgModule({
  declarations: [
    AppComponent,
    Pipes1Component,
    MiPipeComponent,
    MiPipePipe,
    CuadradoPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
