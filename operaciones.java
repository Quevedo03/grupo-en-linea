public class operaciones {
    
 private int suma;
 private int mult;
 private int resta;
 private int numero1,numero2;


    operaciones(int num1,int num2){

    this.numero1=num1;
    this.numero2=num2;

    }


    public void sumaDdosnum(int nume1,int nume2){


        suma = nume1+nume2;

        System.out.println("La suma de los dos numeros es: "+suma);


    }

    public void multDdosnum(int nume1,int nume2){


        mult = nume1*nume2;

        System.out.println("La multipliacion de los dos numeros es: "+mult);


    }


}
