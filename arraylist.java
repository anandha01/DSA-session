import java.util.*;
public class main{
    public static void main (String[] args){
        HashMap<String,String> map =new HashMap<>();
        
        // KEYS ARE KEY SENSITIVE


        //Insertion
        map.put("TN","TAMILNADU");
        map.put("KL","KERALA");
        map.put("KN","KARNATAKA");
        
        
        //Search
       System.out.println(map.get("TN"));  // map.get for get the output
        System.out.println(map.get("KL"));
        
        
         System.out.println(map.getOrDefault("AP","not found"));
        
        
        
     System.out.println(map.values());
        System.out.println(map.keySet());
        
        
         System.out.println(map.size());
        
        
        for (String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
            
            

            
            
            
            
        
            
        }
        
        
        
        
        
        
    }
}
