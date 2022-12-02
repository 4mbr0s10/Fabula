public class Fio extends Thread {
    static int contador;
//    Tartaruga t;
//    Lebre l;
    @Override
    public void run(){
        Tartaruga t = new Tartaruga(1);
        Lebre l = new Lebre(1, false);
        while(t.getPosicion()!=70 || l.getPosicion()!=70){
            t.start();
            l.start();

        }
    }
}
