package semana9;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        String tienda = "TIENDA ABC";
        String ruc = "14123457892";
        String ubicacion = "Chiclayo-Peru";
        String cajero = "ROSA";
        String cliente = "CARLOS";

        String[] codigos = {"77541258564", "775154994949", "262994313"};
        String[] descripciones = {"DETERGENTE ULTRA", "JAM PIZZA", "LECHE EN CAJA"};
        int[] cantidades = {6, 2, 12};
        double[] preciosUnitarios = {3.25, 12.90, 30.50};

        double totalGravado = 0;
        StringBuilder reporte = new StringBuilder();
        reporte.append(tienda).append("\n");
        reporte.append("RUC ").append(ruc).append("\n");
        reporte.append(ubicacion).append("\n\n");
        reporte.append("CAJERO: ").append(cajero).append("\n");

        for (int i = 0; i < codigos.length; i++) {
            double montoProducto = cantidades[i] * preciosUnitarios[i];
            totalGravado += montoProducto;
            reporte.append(codigos[i]).append(" ").append(descripciones[i]).append("\n");
            reporte.append(cantidades[i]).append(" x ").append(preciosUnitarios[i]).append("     ").append(montoProducto).append("\n");
        }

        double igv = totalGravado * 0.18;
        double importeTotal = totalGravado + igv;

        reporte.append("\nOP. GRAVADA: ").append(totalGravado).append("\n");
        reporte.append("I.G.V: ").append(igv).append("\n");
        reporte.append("IMPORTE TOTAL: ").append(importeTotal).append("\n");
        reporte.append("--------------------------------------------\n");
        reporte.append("CLIENTE ").append(cliente).append("\n");
        reporte.append("--------------------------------------------\n");

        System.out.println(reporte);
    }
}
