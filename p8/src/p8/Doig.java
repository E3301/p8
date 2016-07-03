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
        long y[] = new long[1002];
        long giallo[] = new long[1002];
        for(long g : y){
            g = 0;
        }
        for(int i=0; i<x.length-12; i++){
           giallo[i] = x[i]*x[i+1]*x[i+2]*x[i+3]*x[i+4]*x[i+5]*x[i+6]*x[i+7]*x[i+8]*x[i+9]*x[i+10]*x[i+11]*x[i+12];
            y[i] = x[i]+x[i+1]+x[i+2]+x[i+3]+x[i+4]+x[i+5]+x[i+6]+x[i+7]+x[i+8]+x[i+9]+x[i+10]+x[i+11]+x[i+12];
            if( y[i]==84 && giallo[i]!=0 ){
                System.out.println(" \n i===============" + i);
                System.out.println("" + x[i] + "" + x[i+1] + "" +x[i+2]+ "" + x[i+3]+ ""+x[i+4]+""+x[i+5]+""+x[i+6]+""+x[i+7]+""+x[i+8]+""+x[i+9]+""+x[i+10]+""+x[i+11]+""+x[i+12]);
                System.out.println(giallo[i] + " and:" + y[i]);
            }
        
        }
        for(long a : y){
            System.out.println("[ " + a + " ], ");
        }
        
        long j = 3*6*9*7*8*1*7*9*7*7*8*4*6*9*0;
        System.out.print("\n \n" + j);
        
        long bigger = 0;
        for(int b52=0; b52<y.length; b52++){
            if(y[b52]>bigger && giallo[b52]!=0){
                bigger = y[b52];
            }
        }
        System.out.print("\n \n bigger: " + bigger);
    }
}
