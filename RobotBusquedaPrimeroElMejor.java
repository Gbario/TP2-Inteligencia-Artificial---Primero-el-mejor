public class RobotBusquedaPrimeroElMejor {
   

    public static void main(String[] args) {
    	int posicionObjetivo = 8;
        int posicionActual = 0; // Posición inicial
        int totalMovimientos = 0; // Número de movimientos
        int distanciaTotal = 0;

        while (posicionActual != posicionObjetivo) { 
            // Calcular la distancia hasta el objetivo desde ambos lados de la posición inicial
            int izquierda = posicionActual - 1;
            int derecha = posicionActual + 1;

            int heuristicaIzquierda = heuristica(izquierda, posicionObjetivo);
            int heuristicaDerecha = heuristica(derecha, posicionObjetivo);

            // Evaluar cuál movimiento es mejor
            if (heuristicaIzquierda < heuristicaDerecha) {
                posicionActual = izquierda; // Mover a la izquierda
                System.out.println("Se mueve a la izquierda: " + izquierda + " cm");
            } else {
                posicionActual = derecha; // Mover a la derecha
                System.out.println("Se mueve a la derecha: " + derecha + " cm");
            }

            totalMovimientos++; // Incrementar contador de movimientos
            distanciaTotal ++; // Incrementar distancia total recorrida
        }

        System.out.println("Objetivo alcanzado en " + totalMovimientos + " movimientos.");
    }

    // Función heurística que calcula la distancia al objetivo
    static int heuristica(int posicion, int objetivo) {
        return Math.abs(posicion - objetivo);
    }
}