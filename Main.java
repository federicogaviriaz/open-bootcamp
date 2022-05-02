public class Main {

    public static void main(String[] args) {

        suma(9, 3, 2);

        Coche miCoche = new Coche();
        miCoche.incPuertas();
        miCoche.incPuertas();
        miCoche.incPuertas();
        System.out.println(miCoche.nPuertas);

    }

    public static void suma(int a, int b, int c) {
        int sumado = a + b + c;
        System.out.println(sumado);
    }

    static class Coche {
        public int nPuertas = 2;

        public void incPuertas() {
            this.nPuertas++;
        }
    }
}
