public class Oval implements Shape {

    double sizeX = 0;
    double sizeY = 0;

    @Override
    public double getSizeX() {
        return sizeX;
    }

    @Override
    public void setSizeX(int x) {
        this.sizeX = x;
    }

    @Override
    public double getSizeY() {
        return sizeY;
    }

    @Override
    public void setSizeY(int y) {
        this.sizeY = y;
    }

    @Override
    public double getPerim() {
        return 2 * Math.PI * Math.sqrt(((sizeX / 2) * (sizeX / 2) + (sizeX / 2) * (sizeX / 2)) / 2);
    }

    @Override
    public double getPl() {
        return Math.PI * (sizeX / 2) * (sizeY / 2);
    }
}
