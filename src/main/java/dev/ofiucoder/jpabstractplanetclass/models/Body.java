package dev.ofiucoder.jpabstractplanetclass.models;

public abstract class Body {

    private double massKg;
    private double volumeKmCubic;


    public Body(double massKg, double volumeKmCubic) {
        this.massKg = massKg;
        this.volumeKmCubic = volumeKmCubic;
        
    }

    public double getMassKg(){
        return massKg;
    }

    public void setMassKg(double massKg) {
        this.massKg = massKg;
        
    }

    public double getVolumeKmCubic(){
        return volumeKmCubic;
    }

    public void setVolumeKmCubic(double volumeKmCubic){
        this.volumeKmCubic = volumeKmCubic;
    }

    public double getDensity(){
        double density = massKg/volumeKmCubic;
        return density;

    }
}
