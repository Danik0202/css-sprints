abstract class Goldshape {

    public Goldshape() {
    }

    double getPrice(){
        return getVolume() * 250 + 1200;
    }

    abstract double getVolume();



}
