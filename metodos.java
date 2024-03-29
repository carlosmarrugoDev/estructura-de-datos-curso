public class metodos {
    int[] array; // Arreglo Global
    int cant;

    public metodos(int dimension) {
        array = new int[dimension];
        cant = 0;
    }
    //Metodo de Insercion!
    public int insertarInicio(int dato){
        if(cant == array.length){
            System.out.println("Array LLeno!");
            return cant;
        } else {
            if(cant >= 1){
                for(int i = cant - 1; i >= 0; i--){// 1 - 2 - 3 - 4 - 5 - 6
                    array[i + 1] = array[i];
                }
            }

            array[0] = dato;
            cant++;
            System.out.println(dato + "Insertado!");
        }
        



        return - 1;
    }


    public int busquedaBinaria(int numero) {
        int limiteInferior = 0;
        int limiteSuperior = array.length - 1;

        while (limiteInferior < limiteSuperior) {// Si hay numeros
            int indice = (limiteInferior + limiteSuperior) / 2;// dividir nuestro arreglo

            if (array[indice] == numero) {
                return indice;
            } else if (array[indice] < numero) {
                limiteInferior = indice + 1; // 0 - 6, indice = 3, 4 - 6
            } else {
                limiteSuperior = indice - 1; // 2 - 0
            }
        }
        return -1;
    }

}
