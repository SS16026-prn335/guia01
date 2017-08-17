package sv.edu.uessocc.ingenieria.prn_335.guia01;

/**
 *
 * @author Sandoval_Santos
 */
public class Utilities {

    public static void main(String[] args) {
        System.out.println(capitalizar("  y      o p  m"));
    }

    /**
     * getResume es el metodo para limitar el tamaño de la publicacion a 30
     * letras si encuentra un espacio no lo cuenta como letra y se salta a la
     * siguiente letra
     *
     * @param texto - se guardara el post completo con numero indeterminado de caracteres
     * @return - devuelve los primeros 30 caracteres
     */
    public static String getResume(String texto) {
        char letra = ' ';
        String FraseCompleta = "";

        for (int x = 0; x < 30; x++) { //for para limitar el tamaño de la cadena de texto
            letra = texto.charAt(x);//con charAt me voy a la pocision de la cadena
            FraseCompleta = FraseCompleta + letra; //se suma la letra a la frase 
        }
        return FraseCompleta; //devuelve la cadena de texto
    }

    /**
     *capitalizar es el metodo para capitalizar y quitar los espacios dobles 
     * @param texto - es la variable don 
     * @return
     */
    public static String capitalizar(String texto) {

        char[] caracter = texto.toCharArray();//convertimos el texto a array de tipo char
        
        for (int i = 0; i < texto.length(); i++) {// for pasando por todas las letras
            
            caracter[0] = Character.toUpperCase(caracter[0]); //la primera letra es mayuscula
            
            if (caracter[i] == ' ') {// Buscamos un espacio
                caracter[i + 1] = Character.toUpperCase(caracter[i + 1]);//remplazamos el caracter siguiemte del espacio con mayuscula
            }
            
           
 
        }
        texto = String.valueOf(caracter);//convertimos a String
        
        texto = (texto.replace("  ", " "));//replazamos los dobles espacios por uno solo
        return texto;//retorna el texto ya modificafo
    }

    /**
     *
     * @param frase
     * @param texto
     * @return
     */
    public static int contarCoincidencias(String frase, String texto) {

        int contador = 0; // Inicializamos el contador de ocurrencias

        while (frase.indexOf(texto) > -1) {//busca el primer caracter de la cadena de texto
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length());//devuelve una cadena de texto con el caracter indicado
            contador++;//aumentamos el contador cada vez que encuentre la palabra buscada en la frase
        }
        return contador;//regresa el numero de vaces que se repite el texto buscado
    }
}
