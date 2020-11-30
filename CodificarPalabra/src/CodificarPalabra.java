
public class CodificarPalabra {
    
    public static void main(String[] args) {
        String Msj_Inv;
        String msj = "S.ALLETOS BES TRATROR AMPRO CEUGINSO CI SAE. VENTERGU";
        
        Msj_Inv = Codificar_Mensaje( msj );
        
        System.out.println("Mensaje Codificado: " + msj);
        System.out.println("Mensaje Decodificado: " + Msj_Inv);
        
    }

    private static String Codificar_Mensaje(String msj) {
        int pos = 0;
        String nuevoMensaje = "", codificado;
        for (int i = 0; i < msj.length(); i++) {
            //Si tiene vocales corta en esa parte del string
            if ((msj.charAt(i) == 'A') || (msj.charAt(i) == 'E') || (msj.charAt(i) == 'I')|| (msj.charAt(i) == 'O')|| (msj.charAt(i) == 'U')) {
                nuevoMensaje = nuevoMensaje + Invertir_Mensaje(msj.substring(pos, i)) + msj.charAt(i);
                pos = i + 1;
            }
        }
        
        nuevoMensaje = nuevoMensaje + Invertir_Mensaje(msj.substring(pos, msj.length()));
        
        codificado = Invertir_Mensaje(nuevoMensaje);
        
        return codificado;
        
    }

    private static String Invertir_Mensaje(String msj) {
        String msj_nuevo = "";
        for (int i = 0; i < msj.length(); i++) {
            msj_nuevo = msj.charAt(i) + msj_nuevo;
        }
        return msj_nuevo;
    }
}
