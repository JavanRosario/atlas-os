import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ListaCelular } from './lista-celular';

describe('ListaCelular', () => {
  let component: ListaCelular;
  let fixture: ComponentFixture<ListaCelular>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaCelular],
    }).compileComponents();

    fixture = TestBed.createComponent(ListaCelular);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
