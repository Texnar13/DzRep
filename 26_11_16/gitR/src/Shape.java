public interface Shape {

    double sizeX = 0;
    double sizeY = 0;

    double getSizeX();
    void setSizeX(int x);
    double getSizeY();
    void setSizeY(int y);
    double getPerim();
    double getPl();

    static void whoAmI(){
        System.out.println("was implement interface Shape");
    }
}
