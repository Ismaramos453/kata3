/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3_ismael;

/**
 *
 * @author ismar
 */
public class Kata3_Ismael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MODEL
        Histogram<String>histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("ull.es");
        
        //VIEW
        HistogramDisplay histogramdisplay = new HistogramDisplay("HISTOGRAMA",histogram);
        histogramdisplay.execute();
    }
    
}
