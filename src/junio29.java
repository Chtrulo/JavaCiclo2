import java.util.Scanner;

public class junio29 {
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese una palabra");
        //String entrada = scanner.nextLine();
        //System.out.println("El mensaje fue "+ entrada);
        //int entero = scanner.nextInt();
        //System.out.println("El resultado es "+entero);
        /*-----Aquí empieza explicación de condicionales-----
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un animal");
        String animal = scanner.nextLine();
        if (animal.equals("perro")){
            System.out.println("woof");
        }else if(animal.equals("gato")){
            System.out.println("miau");
        }else{
            System.out.println("No reconozco ese animal");
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un animal");
        String animal = scanner.nextLine();
        switch (animal){
            case ("Perro"):
                System.out.println("woof");
                break;
            case ("Gato"):
                System.out.println("miau"); 
            case ("Loro"):
                System.out.println("Quiere cacao?");
                break;
            default:
                System.out.println("No reconozco al animal");
        }
    }
}
