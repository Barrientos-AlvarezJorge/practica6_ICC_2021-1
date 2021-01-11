/**
 *Clase extra de la practica 6. 
 *Clase que ordena los elementos de un arreglo unidimensional de enteros
 *@author Jorge Miguel Aaron Barrientos Alvarez NC:421111666
 *@version 1.0 diciembre 2020
 *@since laboratorio de ICC 2021-1
 */

public class Ordenador implements InterfazOrdenador{
    /**
     * Metodo auxiliar que nos permite imprimir en pantalla un 
     * arreglo
     *@param arreglo el arreglo que se va a imprimir
     */

    public void muestra(int[] arreglo){
	for(int i=0; i<arreglo.length; i++)
	    System.out.print(arreglo[i]+" ");

	System.out.println("\n");
    }

    @Override
    public int[] selectionSort(int[] numeros){
	int aux=0;
	for(int i=0; i<numeros.length-1; i++){
	    for(int k=i+1; k<numeros.length; k++){
		if(numeros[k]<numeros[i]){
		    aux=numeros[i];
		    numeros[i]=numeros[k];
		    numeros[k]=aux;
		}
	    }
	}
	return null;
    }

    @Override
    public int[] insertionSort(int[] numeros){
	int aux=0;
	for(int i=1; i<numeros.length; i++){
	    for(int k=0; k<=i; k++){
		if(numeros[i]<numeros[k]){
		    aux=numeros[k];
		    numeros[k]=numeros[i];
		    numeros[i]=aux;
		}
	    }
	}
	return null;
    }

    public static void main(String[] args){
	Ordenador aldaba=new Ordenador();
	int[] pruebaSelection={2,5,1,8,3,-3};
	int[] pruebaInsertion={3,1,4,2,7,3,6};

	System.out.println("ORDENAMIENTO CON METODO SELECTION SORT\n");
	System.out.println("Si ordenamos, de menor a mayor, los elementos "+
			   "del arreglo ");
	aldaba.muestra(pruebaSelection);
	System.out.println("Obtendriamos el siguiente arreglo");
	aldaba.selectionSort(pruebaSelection);
	aldaba.muestra(pruebaSelection);
	

	System.out.println("ORDENAMIENTO CON METODO INSERTION SORT\n");
	System.out.println("Si ordenamos, de menor a mayor, los elementos "+
			   "del arreglo ");
	aldaba.muestra(pruebaInsertion);
	System.out.println("Obtendriamos el siguiente arreglo");
	aldaba.selectionSort(pruebaInsertion);
	aldaba.muestra(pruebaInsertion);	
    }
}
