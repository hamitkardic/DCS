

import java.io.Serializable;


 
public class MyObject implements Serializable {
    private int length;
    private int height;
    private int breadth;
    public MyObject()
    {
        this.length = 4;
        this.height = 5;
        this.breadth = 3;
    }
    int getLength()
    {
        return this.length;
    }
    
    void setLength(int l)
    {
        this.length = l;
    }
    
    int getHeight()
    {
        return this.height;
    }
    
    void setHeight(int h)
    {
        this.height = h;
    }
    
    int getBreadth()
    {
        return this.breadth;
    }
    
    void setBreadth(int b)
    {
        this.breadth = b;
    }
}
