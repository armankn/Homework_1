package Exercise_5;

public class Main {
    public static void main(String[] args){
        double mile = 10.2;
        double meter = 5.6;
        double inch = 4.8;
        double centimeter = 3.9;

        DistanceConverter distanceConverter = new DistanceConverter();
        distanceConverter.setMile(mile);
        System.out.println(mile + " mile = " + distanceConverter.convertMilesToMeters() + " meter");

        distanceConverter.setMeter(meter);
        System.out.println(meter + " meter = " + distanceConverter.convertMetersToMiles() + " mile");

        distanceConverter.setInch(inch);
        System.out.println(inch + " inch = " + distanceConverter.convertInchToCentimeter() + " centimeter");

        distanceConverter.setCentimeter(centimeter);
        System.out.println(centimeter + " centimeter = " + distanceConverter.convertCentimeterToInch() + " inch");
    }
}
