import java.util.Scanner;

/**
 * Created by giron on 4/24/2024.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        //
        char[]letrasAdivinadas = new char[palabraSecreta.length()];
        //
        for(int i=0; i<letrasAdivinadas.length; i++){
            letrasAdivinadas[i]= '_';
            //System.out.print(letrasAdivinadas[i]+" ");
        }//
        //
        while(!palabraAdivinada && intentos<intentosMaximos){
            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for(int i=0; i<palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta = true;
                }//
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto!!, te quedan: "+(intentosMaximos-intentos)+" intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta!!: "+palabraSecreta.toUpperCase());
            }//
        }//
        if(!palabraAdivinada){
            System.out.println("Que pena, te has quedado sin intentos...:(");
        }//
        scanner.close();
    }
}
