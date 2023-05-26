package org.example;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        ganador();


    }
    private static void ganador() {
        Carta carta1 = new Carta();
        Carta carta2 = new Carta();
        carta2.crearCarta();

        Jugador leo = new Jugador();
        leo.setMano(carta1.crearCarta());
        System.out.printf(Arrays.toString(leo.getMano()));

        int num1 =pasarvalores(carta1.getValor());
        int num2 =pasarvalores(carta2.getValor());
        win(num1 , num2);

    }
    private static int pasarvalores(String a){
        int num = 0;
        if(a.equals("Jota") || a.equals("Quina") || a.equals("Kaiser")){
            num = 10;
        }
        else if(a.equals("As") ){
            num = 11 ;
        }else{
            num = Integer.parseInt(a);
        }
        return num;
    }


    private static void win(int a, int b) {
        int suma = a+b;
        if(suma == 21){
            System.out.printf("Ganaste");
        }else{
            System.out.printf("perdiste");
        }
    }

}

