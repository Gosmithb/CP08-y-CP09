
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class palindromo {
    
    public static BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String palabra;
        
        System.out.println("Ingresa una palabra o frase sin espacios entre palabras");
        palabra = kb.readLine();
        
        if(palindromo( palabra )){
            System.out.println("La palabra " + palabra + " es un palindromo.");
        } else {
            System.out.println(palabra + " no es un palindromo.");
        }
    }

    // Verificar que es un palindromo
    private static boolean palindromo(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

   
}
