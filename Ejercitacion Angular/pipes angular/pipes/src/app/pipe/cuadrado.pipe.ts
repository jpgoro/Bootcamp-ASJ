import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'cuadrado'
})
export class CuadradoPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): unknown {
    return value * value;
  }

}
