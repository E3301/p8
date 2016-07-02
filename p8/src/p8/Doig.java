/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 *
 * @author NEVERMIND
 */
public class Doig {
    
    public void One() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\NEVERMIND\\Documents\\ciao1.txt")),Charset.forName("UTF-8")));
        int c, n=0;
        char character = 'd';
        int x[] = new int[1002];
        
        for(int i : x){
            i = 0;
        }
        
        while((c = reader.read()) != -1) {
            character = (char) c;
            x[n] = Character.getNumericValue(character);
            n++;
        }
        
        for(int i : x){
            System.out.print(i + ", ");
        }
        Two(x);
    }
    
    private void Two (int[] x){
        
    }
}
