package com;

public class App {
    public static void main(String[] args){
        System.out.println("Wizards and Warlocks!!");

      //method to display details for better readability
        Warlock Ero = new Warlock("Ero",1, 100, 200);
        Wizard Zeon = new Wizard("Zeon", 1, 100, 200);
        Character c = new Character();

        Ero.displayname(Ero);
        Zeon.displayname(Zeon);
        Ero.SmashHit(Zeon, Ero);
        Ero.display();
        Zeon.StrikeofFortune(Ero, Zeon);
        Zeon.display();
        Ero.powerAttack(Zeon,Ero);
        Ero.display();
        Zeon.FantasticBurst(Ero,Zeon);
        Zeon.display();
        Zeon.aWakening();
        Zeon.display();
        Ero.shiningMiracle();
        Ero.display();
        Ero.powerAttack(Zeon, Ero);
        Ero.LevelRise(Ero);
        Ero.display();
    }
}
