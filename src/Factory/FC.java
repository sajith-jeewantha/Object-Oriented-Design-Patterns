/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author sajithjeewantha
 */
enum GunNames {
    AK47,
    Sniper,
}

interface Gun {

    public abstract void fire();
}

class AK47 implements Gun {

    @Override
    public void fire() {
        System.out.println("Fire AK47");
    }
}

class Sniper implements Gun {

    @Override
    public void fire() {
        System.out.println("Fire Sniper");
    }
}

class GunFactory {

    public Gun MakeGuns(Enum gun) {
        if (gun.equals(GunNames.AK47)) {
            return new AK47();
        } else if (gun.equals(GunNames.Sniper)) {
            return new Sniper();
        }
        return null;
    }
}

public class FC {

    public static void main(String[] args) {

        GunFactory gunFactory = new GunFactory();
        Gun gun = gunFactory.MakeGuns(GunNames.AK47);
        gun.fire();
    }
}
