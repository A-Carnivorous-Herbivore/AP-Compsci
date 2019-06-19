import java.io.*;
import java.util.*;
public class due{
    public static void due(String[] arg){
        File f  = new File ("quiz responses.csv");
        try{
            Scanner input = new Scanner(f);
            ArrayList <String[]> a  = new ArrayList<String[]>();

            while(input.hasNext()){

                String str = input.nextLine();   
                String[] arr = str.split("_");
                a.add(arr);
            }
            int b=0;
            for (int i =1; i<a.size()-2;i++){
                b=0;
                for(int k = 0 ; k < a.get(0).length;k++){
                    if(a.get(1)[k].equals(a.get(i)[k])){
                        b++;
                    }
                    System.out.println(a.get(i)[0]+"   " + b+ " " +a.get(i).length);

                }
            
        }

    }catch(FileNotFoundException e){
    
 e.printStackTrace();   
}
    
}

}
















