package com;

public class Warlock extends Character{
    Warlock(String name, int lev, int healthpts, int manapts){
        super(name, lev, healthpts, manapts);
    }

    //this will be the first attack
    public void SmashHit(Character enemyCharacter, Character Character)
    {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " using Smash Hit (Damage -30) (Manapoints-15)");
        int damagePoints = 30;
        int charMana = 15;
        damageTarget(enemyCharacter,damagePoints, Character, charMana);
    }

    //second attack
    public void powerAttack(Character enemyCharacter, Character Character)
    {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " using Power Attack (Damage-40)(Manapoints-40)");
        int damagePoints = 40;
        int charMana = 40;
        damageTarget(enemyCharacter, damagePoints, Character, charMana);
    }

    //recover spell
    public void shiningMiracle(){
        super.healthPoints += 50;
        super.manaPoints +=35;
        System.out.println(super.characterName + " used Shining Miracle-- Gains 50 HP, 35 MP!!");
    }

    //display after the attack
    public void display(){
        System.out.println("------------------------");
        System.out.println("Warlock: "+super.characterName);
        System.out.println("Health Points: "+super.healthPoints);
        System.out.println("Mana Points: "+super.manaPoints);
        System.out.println("Level: "+super.level);
        System.out.println("------------------------");
    }
}
