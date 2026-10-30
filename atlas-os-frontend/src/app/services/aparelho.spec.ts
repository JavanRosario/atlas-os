import { TestBed } from '@angular/core/testing';
import { Aparelho } from './aparelho';

describe('Aparelho', () => {
  let service: Aparelho;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Aparelho);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
