package m1;

public class Main {
	public static void main (String[]args){

        //NIVELL 1
        System.out.println("NIVELL 1");
        //Fase 1
        System.out.println("\nFASE 1");
        String nom = "Julio";
        String cognom1 = "Altisent";
        String cognom2 = "Martinez";
        int dia = 6;
        int mes = 4;
        int any = 1992;

        System.out.println(cognom1 + " " + cognom2 + ", " + nom);
        System.out.println(dia + "/" + mes + "/" + any);


        //Fase 2
        System.out.println("\nFASE 2");
        final int YEAR = 1948;
        int traspas = 4;
        int numTraspas = 0;

        System.out.println("Anys de traspàs des de 1948 fins 1992:");
        for(int i = YEAR; i < any; i = i + traspas){
            System.out.print(i + " ");
        }

        for(int i = YEAR; i < any; i = i + traspas){
            numTraspas++;
        }
        System.out.println("\nNombre d'anys de trapàs desde 1948 fins 1992: " + numTraspas);

        //Fase 3
        System.out.println("\nFASE 3");
        
        boolean isTraspas = true;
        String traspasTrue = "L'any 1992 és de traspàs.";
        String traspasFalse = "L'any 1992 no és de traspàs.";

        if(isTraspas == true){
            System.out.println(traspasTrue);
        } else {
            System.out.println(traspasFalse);
        }

        //FASE 4
        System.out.println("\nFASE 4");

        String nomComplert = nom + " " + cognom1 + " " + cognom2;
        String data = dia + "/" + mes + "/" + any;

        System.out.println("El meu nom és " + nomComplert);
        System.out.println("Vaig neixer el " + data);
        
        if(isTraspas == true){
            System.out.println(traspasTrue);
        } else {
            System.out.println(traspasFalse);
        }

        //NIVELL 2
        System.out.println("\nNIVELL 2");

        double valor = 2.4626;
        int valorInt = (int) valor;
        float valorFloat = (float) valor;
        String valorString = Double.toString(valor);

        System.out.println(valor);
        System.out.println(valorInt);
        System.out.println(valorFloat);
        System.out.println(valorString);

        //NIVELL 3
        System.out.println("\nNIVELL 3");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aux = 10;

        for(int i : array){
            System.out.print(i + " ");
        }

        for(int i = 0; i < array.length; i++){
            array[i] = aux;
            aux--;
        }

        System.out.println("\n");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
