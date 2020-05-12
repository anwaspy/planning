import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})

export class TasksListClientService {
  private tasksUrl = 'http://localhost:8080/tasks';

  constructor(private httpClient: HttpClient) {
  }

  public getAllTasks(): Observable<any> {
    return this.httpClient.get(this.tasksUrl);
  }
}


