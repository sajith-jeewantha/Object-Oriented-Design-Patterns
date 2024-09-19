/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author sajithjeewantha
 */
class laptop {

    private SD sd;

    public void setSd(SD sd) {
        this.sd = sd;
    }

    public void readSD() {
        this.sd.requestSD();
    }
}

interface SD {

    public void requestSD();
}

class SamsungSD implements SD {

    @Override
    public void requestSD() {
        System.out.println("sumsungSD");
    }
}

class Adpter implements SD {

    private MicroSD microSD;

    public Adpter(MicroSD microSD) {
        this.microSD = microSD;
    }

    @Override
    public void requestSD() {
        this.microSD.requestMicro();
    }
}

interface MicroSD {

    public void requestMicro();
}

class SonyMicroSD implements MicroSD {

    @Override
    public void requestMicro() {
        System.out.println("SonyMicroSD");
    }
}

public class AD {

    public static void main(String[] args) {

        laptop lap = new laptop();

        SamsungSD samsungSD = new SamsungSD();
        SonyMicroSD sonyMicroSD = new SonyMicroSD();

        Adpter adpter = new Adpter(sonyMicroSD);

        lap.setSd(adpter);
        lap.readSD();
    }
}
