package universe;

public abstract class _Star implements __SpaceBody {
    int egeMillions;
    double radius;
    double mass;
    float temp;

    public _Star( double radius, double mass, float temp) {
        this.egeMillions = 0;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }
}
