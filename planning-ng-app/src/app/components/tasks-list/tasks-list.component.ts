import {Component, OnInit} from '@angular/core';
import {TasksListClientService} from "../services/services/tasksList-client.service";

@Component({
  selector: 'tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})

export class TasksListComponent implements OnInit {
  tasks: Array<any>;


  constructor(private tasksListClientService : TasksListClientService) {
  }

  ngOnInit() {
    this.tasksListClientService.getAllTasks().subscribe(value => {
      this.tasks = value;
    });
  }
  //
  // tasks: TasksList[] = [
  //   {
  //     name: 'Paint the eggs',
  //     deadline: new Date(2020, 3, 11, 11, 15)
  //   },
  //   {
  //     name: 'Go to work',
  //     deadline: new Date(2020,3,14,6,15)
  //   },
  //   {
  //     name: 'Bake a cake',
  //     deadline: new Date(2020,3,11,11,25)
  //   },
  //   {
  //     name: 'Pick up the car from mechanic',
  //     deadline: new Date(2020,3,15,16,3)
  //   }
  // ];
}

