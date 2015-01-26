package Source;


import java.io.IOException;

public class Main_App {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Dictionary d = new Dictionary();
        d.loadDic("en-GB.dic");
        boolean x = d.search("alex");
        System.out.println(x);
        boolean x1 = d.search("alexex");
        System.out.println(x1);
        boolean x2 = d.search("alex");
        System.out.println(x2);
        boolean x3 = d.search("alexee");
        System.out.println(x3);
        boolean x4 = d.search("alexww");
        System.out.println(x4);
        
        System.out.println("\n");
        Dictionary e = new Dictionary();
        e.loadDic("one-20.txt"); 
        
        boolean a1 = e.search("5");
        System.out.println(a1);
        boolean a2 = e.search("12");
        System.out.println(a2);
        boolean a3 = e.search("18");
        System.out.println(a2);
        boolean a4 = e.search("22");
        System.out.println(a4);
        
    }
}
