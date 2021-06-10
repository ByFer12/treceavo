import java.util.Scanner;

public class treceavo {
    public static void main(String[] args) {
        double num1,num2, suma,resta, mult,div;
        int opcion,salir=0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingese Un numero: ");
        num1=ent.nextDouble();
        System.out.println("Ingrese otro numero: ");
        num2=ent.nextDouble();
        do{
            System.out.println("Opciones...");
            System.out.println("1-- Suma");
            System.out.println("2-- Resta");
            System.out.println("3-- Multiplicacion");
            System.out.println("4-- Division");
            System.out.println("5-- Salir");
            System.out.println("Elija una de las opciones");
            opcion=ent.nextInt();
            switch(opcion){
                case 1:
                    suma=num1+num2;
                    System.out.println("La suma es: "+suma);
                    salir=1;
                break;
                case 2:
                resta=num1-num2;
                System.out.println("La resta es: "+resta);
                salir=1;
                break;
                case 3:

                mult=num1*num2;
                System.out.println("La Multiplicacion es: "+mult);
                salir=1;
                break;
                case 4:
                
                if(num2!=0){
                    div=num1/num2;
                    System.out.println("La division es: "+div);
                }else{
                    System.out.println("El segundo numero es cero, no se puede realizar esta acción");
                }
                
                salir=1;
                break;
                case 5:
                salir=1;

                break;
                default:
                System.out.println("El numero ingresado no es parte del menú: ");



            }

        }while(salir!=1);
    }
}
