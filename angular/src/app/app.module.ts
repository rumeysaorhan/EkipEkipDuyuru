import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';
import { CreateEkipDuyuruComponent } from './create-ekipduyuru/create-ekipduyuru.component';
import { EkipduyuruListComponent } from './ekipduyuru-list/ekipduyuru-list.component';
import { EkipduyuruUpdateComponent } from './ekipduyuru-update/ekipduyuru-update.component';
import { NavComponent } from './nav/nav.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    SerachDeleteComponent,
    CreateEkipDuyuruComponent,
    EkipduyuruListComponent,
    EkipduyuruUpdateComponent,
    NavComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
