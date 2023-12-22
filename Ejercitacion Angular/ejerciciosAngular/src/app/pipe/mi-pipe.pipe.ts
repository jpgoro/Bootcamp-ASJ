import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'miPipe'
})
export class MiPipePipe implements PipeTransform {

  transform(value: number[], ...args: number[]): any {
      
    const numerosPrimos: number[] = [];

    for (const num of value) {
      if (this.esPrimo(num)) {
        numerosPrimos.push(num);
      }
    }

    return numerosPrimos;
  }

  private esPrimo(num: number): boolean {
    if (num < 2) {
      return false;
    }

    for (let i = 2; i <= Math.sqrt(num); i++) {
      if (num % i === 0) {
        return false;
      }
    }

    return true;
  }
   
  }
  


