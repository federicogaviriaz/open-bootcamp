public class SegundoEjercicio {
    public static void main(String[] args) {
        int numeroEquis = -3;
        if (numeroEquis > 0)
            System.out.println("Número positivo");
        else if (numeroEquis < 0)
            System.out.println("Número Negativo");
        else
            System.out.println("El número es Cero");
        System.out.println("___________");
        int numeroWhile = -2;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("___________");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        System.out.println("___________");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor");
        }
        System.out.println("___________");
        String estacion = "Invierno";
        switch (estacion) {
            case "Verano":
                System.out.println("Hace Calor");
                break;
            case "Otoño":
                System.out.println("Mucho Naranja");
                break;
            case "Invierno":
                System.out.println("Uy Qué frío!");
                break;
            case "Primavera":
                System.out.println("Ay pero qué bonito!");
                break;
            default:
                System.out.println("Eso no es una estación");
        }
    }

}
