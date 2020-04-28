import {Injectable} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TasksListClientService {

  constructor(private httpClient: HttpClient) {
  }

  public getTasks(): Observable<TasksList[]> {
    return this.httpClient.get<TasksList[]>('http://localhost:8082/tasks');
  }
}

 export interface TasksList {
  name: string;
  deadline: Date;
}
