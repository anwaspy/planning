import {Component, OnInit} from '@angular/core';
import {TasksList, TasksListClientService} from "../services/services/tasksList-client.service";

/*export interface TasksList {
  name: string;
  deadline: Date;
}*/

@Component({
  selector: 'tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})

export class TasksListComponent implements OnInit {
  tasksList : TasksList[];

  constructor(private tasksListClientService : TasksListClientService) {
  }

  ngOnInit(): void {
    this.tasksListClientService.getTasks().subscribe(value => {
      this.tasksList = value;
    });
  }

/*  tasks: TasksList[] = [
    {
      name: 'Paint the eggs',
      deadline: new Date(2020, 3, 11, 11, 15)
    },
    {
      name: 'Go to work',
      deadline: new Date(2020,3,14,6,15)
    },
    {
      name: 'Bake a cake',
      deadline: new Date(2020,3,11,11,25)
    },
    {
      name: 'Pick up the car from mechanic',
      deadline: new Date(2020,3,15,16,3)
    }
  ];*/
}

