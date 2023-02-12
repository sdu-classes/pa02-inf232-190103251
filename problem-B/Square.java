public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public void setWidth(double width){
        this.setWidth(width);
    }
    public void setLength(double length) {
        this.setLength(length);
    }
    public String toString(){
        return String.format("Square[%s,width=%f,length=%f]",super.toString(),getWidth(),getLength());
    }




}
