package bottle;




public class BottleTest {

    public static void main(String[] args) {
     
        //BottledWaterCalculator object
BottledWaterCalculator bottleCalc = new BottledWaterCalculator("US",350,190,8.5,12);
 
System.out.println("Country: "+bottleCalc.getCountry());
System.out.println("Population: "+bottleCalc.getPopulation());
System.out.println("Number of Circumferences: "+bottleCalc.getNumberOfCircumference());
System.out.println("Length of an Average Bottle: "+bottleCalc.getAverageBottleLength()+" inches");
System.out.println("Volume of an Average Bottle: "+bottleCalc.getAverageCapacity()+" onces");
System.out.println("The total number of bottles used: "+bottleCalc.calculateNumberOfBottle());	
System.out.println("The average amount of water consumed per person, in gallons: "+bottleCalc.calculateVolumePerPerson());

bottleCalc.setAverageBottleLengthAndVolume(16.9,9);
System.out.println("\n\n\nLength of an Average Bottle: "+bottleCalc.getAverageBottleLength()+" inches");
System.out.println("Volume of an Average Bottle: "+bottleCalc.getAverageCapacity()+" onces");
System.out.println("The total number of bottles used: "+bottleCalc.calculateNumberOfBottle());	
System.out.println("The average amount of water consumed per person, in gallons: "+bottleCalc.calculateVolumePerPerson());


 
    }
}
