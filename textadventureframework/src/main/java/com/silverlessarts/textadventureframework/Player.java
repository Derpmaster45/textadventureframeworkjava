/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silverlessarts.textadventureframework;
import java.util.Scanner;
/*
imports needed for this class java.util.scanner
*/
/**
 *
 * @author jay
 */
public class Player {
    private String playerName;
    private int playerLevel=1;
    private String playerClass;
    private float playerEXP;
    private float expToNextLevel;
    private Boolean bIsLevelUp;
    private float playerHitPoints;
    private float playerDefensePoints;
    private float playerManaPoints;
    private float maxPlayerManaPoints;
    private float maxPlayerDefensePoints;
    private float maxPlayerHitPoints;

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        while(playerName=="")
        {
            System.out.println("Enter a name for your character:\n");
            Scanner nameScan=new Scanner(System.in);
            playerName=nameScan.nextLine();
            nameScan.close();
        }
        this.playerName = playerName;
    }

    /**
     * @return the playerLevel
     */
    public int getPlayerLevel() {
        return playerLevel;
    }

    /**
     * @param playerLevel the playerLevel to set
     */
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    /**
     * @return the playerClass
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     * @param playerClass the playerClass to set
     */
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    /**
     * @return the playerEXP
     */
    public float getPlayerEXP() {
        return playerEXP;
    }

    /**
     * @param playerEXP the playerEXP to set
     */
    public void setPlayerEXP(float playerEXP) {
        this.playerEXP = playerEXP;
    }

    /**
     * @return the expToNextLevel
     */
    public float getExpToNextLevel() {
        return expToNextLevel;
    }

    /**
     * @param expToNextLevel the expToNextLevel to set
     */
    public void setExpToNextLevel(float expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }

    /**
     * @return the bIsLevelUp
     */
    public Boolean getbIsLevelUp() {
        return bIsLevelUp;
    }

    /**
     * @param bIsLevelUp the bIsLevelUp to set
     */
    public void setbIsLevelUp(Boolean bIsLevelUp) {
        this.bIsLevelUp = bIsLevelUp;
    }

    /**
     * @return the playerHitPoints
     */
    public float getPlayerHitPoints() {
        return playerHitPoints;
    }

    /**
     * @return the playerDefensePoints
     */
    public float getPlayerDefensePoints() {
        return playerDefensePoints;
    }

    /**
     * @return the playerManaPoints
     */
    public float getPlayerManaPoints() {
        return playerManaPoints;
    }

    /**
     * @return the maxPlayerManaPoints
     */
    public float getMaxPlayerManaPoints() {
        return maxPlayerManaPoints;
    }

    /**
     * @return the maxPlayerDefensePoints
     */
    public float getMaxPlayerDefensePoints() {
        return maxPlayerDefensePoints;
    }

    /**
     * @return the maxPlayerHitPoints
     */
    public float getMaxPlayerHitPoints() {
        return maxPlayerHitPoints;
    }
}
