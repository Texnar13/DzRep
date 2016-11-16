package universe;

public class _Planet implements __SpaceBody {
    private double radius;
    private double mass;
    private double distanceFromStar;
    private float temp;
    private float rotationalSpeed;
    private String population;
    private String atmosphere;
    private _SecondaryPlanet[] secondaryPlanets;
    private int egeMillions;
    String name;

    _Planet(String name, double radius, double mass, double distanceFromStar, float temp, float rotationalSpeed, String population, String atmosphere, _SecondaryPlanet[] secondaryPlanets) {
        this.radius = radius;
        this.mass = mass;
        this.distanceFromStar = distanceFromStar;
        this.temp = temp;
        this.rotationalSpeed = rotationalSpeed;
        this.population = population;
        this.atmosphere = atmosphere;
        this.secondaryPlanets = secondaryPlanets;
        this.egeMillions = 0;
        this.name = name;
    }
    _Planet(String name, double radius, double mass, double distanceFromStar, float temp, float rotationalSpeed, String population, String atmosphere) {
        this.radius = radius;
        this.mass = mass;
        this.distanceFromStar = distanceFromStar;
        this.temp = temp;
        this.rotationalSpeed = rotationalSpeed;
        this.population = population;
        this.atmosphere = atmosphere;
        this.egeMillions = 0;
        this.name = name;
    }




    public void setPopulation(String population) {
        this.population = population;
    }
    public void setPopulation() {
        this.population = null;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }
    public void setAtmosphere() {
        this.atmosphere = null;
    }

    public void setEgeMillions(int egeMillions) {
        this.egeMillions = egeMillions;
    }



    double getG(){
        return ((6.67408 * mass/100000)/1000000)/(radius*radius);
    }

    public int getEgeMillions() {

        return egeMillions;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceFromStar() {
        return distanceFromStar;
    }

    public float getTemp() {
        return temp;
    }

    public float getRotationalSpeed() {
        return rotationalSpeed;
    }

    public String getPopulation() {
        return population;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public _SecondaryPlanet[] getSecondaryPlanets() {
        return secondaryPlanets;
    }
}
