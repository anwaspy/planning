import {Injectable} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TasksListClientService {

  constructor(private httpClient: HttpClient) {
  }

  public getTasks(): Observable<TodoList[]> {
    return this.httpClient.get<TodoList[]>('http://localhost:8082/tasks');
  }
}

  export interface Deadline {
  day: number;
  month: number;
  year: number;
  hour: number;
  minute: number;
}

 export interface TodoList {
  id: any;
  name: string;
  deadline: Deadline;
}
