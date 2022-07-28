public class Cube extends Container{

    private double length;
    private double width;
    private double height;
    protected double Volume;
    protected double VolumeOfWater;





    public void GetDimensions(double length, double height, double width, double VolumeOfWater){

        this.length = length;
        this.height = height;
        this.width = width;
        this.VolumeOfWater = VolumeOfWater;

    }
    @Override
    public double CalcVolume(){
        this.Volume = length*width*height;
        return Volume;

    }

    @Override
    public double GetEmptyVolume(){
        return (Volume-VolumeOfWater);
    }


}
