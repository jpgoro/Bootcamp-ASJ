import { TestBed } from '@angular/core/testing';

import { Proyecto1Service } from './proyecto1.service';

describe('Proyecto1Service', () => {
  let service: Proyecto1Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Proyecto1Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
