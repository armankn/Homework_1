package Exercise_5;

public class DistanceConverter {
    final double MILETOMETER = 1609.344;
    final double INCHTOCENTIMETER = 2.54;
    private double mile;
    private double meter;
    private double inch;
    private double centimeter;

    void setMile(double mile){this.mile = mile;}
    double getMile(){return this.mile;}

    void setMeter(double meter){this.meter = meter;}
    double getMeter(){return this.meter;}

    void setInch(double inch){this.inch = inch;}
    double getInch(){return this.inch;}

    void setCentimeter(double centimeter){this.centimeter = centimeter;}
    double getCentimeter(){return this.centimeter;}

    double convertMilesToMeters(){
        return getMile() * MILETOMETER;
    }
    double convertMetersToMiles(){
        return getMeter() * 1/MILETOMETER;
    }
    double convertInchToCentimeter(){
        return getInch() * INCHTOCENTIMETER;
    }
    double convertCentimeterToInch(){
        return getCentimeter() * 1/INCHTOCENTIMETER;
    }
}
