package Java_Basico.practica_orientada_objetos7_completa;

public class CocheUtilitario extends Coche implements InterfazCoches {

        private int puertas;

        public CocheUtilitario() {
            super();
        }

        public CocheUtilitario(String color, int velocidad, String modelo, int puertas) {
            this.color = color;
            this.velocidad = velocidad;
            this.modelo = modelo;
            this.puertas = puertas;
        }

        @Override
        public void estableceColor(String color) {
            // TODO Auto-generated method stub
            this.color = "su nuevo color es " + color;
        }

        @Override
        public void estableceVelocidad(int velocidad) {
            // TODO Auto-generated method stub
            this.velocidad = velocidad;
        }

        @Override
        public void estableceModelo(String modelo) {
            // TODO Auto-generated method stub
            this.modelo = "su nuevo modelo es " + modelo;
        }

        public void establecePuertas(int puertas) {		//		SETTER
            this.puertas = puertas;
        }

        public String dimePuertas() {		//		GETTER
            return "su cantidad de puertas es " + puertas;
        }

        @Override
        public String toString() {
            return "CocheUtilitario [puertas=" + puertas + ", color=" + color + ", velocidad=" + velocidad + ", modelo="
                    + modelo + "]";
        }

    }
