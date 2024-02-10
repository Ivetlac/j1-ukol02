package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {


        zofka.setPenColor(Color.pink);
        zofka.turnRight(90);
        nakresliRovnostrannyTrojuholnik(50.0);
        posun();
        nakresliCtverec(50.0);
        posun();
        nakresliObdelnik(50.0, 40.0);
        posun();
        nakresliKolecko(5.0);
    }

    private void posun() {
        zofka.penUp();
        zofka.move(90);
        zofka.penDown();
    }

    public void nakresliRovnostrannyTrojuholnik(double velkostStrany) {
        zofka.move(velkostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velkostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velkostStrany);
        zofka.turnLeft(120.0);
    }

    public void nakresliCtverec(double velkostStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velkostStrany);
            zofka.turnLeft(90.0);
        }
    }

    public void nakresliObdelnik(double stranaA, double stranaB) {
        zofka.move(stranaA);
        zofka.turnLeft(90.0);
        zofka.move(stranaB);
        zofka.turnLeft(90.0);
        zofka.move(stranaA);
        zofka.turnLeft(90.0);
        zofka.move(stranaB);
        zofka.turnLeft(90.0);
    }

    public void nakresliKolecko(double polomer) {
        int pocetBodov = 36;
        double uhol = 360.0 / pocetBodov;

        for (int i = 0; i < pocetBodov; i++) {
            zofka.move(polomer);
            zofka.turnLeft(uhol);
        }
    }
}
