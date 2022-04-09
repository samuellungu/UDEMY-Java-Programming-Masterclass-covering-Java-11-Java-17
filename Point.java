
public class Point {
    private int x;
    private int y;
    
    public Point(){
        
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(((getX() *getX())+(getY()*getY())));
    }
    public double distance(int x, int y){
        int xValue=Math.abs(getX()-x);
        int yValue=Math.abs(getY()-y);
        return Math.sqrt((xValue *xValue)+(yValue*yValue));
        
    }
    public double distance(Point point){
        int xValue=Math.abs(this.getX()-point.getX());
        int yValue=Math.abs(this.getY()-point.getY());
        return Math.sqrt((xValue *xValue)+(yValue*yValue));
        
    }
