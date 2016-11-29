public class Circle implements Shape {
    int sizeX = 0;
    int sizeY = 0;


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
        return (Math.PI * sizeX);
    }

    @Override
    public double getPl() {
        return Math.PI * sizeX * sizeX;
    }
}
