package org.example;

public class Carta {

    private String valor;
    private String pinta;

    public Carta() {
        this.pinta = pinta;
        this.valor = valor;
    }
    public String[] crearCarta() {
        asignarPinta();
        asignarValor();
        String[] list = new String[2];
        list[0]= pinta;
        list[1]= valor;
        return list;
    }

    private String asignarPinta() {
        String[] pintas = new String[4];
        pintas[0] = "Corazón";
        pintas[1] = "Treból";
        pintas[2] = "Diamante";
        pintas[3] = "Pica";
        int a = (int) (Math.random() *4+1);
        pinta = pintas[a];

        return pinta;

    }
    private String asignarValor(){
        int aleatorio = (int)(Math.random()* 13+1);
        String num = String.valueOf(aleatorio);
        if(num.equals("11")){ num = "Jota";
            valor = num;
        }
        if(num.equals("12")){ num= "Quina";
            valor = num;
        }
        if(num.equals("13")){
            num= "Kaiser";
            valor = num;
        }
        if(num.equals("1")){num ="As";
            valor = num;}

        valor = num;
        return valor;
    }


    public String getPinta() {
        return this.pinta;
    }

    public String  getValor() {
        return this.valor;
    }

}
