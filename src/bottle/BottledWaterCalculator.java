package bottle;

public class BottledWaterCalculator {

    private int populationInMillions;
    private String country;  //country name
    private double numberOfCircles;
    private double averageCapacity; //volume in onces
    private double averageBottleLength; //in inches
    public final double EARTH_CIRCUMFERENCE = 24902;//in miles
    public final double INCHES_PER_MILE = 63360;
    public double ONCE_PER_GALLON = 128;

    public BottledWaterCalculator() {
    }

    public BottledWaterCalculator(String country, int population,
            double numberOfCircles, double averageCapacity,
            double averageBottleLength) {

        this.populationInMillions = population;
        this.country = country;
        this.numberOfCircles = numberOfCircles;
        this.averageCapacity = averageCapacity;
        this.averageBottleLength = averageBottleLength;
    }

    public int getPopulation() {
        return this.populationInMillions;
    }

    public String getCountry() {
        return country;
    }

    public double getNumberOfCircumference() {
        return numberOfCircles;
    }

    public double getAverageCapacity() {
        return averageCapacity;
    }

    public double getAverageBottleLength() {
        return averageBottleLength;
    }

    public void setAverageBottleLengthAndVolume(double averageCapacity, 
            double averageBottleLength) {
        this.averageCapacity = averageCapacity;
        this.averageBottleLength = averageBottleLength;
    }

    public double calculateNumberOfBottle() {
        double numberOfBottle = 0;
        numberOfBottle = (EARTH_CIRCUMFERENCE  * INCHES_PER_MILE * numberOfCircles)
                / averageBottleLength;

        return numberOfBottle;
    }

    public double calculateVolumePerPerson() {
        //volume in gallons
        double volumePerPerson = 0;
        double totalVolume = (calculateNumberOfBottle() * averageCapacity)/190;        
        volumePerPerson = totalVolume /(populationInMillions * 1000000 );
        return volumePerPerson;

    }

}
