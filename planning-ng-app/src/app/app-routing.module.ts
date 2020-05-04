import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TasksListComponent} from "./components/tasks-list/tasks-list.component";


const routes: Routes = [
  {path:'task', component: TasksListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
