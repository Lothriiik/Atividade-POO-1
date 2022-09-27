package retangulo;

import java.lang.Math;

public class Rectangle {
   private double Width;
   private double Height;

   public double setWidth(double Width2){
        this.Width = Width2;
        return this.Width;
   }

   public double setHeight(double Height2){
        this.Height = Height2;
        return this.Height;
    }
   
   public double Area(){
    double Area= Width * Height;
    return Area;

    }
    public double Perimeter(){
    double Perimeter= 2*(Width + Height);
    return Perimeter;
    
    }

    public double Diagonal(){
    double Diagonal= Math.sqrt((Math.pow(Width,2)) + (Math.pow(Height,2)));
    return Diagonal;

    }
 



}
