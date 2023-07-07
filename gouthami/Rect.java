class Rect{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.length=3;
        r1.breadth=6;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
