/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestNumerosPrimos;

import numerosprimos.CribaEratostenes;
import org.junit.Test;

/**
 *
 * @author Juan Manuel Núñez Rodríguez
 */
public class TestGeneraPrimos {

    @Test
    public void TestGeneraPrimos1() {
        int[] arrayCero = CribaEratostenes.generarPrimos(0);
        for (int i = 0; i < arrayCero.length; i++) {
            System.out.println(arrayCero[i]);
        }
    }
    
    @Test
    public void TestGeneraPrimos2() {
        int[] arrayDos = CribaEratostenes.generarPrimos(2);
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println(arrayDos[i]);
        }
    }

    @Test
    public void TestGeneraPrimos3() {
        int[] arrayTres = CribaEratostenes.generarPrimos(3);
        for (int i = 0; i < arrayTres.length; i++) {
            System.out.println(arrayTres[i]);
        }
    }

    @Test
    public void TestGeneraPrimos4() {
        int[] arrayCien = CribaEratostenes.generarPrimos(100);
        for (int i = 0; i < arrayCien.length; i++) {
            System.out.println(arrayCien[i]);
        }
    }
}
