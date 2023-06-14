package Java_Basico.ejercicios_varios;

public class practica1_math_bucle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // EJEMPLO DE LOGICA

        var dia = "lunes";		// CAMBIAR VALOR PARA CAMBIAR RESULTADO

        if (dia == "martes") {
            System.out.println("es super martes");
        } else if (dia == "miercoles") {
            System.out.println("es mega miercoles");
        } else if (dia == "viernes") {
            System.out.println("es el mejor dia");
        } else {
            System.out.println("no vale la pena...");
        }

        // MEZCLANDO MATH Y LOGICA 1

        double coche=3;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO
        double bicicleta=2;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO

        double vehiculos=Math.pow(coche, bicicleta);
        System.out.println(vehiculos);

        if (vehiculos < 5) {
            System.out.println("esta bien");

        } else if (vehiculos == 8) {
            System.out.println(" bastantes vehiculos");

        } else if (vehiculos > 8 && vehiculos < 10){
            System.out.println("la cantidad correcta es" + 9);

        } else {
            System.out.println("demasiados vehiculos");
        }


        // MEZCLANDO MATH Y LOGICA 2

        double persona = 8;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO
        double extremidades=persona*4;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO

        double raiz=Math.sqrt(extremidades);

        if (raiz == 2) {
            System.out.println("solo media persona xD");

        } else if (raiz >= 4 && raiz < 10 || raiz == 1) {
            System.out.println("tengo miedo");

        } else {
            System.out.println("mucha gente hay aqui, nada menos que " + raiz + ", vamos a morir");
        }

        // BUCLE WHILE

        int clientes = 1;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO
        while (clientes <= 125) {
            System.out.println(clientes);
            clientes = clientes * 5;
        }

        //BUCLE WHILE CON MATH Y CONCATENACION

        double niños=1.5;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO
        double padres=2.3;		// CAMBIAR VALOR PARA CAMBIAR RESULTADO
        double people=Math.pow(niños, padres);
        System.out.println(people);

        double gente=Math.round(people);
        System.out.println(gente);

        while (gente < 30) {
            System.out.println(gente + " final");
            gente= gente + 1;
        }

    }

}
