import { Component, OnInit, OnDestroy } from '@angular/core';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  messages:NumberConverted[] = [];

  
  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {
  
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber).subscribe({
      next: result => {
        console.log(JSON.stringify(result));
        this.messages.push({numberToConvert:inputNumber, result:result["result"]});
      },
      error: err => console.error(err)
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
