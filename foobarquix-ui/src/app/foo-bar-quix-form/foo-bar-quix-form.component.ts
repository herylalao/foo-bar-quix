import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  inputNumber:string;
  @Output() submitNumberOutput : EventEmitter<string> = new EventEmitter<string>();

  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.inputNumber);
  }

}
