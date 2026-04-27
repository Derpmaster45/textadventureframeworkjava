/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silverlessarts.textadventureframework;

/**
 *
 * @author jay
 */
public class Enemy extends Player {
    private String enemyName;
    private float enemyHitPoints;
    private float maxEnemyHitPoints;
    private float enemyDefensePoints;
    private float enemyManaPoints;
    private float maxEnemyManaPoints;

    /**
     * @return the enemyName
     */
    public String getEnemyName() {
        return enemyName;
    }

    /**
     * @param enemyName the enemyName to set
     */
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    /**
     * @return the enemyHitPoints
     */
    public float getEnemyHitPoints() {
        return enemyHitPoints;
    }

    /**
     * @param enemyHitPoints the enemyHitPoints to set
     */
    public void setEnemyHitPoints(float enemyHitPoints) {
        this.enemyHitPoints = enemyHitPoints;
    }

    /**
     * @return the maxEnemyHitPoints
     */
    public float getMaxEnemyHitPoints() {
        return maxEnemyHitPoints;
    }

    /**
     * @param maxEnemyHitPoints the maxEnemyHitPoints to set
     */
    public void setMaxEnemyHitPoints(float maxEnemyHitPoints) {
        this.maxEnemyHitPoints = maxEnemyHitPoints;
    }

    /**
     * @return the enemyDefensePoints
     */
    public float getEnemyDefensePoints() {
        return enemyDefensePoints;
    }

    /**
     * @param enemyDefensePoints the enemyDefensePoints to set
     */
    public void setEnemyDefensePoints(float enemyDefensePoints) {
        this.enemyDefensePoints = enemyDefensePoints;
    }

    /**
     * @return the enemyManaPoints
     */
    public float getEnemyManaPoints() {
        return enemyManaPoints;
    }

    /**
     * @param enemyManaPoints the enemyManaPoints to set
     */
    public void setEnemyManaPoints(float enemyManaPoints) {
        this.enemyManaPoints = enemyManaPoints;
    }

    /**
     * @return the maxEnemyManaPoints
     */
    public float getMaxEnemyManaPoints() {
        return maxEnemyManaPoints;
    }

    /**
     * @param maxEnemyManaPoints the maxEnemyManaPoints to set
     */
    public void setMaxEnemyManaPoints(float maxEnemyManaPoints) {
        this.maxEnemyManaPoints = maxEnemyManaPoints;
    }
    
}
