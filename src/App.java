import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) throws Exception {
        //runLinkList();
        //runQueue();
        runStack();
    }

    private static void runStack() {
       Stack<String> pila = new Stack<>();
       //ArrayDeque<String> pila = new ArrayDeque<>();

       pila.push("José");
       pila.push("Andrés");
       pila.push("Ana");
       pila.push("María");
       pila.push("José2");

       System.out.println(pila.isEmpty());
       System.out.println(pila.size());

       System.out.println(pila.peek());
       System.out.println(pila.size());

       System.out.println(pila.pop());
       System.out.println(pila.size());

       while (!pila.isEmpty()) {
        String cliente = pila.pop();
        System.out.println("Sale -> " + cliente);
       }
       System.out.println(pila.size());

       // Ejercicio 2
       System.out.println(esPalindromo("radar"));
       System.out.println(esPalindromo("computacion"));
    }

    public static boolean esPalindromo(String texto) {

        ArrayDeque<Character> pila = new ArrayDeque<>();

        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        String invertido = "";

        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return texto.equals(invertido);
    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek());
        System.out.println(cola.size());
        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendí a: " + cliente);
        }
        System.out.println("No hay más clientes. ");
    }

    private static void runLinkList() {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        String primero = nombres.getFirst();
        System.out.println(primero);
        System.out.println(nombres.getFirst());

        System.out.println(nombres.get(4));
        System.out.println(nombres.getLast());
        System.out.println(nombres.get(nombres.size() - 1));
        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
}