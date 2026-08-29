public class eh{
    public static void main (String[] args){
        String s= null;
        int a =5;
        try {
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("exception handle");
        }
        System.out.println("progrem ends......");
    }
}