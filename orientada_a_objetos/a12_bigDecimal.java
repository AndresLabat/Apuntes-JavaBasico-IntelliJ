package Java_Basico.orientada_a_objetos;

import java.math.BigDecimal;

public class a12_bigDecimal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // PARA TRABAJAR CON NUMEROS GRANDES, NO USAR NI DOUBLE NI FLOAT

        // BIGDECIMAL:

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());

    }

}

