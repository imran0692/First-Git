import java.util.ArrayList;
public class Details
{
    public static void main(String [] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.println("Initial size: "+al.size());
        al.add(1);
        al.add(13);
        al.add(45);
        al.add(44);
        al.add(99);
        System.out.println("Size after few additions: "+al.size());
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        System.out.println("Size after remove operations: "+al.size());
      
   }
}