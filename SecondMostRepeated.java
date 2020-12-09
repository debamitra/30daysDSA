
class SecondMostRepeated
{
    String secFrequent(String arr[], int N)
    {
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map1 = new TreeMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])) 
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
       
        map.entrySet().forEach(entry->{
             map1.put(entry.getValue(),entry.getKey()); 
        });

        int size = map1.size();
        int i = map1.keySet().toArray(new Integer[0])[size-2];
        return  map1.get(i);
        
    }
} 
