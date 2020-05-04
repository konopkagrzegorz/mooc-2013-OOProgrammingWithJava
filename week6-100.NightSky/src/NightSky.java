
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        for (int i = 0; i < this.width; i++) {
            Random random = new Random();
            double randNum = random.nextDouble();
            if (randNum <= this.density) {          // if random is at or below this.skyDensity, print a star

                System.out.print("*");
                this.starsInLastPrint++;            // 100.3: count a star when you print a star on this.starsInLastPrint
            } else {
                System.out.print(" ");              // white space
            }
        }
    }
    
    public void print() {                           // 100.2
        this.starsInLastPrint = 0;

        for (int i = 0; i < this.height; i++) {
            this.printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {                 // 100.3
        return this.starsInLastPrint;
    }
      
}
