package com;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */

    Character(){
        System.out.println("The game will start in a few seconds");
        System.out.println("--------------------");
    }

    Character(String name, int lev, int healthpts, int manapts){
        characterName = name;
        level = lev;
        healthPoints = healthpts;
        manaPoints = manapts;
    }

    // displays the Name of the Character
    public void displayname(Character Character){
        System.out.println("Character Initialized: " +Character.characterName);
        System.out.println("--------------------");
    }

    //method to Damage Target Character
    public void damageTarget(Character enemyCharacter,int damagePoints, Character Character , int charMana){

        // Deduct health points from enemy character
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);

        //Deduct the Mana Points from the character

        Character.manaPoints -= charMana;

        //Prompt Character is defeated if HP falls below 0
         if(enemyCharacter.healthPoints == 0){
             System.out.println("--------------------");
             System.out.println("Character " +enemyCharacter.characterName+ " is defeated");
         }
    }

    //method to level up the winner
    public void LevelRise(Character Character){
        System.out.println("--------------------");
        System.out.println("Good Game " +Character.characterName+ "! Your level increased by 10");
        Character.level +=10;
    }


}
