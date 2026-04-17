package sj.patterns.mediator;

interface ATCTower{
    void requestTakeOff(Plane plane);
    void requestLanding(Plane plane);
}

class Controller implements ATCTower{

    @Override
    public void requestLanding(Plane plane) {
        plane.notifyATC("Request to landing");
    }

    @Override
    public void requestTakeOff(Plane plane) {
        plane.notifyATC("Request to take off");
    }
}

interface Plane{
    void takeOff();
    void land();
    void notifyATC(String message);
}

class PrivatePlane implements Plane{

    private ATCTower atcTower;

    public PrivatePlane(ATCTower atcTower){
        this.atcTower = atcTower;
    }

    @Override
    public void takeOff() {
        this.atcTower.requestTakeOff(this);
    }

    @Override
    public void land() {
        this.atcTower.requestLanding(this);
    }

    @Override
    public void notifyATC(String message) {
        System.out.println("Private Plane : " + message);
    }
}



public class Mediator {

    public static void main(String[] args) {

        ATCTower atcTower = new Controller();
        PrivatePlane privatePlane = new PrivatePlane(atcTower);

        privatePlane.takeOff();
        privatePlane.land();
    }
}
