public class practica {
    public static void main(String[] args) {
        int[] notas = {14, 18, 11, 20, 8, 16};
        
        int max = notas[0], min = notas[0];
        int posMax = 0, posMin = 0;
        int suma = notas[0];
        
        for (int i = 1; i < notas.length; i++) {
            suma += notas[i]; // Acumulamos para el promedio
            
            if (notas[i] > max) {
                max = notas[i];
                posMax = i;
            }
            if (notas[i] < min) {
                min = notas[i];
                posMin = i;
            }
        }
        
        double promedio = (double) suma / notas.length;
        
        System.out.println("Nota Máxima: " + max + " (Índice " + posMax + ")");
        System.out.println("Nota Mínima: " + min + " (Índice " + posMin + ")");
        System.out.println("Promedio General: " + promedio);
    }
}