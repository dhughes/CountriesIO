/**
 * This class handles this requirement, "Create a Country class
 * to store both the name and abbreviation."
 */
public class Country {

    // create a public string property for abbreviation
    public String abbreviation;

    // create a public string property for the country name
    public String name;

    // create a constructor for this class that accepts the abbreviation and name as arguments and configures this class
    public Country(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    // create a getter for abbreviation
    public String getAbbreviation() {
        return abbreviation;
    }

    // create a setter for abbreviation
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // create a getter for name
    public String getName() {
        return name;
    }

    // create a setter for name
    public void setName(String name) {
        this.name = name;
    }
}
