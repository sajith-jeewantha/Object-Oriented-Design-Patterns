package sj.patterns.adapter;

interface SD {
    public void requestSD();
}

class SamsungSD implements SD {

    @Override
    public void requestSD() {
        System.out.println("Samsung SD");
    }
}

class SdAdapter implements SD {

    private MicroSD microSD;

    public SdAdapter(MicroSD microSD) {
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
        System.out.println("Sony Micro SD");
    }
}

class laptop {
    private SD sd;

    public void setSd(SD sd) {
        this.sd = sd;
    }

    public void readSD() {
        this.sd.requestSD();
    }
}

public class Adapter {

    public static void main(String[] args) {

        laptop lap = new laptop();

        SamsungSD samsungSD = new SamsungSD();
        lap.setSd(samsungSD);
        lap.readSD();

        SonyMicroSD sonyMicroSD = new SonyMicroSD();
        SdAdapter sdAdapter = new SdAdapter(sonyMicroSD);
        lap.setSd(sdAdapter);
        lap.readSD();
    }
}
