import java.util.ArrayDeque;

public class Ejercicio1 {

    /*
     * Método que devuelve una cadena de texto invertida.
     * texto -> COMPUTACION
     * return -> NOICATUPMOC
     * USANDO SOLO PILAS
     */
    public String invertString(String texto) {

        ArrayDeque<Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";

        while (!pila.isEmpty()) {
            char letra = pila.pop();
            invertido += letra;
        }

        return invertido;
    }
}