public class actividad2 {
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.MasPuertas();
            System.out.println(miCoche.puertas);

        }

    }


    class Coche {
        public int puertas = 5;

        public void MasPuertas(){
            this.puertas++;
        }
    }

