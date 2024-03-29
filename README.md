Curso de Data Structure!

-Metodo busqueda biniraio: *Busqueda Binaria consiste en buscar un numero, en un Array ordenado, donde lo primero que hacemos, 
es establecer un inicio y un final en nuestro arreglo. -Donde nuesta variable inicio == 0, para iguualarla a la primera posicion 
de nuestro Array. -Donde nuestra variable final = array.lenght - 1; (Esto va a la ultima posicion de nuestro Array)

-Condiciones que debes tener:

    Debemos verificar si nuestro array no esta vacio!
    Si tiene elementosprocedemos a dividir nuestro Array!
    -Ahora luego que hemos establecido un inicio y final, debemos realizar una operacion para dividir nuestro Array en la mitad!

Para eso tenemos la siguiente operacion:

1. Creamos una variable tipo entero: int indice = (inicio + final) / 2; //De esa manera ya hemos 
divido nuestro arreglo!
2. Ahora! Debemos tener en cuenta, que Mientras nuestro arreglo no este vacio, "Dividir nuestro
arreglo y comenzar la busqueda Binaria"
A que te suena ese Mientras?
3. Creamos un ciclo while, para que se ejecute todo mientras (la condiciona anterior)!
4: Codigo quedaria de esta manera:

        while(inicio < final){
        //dividimos nuestro arreglo
        int indice = (inicio + final) / 2;
  
        //luego vienen las condiciones que debemos tener!
        }
  
Condiciones de Busqueda!
1. Supongamos que tenemos una variable (int numero) que va a ser el numero que estamos buscando!
2. ahora imagina que tenemos un arreglo ya definido. array[indice] donde array es nuestro arreglo 
y OJO! indice es el numero en el medio del arreglo!

       AHORA DIGAMOS QUE TENEMOS ESTE ARREGLO:
       0 - 1 - 2 - 4 - 5 - 6

Primera condicion:

    -si el array en la posicion indice que es (3) es == al numero que estamos buscando
    consola: return indice; //porque ya encontramos el numero!
    -sino, si tenemos que el array[indice] < al numero que estamos buscando entonces:
    quiere decir que el numero que estamos buscando, (teniendo 0 - 1 - 2 - 3 - 4 - 5 -6) 
    donde inicio es 0 y final es 6 y mitad es 3; 
    la variable inicio debe actualizar de esta manera inicio = indice + 1;

  Explicacion: Sabemos que indice es 3; y la condicion dice que si indice < al numero que
  estamos buscando y digamos que ese numero que estamos buscando
  es 5, quiere decir q si se cuumple esa condicion entonces, el programa ya sabe que el
  numero buscado esta entre 4 - 5 - 6,
  donde 4 ahora es nuestro inicio, 6 sigue siendo nuestro final y
  ahora el indice es 5, "siempre indice va al medio del arreglo"
  
    Arreglo antes de la condicion:
      0  - 1  -  2  -  3  -  4  -  5  -  6
    inicio           indice            final      

 
Arreglo si la condicion se cumple: if(array[indice] < numero) inicio debe actualizarse a indice + 1 
que es igual a 4 porque ya sabes que el numero buscado no es el indice y no es lo numeros anterior 
a indice entonces indice ya no puede ser ni 0 y tampoco 3, debe ser 4. Y el final se queda igual 
porque no hemos trabajado con esa variable!

    0  - 1  -  2  -  3  -  4  -  5  -  6
                        inicio       final      
                        
  //Ahora sabiendo que indice siempre debe ir a la mitad de nuestro arreglo, 
  en este caso seria:
  
      0  - 1  -  2  -  3  -  4  -  5  -  6
                         inicio  indice final      
