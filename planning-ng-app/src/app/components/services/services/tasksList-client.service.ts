import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Task} from "../../../task";

@Injectable({
  providedIn: 'root'
})
export class TasksListClientService {

  tasksUrl: string;

  constructor(private httpClient: HttpClient) {
    this.tasksUrl = 'http://localhost:8082/tasks';
  }

  public findAllTasks(): Observable<Task[]> {
    return this.httpClient.get<Task[]>(this.tasksUrl);
  }
}


