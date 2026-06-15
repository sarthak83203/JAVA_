package OOPS;

public class Syntax {
    public static void main(String args[]){
        Pen p1=new Pen();//created object of the pen as p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(56);
        System.out.println(p1.tip);

    }

    
}
class Pen{
    String color;
    int tip;
    
    //function
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
