import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class ArtekArrays {
        Random random = new Random(); //crear objeto Random

    //Método que genera un arreglo de entero con 100 elementos [1,50]
    public int[] MakeRandomNumbers(){
            int[] numbers = new int[100]; //crear arreglo de 100 enteros
            //asignar valores aleatorios a cada elemento del arreglo
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(50) + 1; //generar números aleatorios entre 1 y 50
            }
            System.out.println("Arreglo: [");
            //imprimir los valores del arreglo
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length-1) {
                    System.out.print(numbers[i] + "");
                }else{
                    System.out.print(numbers[i] + ", ");
                }
                if ((i + 1) % 10 == 0) { //imprimir salto de línea cada 10 elementos
                    System.out.println();
                }
            }System.out.print("]");
            return numbers;
        }
    //Método que recibe como argumento un array de enteros y regresa el promedio
    public float AverageNumbers(int[] numbers) {
        float average = 0f;
        int sum = 0;

        // Verificar que el arreglo no está vacío
        if (numbers.length > 0) {
            System.out.print("\nArreglo - Numbers: [");
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                if (i == numbers.length-1) {
                    System.out.print(numbers[i] + "");
                }else{
                    System.out.print(numbers[i] + ", ");
                }
            }
            System.out.println("]");
            average = (float) sum / numbers.length;
            System.out.println("\nEl promedio del arreglo es: " + average);
        } else {
            System.out.println("\nEl arreglo está vacío");
        }

        return average;
    }
    //Método que recibe como argumento un array de enteros y regresa la mediana
    public float MedianaNumbers(int[] numbers) {
        int mediana=0;
        int index = 0;
        if (numbers.length%2 == 0) {
            for (int i = 0; i < numbers.length/2; i++) {
                index = numbers.length/2;
                Arrays.sort(numbers);
                mediana = numbers[i];
            }
            System.out.println("\nLa mediana es: " + mediana+", en la posición: "+index);
        } else {
            for (int i = 0; i < numbers.length/2; i++) {
                index = (numbers.length/2)+1;
                Arrays.sort(numbers);
                mediana = numbers[i+1];
            }
            System.out.println("\nLa mediana es: " + mediana+", en la posición: "+index);
        }

        return mediana;
    }
    //Método que recibe como argumento un array de enteros y regresa la moda
    public float ModaNumber(int[] numbers) {

        int moda = 0;
        int MaxF = 0;

        for (int i=0; i<numbers.length; i++){
            int frecuencia=0;

            for (int j=0; j<numbers.length; j++){
                if(numbers[j]==numbers[i]){
                    frecuencia++;
                }
            }

            if (frecuencia>MaxF){
                moda = numbers[i];
                MaxF = frecuencia;
            }
        }
            System.out.println("\nLa moda de este arreglo es: "+moda+", con una frecuencia de: "+MaxF);
            return moda;
    }
    //Método que recibe como argumento un array de enteros y ordena los elementos descendentemente
    public int[] OrderByDesc(int[] numbers) {
        Integer[] NumDesc = new Integer[numbers.length];
        Arrays.setAll(NumDesc, i -> numbers[i]);
        Arrays.sort(NumDesc, Collections.reverseOrder());
        System.out.print("\nNumbers (desc): [");
        for (int i=0; i<NumDesc.length;i++){
            numbers[i] = NumDesc[i];
            if (i == NumDesc.length-1) {
                System.out.print(numbers[i] + "");
            }else{
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");
        return numbers;
    }
    //Método que recibe como argumento un array de enteros y ordena los elementos ascendentemente
    public int[] OrderByAsc(int[] NumDesc) {
        Integer[] NumAsc = new Integer[NumDesc.length];
        Arrays.setAll(NumAsc, i -> NumDesc[i]);
        Arrays.sort(NumAsc);
        Collections.reverseOrder();
        System.out.print("\nNumbers (asc): [");
        for (int i=0; i<NumAsc.length;i++){
            NumDesc[i] = NumAsc[i];
            if (i == NumAsc.length-1) {
                System.out.print(NumDesc[i] + "");
            }else{
                System.out.print(NumDesc[i] + ", ");
            }
        }
        System.out.println("]");
        return NumDesc;
    }
    //Método que recibe como argumento un array de enteros y selecciona solo los número pares
    public int[] ParNumbers(int [] numbers) {
        int[] Pares = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // si el número es par
                Pares[count] = numbers[i]; // lo agrega al arreglo de pares
                count++;
            }
        }
        // crea un nuevo arreglo con la cantidad exacta de números pares encontrados
        int[] result = new int[count];
        System.out.print("\nLos números pares del arreglo son: [");
        for (int i = 0; i < count; i++) {
            result[i] = Pares[i];
            if (i == result.length-1) {
                System.out.print(Pares[i] + "");
            }else{
                System.out.print(Pares[i] + ", ");
            }
        }
        System.out.println("]");
        return numbers;
    }
    //Método que recibe como argumento un array de enteros y selecciona solo los número impares
    public int[] ImparNumbers(int [] numbers) {
        int[] Impares = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 > 0) { // si el número es par
                Impares[count] = numbers[i]; // lo agrega al arreglo de pares
                count++;
            }
        }
        // crea un nuevo arreglo con la cantidad exacta de números pares encontrados
        int[] result = new int[count];
        System.out.print("\nLos números impares del arreglo son: [");
        for (int i = 0; i < count; i++) {
            result[i] = Impares[i];
            if (i == result.length-1) {
                System.out.print(Impares[i] + "");
            }else{
                System.out.print(Impares[i] + ", ");
            }
        }
        System.out.println("]");
        return numbers;
    }
    //Método que recibe como argumento un array de enteros y selecciona solo los número en
    // posiciones cuyos índices tienen un valor par
    public int[] ParPositionNumber(int[] Numbers) {
        int[] result = new int[(Numbers.length + 1) / 2]; // tamaño del arreglo de resultados

        for (int i = 0; i < Numbers.length; i += 2) {
            result[i / 2] = Numbers[i]; // agregar el valor de la posición par al arreglo de resultados
        }

        System.out.println("\nLos elementos que se encuentran en posiciones 'pares' son: "+Arrays.toString(result)); // imprimir el arreglo de resultados con corchetes en los extremos

        return result;
    }

}


