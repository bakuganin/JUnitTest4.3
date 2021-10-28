/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitjegorbakunin4.pkg3;

import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Jegor Bakunin
 */
public class JUnitJegorBakunin43Test {
    private static JUnitJegorBakunin43 obj; 
    
    @BeforeClass
     public static void RunTest(){
        obj=new JUnitJegorBakunin43();
        }
     
    @Test
        public void test_depositOne(){
            double a = 1000;
            double b = 1100;
            double c =1;
            double[] months = JUnitJegorBakunin43.result(a, b, c);
        }

    
}
