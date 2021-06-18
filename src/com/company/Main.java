package com.company;
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//полям). Затем распечатать всю информацию о боссе.
//● Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
//● Создать класс Skeleton (Скелет), унаследовать от Босса.
//● Добавить поле (кол-во стрел) и добавить геттеры.
//● Переопределить родительский метод printInfo в классе Skeleton
//● В Main распечатать информацию о Боссе с помощью метода printInfo, также
//создать 2 экземпляра скелета и заполнить данными) затем распечатать всю
//информацию о скелетах.
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHearth(200);
        boss.setDamage(50);
        boss.setTypeAttack("Магическое");
        boss.setWeapon("Sword");
        System.out.println(boss.getHearth()+ " " +boss.getDamage()+ " " +boss.getTypeAttack()+ " " +boss.getWeapon());
        System.out.println();
        System.out.println(boss.printInfo());
        System.out.println();
        Skeleton skeleton = new Skeleton();
        skeleton.setHearth(150);
        skeleton.setDamage(15);
        skeleton.setTypeAttack("Физический");
        skeleton.setWeapon("Bow");
        System.out.println(skeleton.getHearth()+ " " +skeleton.getDamage()+ " " +skeleton.getWeapon()+ " " +skeleton.getTypeAttack()+ " " +skeleton.getNumberOfArrows()+20);
        System.out.println();
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHearth(200);
        skeleton2.setDamage(20);
        skeleton2.setTypeAttack("Физический");
        skeleton2.setWeapon("Sword");
        System.out.println(skeleton2.getHearth()+ " " +skeleton2.getDamage()+ " " +skeleton2.getWeapon()+ " " +skeleton2.getTypeAttack());
        System.out.println();
        Skeleton skeleton3 = new Skeleton();
        skeleton3.setHearth(150);
        skeleton3.setDamage(25);
        skeleton3.setTypeAttack("магический");
        skeleton3.setWeapon("Staff");
        System.out.println(skeleton3.getHearth()+ " " +skeleton3.getDamage()+ " " +skeleton3.getWeapon()+ " " +skeleton3.getTypeAttack());
    }
}
