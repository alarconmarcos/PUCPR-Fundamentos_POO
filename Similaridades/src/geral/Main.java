package geral;
import java.util.*;

import motos.Moto;

public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();
        var Onibuses = new ArrayList<Onibus>();

        carros.add(new Carro("Ford Ka", "Firefly 1.0", 257));
        carros.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

        Onibuses.add(new Onibus("Mercedes Benz", "V8", 50, true));
        Onibuses.add(new Onibus("Scania Escolar", "V8", 15, false));

        for (var carro : carros) {
             System.out.println(carro.imprimir());
        }

        for (var moto : motos) {
             System.out.println(moto.imprimir());
        }

        for (var onibus : Onibuses) {
            System.out.println(onibus.imprimir());
       }
    
    }
}