package com.workintech.model;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        checkHeight(height);
        checkWidth(width);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return  height;
    }

    public void setWidth(double width){
        checkWidth(width);
    }

    public void setHeight(double height){
       checkHeight(height);
    }

    public void checkWidth (double width){
        if (width <0){
            this.width =0;
        }else{
            this.width = width;
        }
    }

    public void checkHeight (double height){
        if (height <0){
            this.height =0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        return this.height*this.width;
    }
}
