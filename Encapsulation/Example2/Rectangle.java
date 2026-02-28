public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width,double height){
        setWidth(width);
        setHeight(height);
    }

    
    public void setWidth(double width){
        if(width>0){
            this.width=width;
        }
        else{
            System.out.println("Invalid width");
        }
    }


    public void setHeight(double height){
        if(height>0){
            this.height=height;
        }
        else{
            System.out.println("Invalid height");
        }
    }


    public double getArea(){
        return width*height;
    }
    


}
