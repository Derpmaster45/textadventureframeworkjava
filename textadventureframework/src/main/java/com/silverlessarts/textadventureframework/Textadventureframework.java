
package com.silverlessarts.textadventureframework;

/**
 *
 * @author jay
 * 
 */
import java.util.Scanner;

public class Textadventureframework {
    // single player creation
    public static Player CreatePlayer()
    {
       Player playerCharacter=new Player();
       Scanner playernameScan=new Scanner(System.in);
       String playerName="";
       playerCharacter.setPlayerName(playerName);
       String playerClass="";
       
       return playerCharacter;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CreatePlayer();
    }
}
