public class Cylinder extends Container{


    private double radius;
    private double height;
    protected double Volume;
    private double VolumeOfWater;





    public void GetDimensions(double radius, double height,double VolumeOfWater){
        this.radius = radius;
        this.height = height;
        this.VolumeOfWater = VolumeOfWater;
    }

    @Override
    public double CalcVolume(){
        this.Volume = ((22/7)*(radius)*(radius)*height);
        return Volume;
    }


    @Override
    public double GetEmptyVolume(){
        return (Volume-VolumeOfWater);
    }
}
