import processing.core.PApplet;

public class MySketch extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;
    int x=0;
    public static void main(String[] args) {
        PApplet.main("MySketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){
        //2.System.out.println("Printed from setup method");
        //1.ellipse(WIDTH/2,HEIGHT/2,100 ,100);
    }

    @Override
    public void draw(){

        for(int speed=1;speed<=4;speed++){
            ball(x*speed,(HEIGHT*speed)/5);
        }

        x++;

    }

    private void ball(int width,int height) {
        ellipse(width,height,30,30);
    }

    private void paintWhite() {
        background(220);
    }
}
