package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return this.height * this.width;
    }

    public double Perimeter(){
        return (this.width * 2) + (this.height * 2);
    }

    public double Diagonal(){
        return Math.sqrt((Math.pow(this.height, 2) + (Math.pow(this.width, 2))));
    }
}
