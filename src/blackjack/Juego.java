
package blackjack;

public class Juego { //Clase que contiene solo mensajes de texto
        
    public void saludo(){
        System.out.println("Bienvenido a 21BlackJack");
        System.out.println();
        System.out.println("Creado por Pedro Argibay \n"
                + " Miguel Sáchez \n"
                + " Sergio Lago \n"
                + "");
    }    
    public void instrucciones(){    
        System.out.println("Leer atentamente");
        System.out.println();
        System.out.println("Este juego consiste en mediante las cartas que te damos tienes que sumar 21 en total, \n"
                + "claramente no en la primera mano tendrás 21 (puede ser posible, eso es tener suerte). \n"
                + "Una vez que te demos las 2 primeras cartas verás el resultado reflejado en la consola \n"
                + "podrás cojer carta para seguir sumando y obtener 21 o si ves que tienes buena mano plantarte \n"
                + "y ver si tu oponente se planta o se rinde. \n"
                + "Recuerda no puedes pasarte de 21 si no pierdes la partida ni tampoco quedar por debajo de tu oponente \n"
                + "intenta siempre llegar a 21 o lo más aproximado que puedas. Sé más listo que tu oponente.");
        System.out.println("");
        System.out.println("Estás preparad@?");
        System.out.println("");
        System.out.println("");
    }
}
