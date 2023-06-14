package Java_Basico.orientada_a_objetos;

public class a03_polimorfismo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // CONTINUA CON EL CODIGO Y LAS CLASES DE A1_CONSTRUCTORES y A2_HERENCIA:

        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        // apunte: ESTO SE PUEDE HACER AUNQUE LA CLASE COCHE SEA ABSTRACTA
        // CREAR UNA CLASE ABSTRACTA AÑADIENDO "ABSTRACT" DESPUES DE ESCRIBIR "CLASS" SOLO SIRVE PARA IMPEDIR QUE SE PUEDAN INSTANCIAR
        // OBJETOS DE ESA CLASE (CREAR OBJETOS DE ESA CLASE)

        // polimorfismo

        Coche coche4 = new CocheElectrico();

        System.out.println(coche4);	//	EL CONSTRUCTOR DE ESTE COCHE SIGUE SIENDO EL DE COCHEELECTRICO

        Coche coche5 = new CocheHibrido();

        System.out.println(coche5);	//	EL CONSTRUCTOR DE ESTE COCHE SIGUE SIENDO EL DE COCHEHIBRIDO, QUE ES EL MISMO QUE EL DE COCHE


        if (coche4 instanceof Coche) {			//	INSTANCE OF ES UNA PALABRA RESERVADA QUE SIRVE PARA COMPROBAR SI EL OBJETO "COCHE4" ES
            //	UNA INSTANCIA DE LA CLASE "COCHE"
            System.out.println("coche");
        }


        if (coche4 instanceof CocheElectrico) {	//	INSTANCE OF ES UNA PALABRA RESERVADA QUE SIRVE PARA COMPROBAR SI EL OBJETO "COCHE4" ES
            //	UNA INSTANCIA DE LA CLASE "COCHE ELECTRICO"
            System.out.println("coche electrico");
        }

        if (coche4 instanceof CocheHibrido) {	//	INSTANCE OF ES UNA PALABRA RESERVADA QUE SIRVE PARA COMPROBAR SI EL OBJETO "COCHE4" ES
            //	UNA INSTANCIA DE LA CLASE "COCHE HIBRIDO"
            System.out.println("coche hibrido");
        }

        // EL POLIMORFISMO AQUI LO HEMOS USADO PARA PODER TRABAJAR A POSTERIORI CON TODOS LOS OBJETOS COMO SI FUERAN DE LA CLASE PADRE
        // YA QUE POR EJEMPLO, LOS ARRAYS, PIDEN QUE TODOS LOS OBJETOS DE SU INTERIOR SEAN DE LA MISMA CLASE, Y TAMBIEN OCURRE LO MISMO
        // EN LOS BUCLES

    }

    @Override
    public String toString() {
        return "a3_polimorfismo [toString()=" + super.toString() + "]";
    }

}
