package com.bercut.labs.Task6;

public class T34 implements Tank{

    public T34(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    private int ammo;

    @Override
    public void tankFire() {
        ammo--;
        System.out.println("Огонь! Осталось снарядов: " + ammo);
        if (ammo == 0) {
            System.out.println("Пустой боезапас.");
        }
    }
}
