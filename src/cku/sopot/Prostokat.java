package cku.sopot;

public class Prostokat {
    private float bokA;
    private float bokB;

    public Prostokat(float bokA, float bokB) {
        setBokA(bokA);
        setBokB(bokB);
    }

    public float getBokA() {
        return bokA;
    }

    public void setBokA(float bokA) {
        if(bokA>=0) this.bokA = bokA;
        else this.bokA = -bokA;
        //this.bokA = bokA;
    }

    public float getBokB() {
        return bokB;
    }

    public void setBokB(float bokB) {
        if (bokB>=0) this.bokB=bokB;
        else this.bokB = -bokB;
    }
    public float obliczPole(){
        return this.bokA*this.bokB;
    }

    public float obliczObwod(){
        return 2*this.bokA+2*this.bokB;
    }
}
