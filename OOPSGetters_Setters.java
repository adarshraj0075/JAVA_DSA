public class OOPSGetters_Setters {
    Pen p1=new Pen();
    p1.setColor("blue");
    System.out.println(p1.getColor());

    p1.setTip(5);
    System.out.println(p1.getTip());
    
}

class Pen{
    String color;
    int tip;
    

    void setColor(String color){
        this.color=color;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int tip){
        this.tip=tip;
    }

    int getTip(){
        return this.tip;
    }
}
