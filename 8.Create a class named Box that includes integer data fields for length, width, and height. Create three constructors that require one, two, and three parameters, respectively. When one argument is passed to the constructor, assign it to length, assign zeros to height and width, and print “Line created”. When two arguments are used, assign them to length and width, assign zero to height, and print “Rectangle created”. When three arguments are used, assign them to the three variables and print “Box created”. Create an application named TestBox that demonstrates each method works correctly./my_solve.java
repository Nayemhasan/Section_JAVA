class Box{
    int length;
    int wid;
    int height;
    public Box(int x)
    {
        length =x;
        System.out.print("Line created");
        System.out.println();
    }
    public Box(int x, int y)
    {
        length = x;
        wid = y;
        System.out.print("Rectangle Created");
        System.out.println();
    }
    public Box(int x, int y, int z)
    {
        length = x;
        wid = y;
        height = z;
        System.out.print("Box created");
        System.out.println();
    }
    public int getLength()
    {
        return length;
    }
    public int getWid()
    {
        return wid;
    }
    public int getHeight()
{
    return height;
}

}
public class TestBox{
    public static void main(String[] args) {
 Box box1 = new Box(5);
 Box box2 = new Box(6,7);
 Box box3 = new Box(8,9,10);
        System.out.println("The length of the line is "+box1.length);
        System.out.println("The length and width of the rectangle is " +
                ""+box2.length+","+box2.wid) ;
        System.out.println("The length, width, and height of box is " +
                ""+box3.length+","+ box3.wid+","+ box3.height) ;
    }
}

