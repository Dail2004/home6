package com.company;
//Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//геттеры и сеттеры для этого поля.
public class Boss extends GameEntity {
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return getHearth()+" "+getDamage()+" "+getTypeAttack()+" "+getWeapon();
    }
}