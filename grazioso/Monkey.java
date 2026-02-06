package grazioso;

public class Monkey extends RescueAnimal {
    // Attributes
    private double tailLength;
    private double height;
    private double bodyLength;
    private String species;

    // Default constructor w/ zero-equivalent attributes and no arguments
    public Monkey() {
        //Inherited attributes
        setName("None");
        setAnimalType("Monkey"); //ensures animal type is set
        setGender("Unspecified");
        setAge("0");
        setWeight("0");
        setAcquisitionDate("00-00-0000");
        setAcquisitionLocation("Unspecified");
        setTrainingStatus("Unspecified");
        setReserved(false);
        setInServiceCountry("Unspecified");
        // Monkey-specific attributes
        setTailLength(0.0);
        setHeight(0.0);
        setBodyLength(0.0);
        setSpecies("Unspecified");
    }

    // Constructor w/ attributes and arguments
    public Monkey(String inputName, String inputGender, String inputAge, String inputWeight,
                  String inputAcquisitionDate, String inputAcquisitionLocation, String inputTrainingStatus,
                  boolean inputReserved, String inputInServiceCountry, double inputTailLength, double inputHeight,
                  double inputBodyLength, String inputSpecies) {
        // Inherited attributes
        setName(inputName);
        setAnimalType("Monkey"); //ensures animal type is set
        setGender(inputGender);
        setAge(inputAge);
        setWeight(inputWeight);
        setAcquisitionDate(inputAcquisitionDate);
        setAcquisitionLocation(inputAcquisitionLocation);
        setTrainingStatus(inputTrainingStatus);
        setReserved(inputReserved);
        setInServiceCountry(inputInServiceCountry);
        // Monkey-specific attributes
        setTailLength(inputTailLength);
        setHeight(inputHeight);
        setBodyLength(inputBodyLength);
        setSpecies(inputSpecies);
    }

    //Accessor/mutator methods
    public void setTailLength(double inputTailLength) {
        this.tailLength = inputTailLength;
    }
    public double getTailLength() {
        return tailLength;
    }

    public void setHeight(double inputHeight) {
        this.height = inputHeight;
    }
    public double getHeight() {
        return height;
    }

    public void setBodyLength(double inputBodyLength) {
        this.bodyLength = inputBodyLength;
    }
    public double getBodyLength() {
        return bodyLength;
    }

    public void setSpecies(String inputSpecies) {
        this.species = inputSpecies;
    }
    public String getSpecies() {
        return species;
    }
}