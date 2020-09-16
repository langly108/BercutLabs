package com.bercut.labs.Task6;

public class Abrams implements Tank {

    public Abrams(int ammo) {
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
        System.out.println("Fire! Ammo left: " + ammo);
        if (ammo == 0) {
            System.out.println("Empty ammunition.");
        }
    }
}
