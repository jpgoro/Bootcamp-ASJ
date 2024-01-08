import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'miPipe'
})
export class MiPipePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    if(args != 'null'){
      if(args != 'ingles'){
        return 'heyyy';
      }else if(args == 'italiano'){
        return 'ciao';
      }else{
        return value.toUpperCase();
      }
    }
    return value + '[Creado por nuestro pipe]';
  }

}
