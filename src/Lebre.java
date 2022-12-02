public class Lebre extends Thread{
    int posicion;
    boolean dorme=false;
    public Lebre(int posicion,boolean dorme) {
        this.posicion = posicion;
        this.dorme = dorme;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isDorme() {
        return dorme;
    }

    public void setDorme(boolean dorme) {
        this.dorme = dorme;
    }
    public void run(){
        movimiento();
    }

    public synchronized int movimiento(){

       while(posicion<=70) {
           int aleatorio=(int) Math.random()*10-1;

           switch (aleatorio) {
               case 1,2:

                   System.out.println("Dorme.");
                   dorme = true;
                   try {
                       sleep(5000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }

                   break;
               case 3,4:
                   dorme = false;
                   System.out.println("Gran salto.");
                   posicion = posicion + 9;
                   System.out.println(posicion);
                   break;
               case 5:
                   dorme = false;
                   System.out.println("Esvarón grande.");
                   posicion = posicion - 12;
                   if (posicion < 0) {
                       posicion = 1;
                   }
                   System.out.println(posicion);
               case 6,7,8:
                   dorme = false;
                   System.out.println("Pequeno salto.");
                   posicion = posicion + 1;
                   System.out.println(posicion);
                   break;
               case 9,10:
                   dorme = false;
                   System.out.println("Esvarón pequeno.");
                   posicion = posicion - 2;
                   if (posicion < 0) {
                       posicion = 1;
                   }
                   System.out.println(posicion);
                   break;

           }

       }
        System.out.println("LEBRE META"+posicion);
        return posicion;
    }
}
