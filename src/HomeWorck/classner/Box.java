package HomeWorck.classner;

public class Box {
    double width;
    double height;
    double depth;

    double volium() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height =h;
        depth = d;

    }


}

