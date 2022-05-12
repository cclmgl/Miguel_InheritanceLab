package com;

public class Wizard extends Character{
    Wizard(String name, int lev, int healthpts, int manapts){
        super(name, lev, healthpts, manapts);
    }

    //first attack to damage the opponent
    public void StrikeofFortune(Character enemyCharacter, Character Character)
    {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " using Strike of Fortune (Damage - 25) (Manapoints-25)");
        int damagePoints = 25;
        int charMana = 25;
        damageTarget(enemyCharacter, damagePoints, Character, charMana);
    }

    //second attack to damage the opponent
    public void FantasticBurst(Character enemyCharacter, Character Character)
    {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " using Fantastic Burst (Damage-35) (Manapoints-20)");
        int damagePoints = 35;
        int charMana = 20;
        damageTarget(enemyCharacter, damagePoints, Character, charMana);
    }

    //spell to heal the character
    public void aWakening(){
        super.healthPoints += 10;
        super.manaPoints += 10;
        System.out.println(super.characterName + " used Awakening-- Gains 10 HP, 10 MP!!");
    }

    //displays after an attack
    public void display(){
        System.out.println("------------------------");
        System.out.println("Wizard: "+super.characterName);
        System.out.println("Health Points: "+super.healthPoints);
        System.out.println("Mana Points: "+super.manaPoints);
        System.out.println("Level: "+super.level);
        System.out.println("------------------------");
    }
}
