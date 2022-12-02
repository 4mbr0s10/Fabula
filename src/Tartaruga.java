public class Tartaruga extends Thread {
    int posicion;
    public Tartaruga(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public void run(){
        movimiento();
    }
    public synchronized int movimiento(){

        while(posicion<=70) {
            int aleatorio = (int) Math.random() * 10 - 1;
            switch (aleatorio) {
                case 1, 2, 3, 4, 5:
                    System.out.println("Avance rapido.");
                    posicion = posicion + 3;
                    System.out.println(posicion);
                    break;
                case 6,7:
                System.out.println("Escarou.");
                posicion = posicion - 6;
                if (posicion < 0) {
                    posicion = 1;
                }
                System.out.println(posicion);
                break;
                case 8,9,10:
                System.out.println("Avance lento.");
                posicion = posicion + 1;
                System.out.println(posicion);
                break;


            }
        }
        System.out.println("TARTARUGA META");
        return posicion;
    }
}
