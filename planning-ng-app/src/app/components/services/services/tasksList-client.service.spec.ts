import { TestBed } from '@angular/core/testing';

import { TasksListClientService } from './tasksList-client.service';

describe('TaskslistClientService', () => {
  let service: TasksListClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TasksListClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
