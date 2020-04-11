import { Component } from '@angular/core';

export interface TasksList {
  name: string;
  deadline: Date;
}

@Component({
  selector: 'tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})

export class TasksListComponent {
  tasks: TasksList[] = [
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
  ];
}

