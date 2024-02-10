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
        zofka.turnLeft(90);
       nakresliZmrzlinu(82.0, 14.0);
        posun();
        nakresliSnehuliaka(30.0, 20.0, 15.0,5.0);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliMasinku(10.0,17.5,400.0,200.0);
    }

    private void posun() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
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

    public void nakresliStvorec(double velkostStrany) {
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

    public void nakresliZmrzlinu(double vyskaKornutku, double velikostGule) {

        nakresliRovnostrannyTrojuholnik(vyskaKornutku);
        zofka.turnRight(90);
        nakresliKolecko(velikostGule / 2);
    }

    public void nakresliSnehuliaka(double spodneTelo, double stredneTelo, double hlava, double ruky) {

        nakresliKolecko(spodneTelo / 2);


        zofka.turnRight(180);
        nakresliKolecko(stredneTelo / 2);

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(stredneTelo * 6);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliKolecko(hlava / 2);

        zofka.penUp();
        zofka.move(stredneTelo * 3);
        zofka.turnRight(90);
        zofka.move(stredneTelo * 3);
        zofka.penDown();
        nakresliKolecko(ruky / 2);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(stredneTelo * 6);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKolecko(ruky / 2);

    }
    public void nakresliMasinku(double koleso,double velkeKoleso, double velkostObdlznikaA, double velkostObdlznikaB) {
    zofka.turnLeft(90);
     nakresliKolecko(koleso);
        zofka.penUp();
        zofka.move(140);
        zofka.penDown();
        nakresliKolecko(koleso);
        zofka.penUp();
        zofka.move(90);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliObdelnik(velkostObdlznikaA,velkostObdlznikaB);
       zofka.turnLeft(90);
      nakresliRovnostrannyTrojuholnik(velkostObdlznikaA/3);
      zofka.turnRight(90);
      zofka.move(velkostObdlznikaA);
      //zofka.turnLeft(90);
        nakresliObdelnik(velkostObdlznikaB,velkostObdlznikaA);
        zofka.turnRight(90);
        nakresliKolecko(velkeKoleso);
    }

}
