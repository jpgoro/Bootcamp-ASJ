import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardRickAndMortyComponent } from './card-rick-and-morty.component';

describe('CardRickAndMortyComponent', () => {
  let component: CardRickAndMortyComponent;
  let fixture: ComponentFixture<CardRickAndMortyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CardRickAndMortyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CardRickAndMortyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
