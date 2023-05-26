# BlackJack
Benjamin Silva

#Analisis del problema
Logre identificar 3 clases fundamentales, siendo la Clase Carta, Jugador y Juego, se relacionan de la siguiente manera la clase juego depende de la clase Carta y clase Jugador.

#Analisis del diagrama
La clase Carta tiene 2 atributos privados llamados valoy y pinta ambos de tipo String, tiene un contructor Carta() y los atributos solo tienen el método get, también tiene 2 métodos privados que sirven asignar valores y pintas a las cartas y por último un método público de tipo String[] llamado CarCarta.

La clase Jugador tiene un solo atributo privado de tipo String[] ,tiene un contructor generico y el atributo tiene sus setter y getter.

La clase Gmae tiene 4 métodos de los cuales 3 son privados siendo ganador y win de tipo void y pasarvalores de tipo entero, mientras que run() es publico. además game depende de las otras 2 clases antes mencionadas.

He llegado a este diagrama debido a que opte usar metodos de otras clases en una, pensando que seria mucho mas simple y no requeriria una relación más fuerte. para efectos placticos funciona aunque con un poco de problemas.
