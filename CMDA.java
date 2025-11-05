
public class CMDA{
    public static void main(String[] args) {
        int s=0;
        for(int i=0;i<args.length;i++)
         {
            System.out.println(args[i]);

            s=s+Integer.parseInt(args[i]);

        }
        System.out.println("sum="+s);
        System.out.println("number of inputs"+args.length);
        
    }

}
