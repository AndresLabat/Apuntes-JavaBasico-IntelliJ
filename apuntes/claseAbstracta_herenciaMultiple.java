package Java_Basico.apuntes;

public class claseAbstracta_herenciaMultiple {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    // UNA CLASE ABSTRACTA ES AQUELLA QUE TIENE ALGUNOS METODOS YA REALIZADOS, Y OTROS HAY QUE CREARLOS O HEREDARLOS DE OTRA.

		/* EJEMPLO DE HERENCIA SIMPLE:

		- CLASE ABSTRACTA VEHICULO             (CLASE HIJA, PORQUE HEREDA METODOS O VARIABLES DE LA PRINCIPAL)
		 	PRIVADA TIPO;
		 	PRIVADA SONIDO;

		 FUNCION SETTERTIPO (TEXTO valor)
		 	ESTA_CLASE.TIPO=valor;

		 FUNCION GETTERTIPO()
		 	DEVUELVE ESTA_CLASE.TIPO;

		 FUNCION ABSTRACTA SETTERSONIDO(TEXTO sonido)
		 FUNCION ABSTRACTA GETTERSONIDO() TEXTO

		- CLASE COCHE						(CLASE PRINCIPAL)
		 	FUNCION SETTERSONIDO (TEXTO sonido)
		 	FUNCION GETTERSONIDO() TEXTO
		 */

    //----------------------------------------------------------------------------------

		/* EJEMPLO DE HERENCIA MULTINIVEL:

		- CLASE VEHICULO         (CLASE PADRE)
		 	PRIVADA VELOCIDAD MAXIMA;
		 	PRIVADA TIPOGASOLINA;

		 	FUNCION diHola()
		 		IMPRIME "hola"

		- CLASE COCHE HEREDA DE VEHICULO		(CLASE HIJA)
		 	(heredada) VELOCIDAD MAXIMA
		 	(heredada) TIPO GASOLINA
		 	NUMERO_DE_PUERTAS;

		 	(heredada) FUNCION diHola()
		 		IMPRIME "hola"

		 	FUNCION SETTERNUMERODEPUERTAS(INT puertas)
		 		ESTA_CLASE.NUMERO_DE_PUERTAS = puertas
		 	FUNCION GETTERNUMERODEPUERTAS() INTEGER
		 		DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS

		 - CLASE COUPE HEREDA DE COCHE Y NO QUIERO QUE PUEDAN HEREDAR DE MI		(CLASE HIJA)
		 	(heredada) VELOCIDAD MAXIMA
		 	(heredada) TIPO GASOLINA
		 	(heredada) NUMERO_DE_PUERTAS;

		 	(heredada) FUNCION diHola()
		 		IMPRIME "hola"

		 	(heredada) FUNCION SETTERNUMERODEPUERTAS(INT puertas)
		 		ESTA_CLASE.NUMERO_DE_PUERTAS = puertas
		 	(heredada) FUNCION GETTERNUMERODEPUERTAS() INTEGER
		 		DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS
		 */


    Mujer mujer = new Mujer();

		mujer.estableceEdad(20);	//	ESTE METODO ES PROPIO DE LA CLASE PERSONA, LO HA HEREDADO LA CLASE MUJER
		System.out.println(mujer.dimeEdad());

		mujer.estableceSexo("mujer");	//	ESTE METODO ES PROPIO DE LA CLASE MUJER
		System.out.println(mujer.dimeSexo());

    Hombre hombre = new Hombre();

		hombre.estableceEdad(25);
		System.out.println(hombre.dimeEdad());
		System.out.println(hombre.dimeNombre());
		hombre.estableceSexo("varon");
		System.out.println(hombre.dimeSexo());

    Licenciado licenciado = new Licenciado();

		licenciado.estableceTitulo("ingeniero");
		System.out.println(licenciado.dimeTitulo());

		licenciado.estableceEdad(30);
		System.out.println(licenciado.dimeEdad());

		licenciado.estableceNombre("Roberto");
		System.out.println(licenciado.dimeNombre());

		licenciado.estableceSexo("varon");
		System.out.println(licenciado.dimeSexo());

}

}

// LA CLASE ABSTRACTA SE CREA PARA DERIVAR SUS ATRIBUTOS Y FUNCIONES, PERO NO SE CREAN OBJETOS DE ESA CLASE:

abstract class Persona{

    private int edad;	//	ESTE ATRIBUTO ES PRIVADO, TIENE SUS PROPIOS METODOS Y ESTOS TIENEN UNA FUNCION CONCRETA Y DEFINIDA
    String nombre;	//	ESTE ATRIBUTO NO ES PRIVADO PORQUE LO QUE HAGAN SUS METODOS SE DEFINIRA EN LAS CLASES DERIVADAS

    public Persona() {		//		CONSTRUCTOR

        nombre = "desconocido";
        edad = 18;

        System.out.println("Esta persona tiene las siguientes caracteristicas:");
    }

    public void estableceEdad(int edad) {		//		SETTER
        this.edad = edad;
    }

    public String dimeEdad() {		//		GETTER
        return "es mayor de edad, tiene " + edad + " años";
    }

    abstract void estableceNombre(String nombre);
    abstract String dimeNombre();

}

class Mujer extends Persona{	//	EXTENDS INDICA QUE ES DERIVADA DE...

    private String sexo;	//	EN ESTA CLASE DERIVADA PUEDO AÑADIR NUEVOS ATRIBUTOS

    public void estableceNombre(String nombre) {
        this.nombre = nombre;
    }
    public String dimeNombre() {
        return "se llama " + nombre;
    }

    public void estableceSexo(String sexo) {
        this.sexo = sexo;
    }
    public String dimeSexo() {
        return "es un/una " + sexo;
    }

}

final class Hombre extends Mujer{}	//	EXTENDS INDICA QUE ES DERIVADA DE...
//	FINAL INDICA QUE NO PUEDE DERIVARSE EN OTRA CLASE

class Licenciado extends Mujer{		//	ESTA CLASE HEREDA DE MUJER, QUE A SU VEZ HEREDA DE PERSONA TODOS LOS ATRIBUTOS Y METODOS
    //	ES UN CLARO EJEMPLO DE HERENCIA MULTINIVEL

    private String titulo;

    public Licenciado() {
        System.out.println("Es un persona cualificada");	//	AL PONER OTRO CONSTRUCTOR, SE IMPRIMIRA EL SYSTEM.OUT.PRINTLN DE
    }													//	AMBOS SI CREO UN OBJETO DE TIPO LICENCIADO

    public void estableceTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String dimeTitulo() {
        return "el titulo que tiene esta persona es " + titulo;
    }

}
