package com.company;
// Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
//присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
public class GameEntity {
    private int hearth;
    private int damage;
    private String typeAttack;

    public int getHearth() {
        return hearth;
    }

    public void setHearth(int hearth) {
        this.hearth = hearth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(String typeAttack) {
        this.typeAttack = typeAttack;
    }
}
