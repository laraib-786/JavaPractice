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

        //2.System.out.println("Printed from draw method");
        //3.ellipse(mouseX,HEIGHT/2,100 ,100);
        paintWhite();
        //4.ellipse(mouseX,mouseY, DIAMETER,DIAMETER);

        //to move in x direction by itself
        //ellipse(x,mouseY, DIAMETER,DIAMETER);
        //x++;

//        ellipse(x*2,(2*HEIGHT)/5,30,30);
//        ellipse(x*3,(3*HEIGHT)/5,30,30);
//        ellipse(x*4,(4*HEIGHT)/5,30,30);

        for(int speed=1;speed<=4;speed++){
            ball(x*speed,(HEIGHT*speed)/5);
        }
3
        x++;

    }

    private void ball(int width,int height) {
        ellipse(width,height,30,30);
    }

    private void paintWhite() {
        //background(220);
    }
}