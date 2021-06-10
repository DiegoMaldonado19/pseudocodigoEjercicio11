/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Arreglos para poder almacenar los numeros aleatorios y los numeros que sean pares
         */
        int[] numeroAleatorioGenerado = new int[10];
        int[] numeroGeneradoPar = new int[10];

        /**
         * Variables enteras que serviran para realizar los distintos calculos
         */
        int contadorPares=0, contadorImpares=0, sumatoriaPares=0, numeroMayor=0, numeroMenor=36, contadorSegundaDocena=0,
        resto=0, promedio=0;

        /**
         * Ciclo for para llenar el arreglo de numeros aleatorios y luego mostrarlos en pantalla
         */
        for(int i=0; i<numeroAleatorioGenerado.length; i++){
            numeroAleatorioGenerado[i] = (int)(Math.random()*36+1);
            System.out.println("Numero aleatorio "+(i+1)+" = "+numeroAleatorioGenerado[i]);
        }

        /**
         * Ciclo para evaluar cada numero aleatorio generado y asi saber si es par o impar
         */
        for(int i=0; i<numeroAleatorioGenerado.length; i++){
            resto = numeroAleatorioGenerado[i]%2;

            /**
             * Condicional para saber si es par o impar
             */
            if(resto!=0){
                contadorImpares += 1;
            }
            else if(resto==0){
                numeroGeneradoPar[contadorPares] = numeroAleatorioGenerado[i];
                contadorPares += 1;
            }
        }
        /**
         * Ciclo para realizar la sumatoria de numeros pares generados
         * Y posterior calculo del promedio de estos
         */
        for(int i=0; i<contadorPares; i++){
            sumatoriaPares += numeroGeneradoPar[i];
        }
        promedio = sumatoriaPares/contadorPares;

        /**
         * Se imprimen en pantalla los resultados
         */
        System.out.println("La cantidad de numeros Impares es: "+contadorImpares);
        System.out.println("El promedio de los numeros pares es: "+ promedio);
        /**
         * Ciclo para saber qué numeros se encuentran en la segunda docena del rango
         */
        for(int i=0; i<numeroAleatorioGenerado.length; i++){
            if(numeroAleatorioGenerado[i]>=13 && numeroAleatorioGenerado[i]<=24){
                contadorSegundaDocena += 1;
            }
        }
        /**
         * Imprimimos en pantalla la cantidad de numeros en la segunda docena
         */
        System.out.println("El total de numeros dentro de la segunda docena es: "+contadorSegundaDocena);

        /**
         * Ciclo para evaluar cual es el numero mayor y menor generado aleatoriamente
         */
        for(int i=0; i<numeroAleatorioGenerado.length; i++){
            /**
             * Condicional para asignar los valores
             */
            if(numeroAleatorioGenerado[i]>numeroMayor){
                numeroMayor = numeroAleatorioGenerado[i];
            }
            else if(numeroAleatorioGenerado[i]<numeroMenor){
                numeroMenor = numeroAleatorioGenerado[i];
            }
        }
        /**
         * Imprimimos en pantalla
         */
        System.out.println("El numero mayor generado es: "+numeroMayor);
        System.out.println("El numero menor generado es. "+numeroMenor);
    }
}
