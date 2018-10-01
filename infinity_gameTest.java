/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremias
 */
public class infinity_gameTest {
    
   @Test
   public void test_sumaDeDados(){
        System.out.println("lanzarDados");
        int esperado = Infinity_game.lanzarDados();
        boolean funciona = false;
        if(esperado>=2 && esperado<=12){
            funciona = true;
        }
        assertTrue(funciona);
     }
   
   
   
   
   
   
   }
    

