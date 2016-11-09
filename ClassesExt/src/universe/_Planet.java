package universe;

public abstract class _Planet implements __SpaceBody {
    double radius;
    double mass;
    double distanceFromStar;
    float temp;
    float rotationalSpeed;
    String population;
    String atmosphere;
    _SecondaryPlanet[] secondaryPlanets;
    int egeMillions;

    _Planet(double radius, double mass, double distanceFromStar, float temp, float rotationalSpeed, String population, String atmosphere, _SecondaryPlanet[] secondaryPlanets) {
        this.radius = radius;
        this.mass = mass;
        this.distanceFromStar = distanceFromStar;
        this.temp = temp;
        this.rotationalSpeed = rotationalSpeed;
        this.population = population;
        this.atmosphere = atmosphere;
        this.secondaryPlanets = secondaryPlanets;
        this.egeMillions = 0;
    }



    public void setPopulation(String population) {
        this.population = population;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
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
