import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VideoFormComponent } from './components/video-form/video-form.component';
import { VideoListComponent } from './components/video-list/video-list.component';
import { VideoDetailComponent } from './components/video-detail/video-detail.component';

const routes: Routes = [
  { path: '', component: VideoFormComponent },
  { path: 'videos', component: VideoListComponent },
  { path: 'videos-details/:id}', component: VideoDetailComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
