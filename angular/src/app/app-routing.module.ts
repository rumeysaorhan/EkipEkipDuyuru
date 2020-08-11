import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EkipduyuruListComponent } from './ekipduyuru-list/ekipduyuru-list.component';
import { CreateEkipDuyuruComponent } from './create-ekipduyuru/create-ekipduyuru.component';
import { EkipduyuruUpdateComponent } from './ekipduyuru-update/ekipduyuru-update.component';


const routes: Routes = [
  { path: 'ekipduyuru', component: EkipduyuruListComponent },
  { path: '', redirectTo: 'ekipduyuru', pathMatch: 'full' },
  { path: 'ekipduyuru-add', component: CreateEkipDuyuruComponent },
  { path: 'ekipduyuru-update/:id', component: EkipduyuruUpdateComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
