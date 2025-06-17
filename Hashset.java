 // Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :no
class MyHashSet {

    List<Integer>[] buckets; //use an array of lists(buckets) to store values
    
    int size =1000;//declaring size
    
        public MyHashSet() {
         buckets=new List[size];// adding a constructor
            
            
        }
        int getBucketIndex(int key){
            return key%size;//hashfunction which decides where to place a value
        }
        
        public void add(int key) {
            int index=getBucketIndex(key);//usinh hash, go to bucket,check, add if not there
            if(buckets[index]==null){
            buckets[index]=new ArrayList<>();
            }
            if(!buckets[index].contains(key)){
                buckets[index].add(key);
            }
            
        }
        
        public void remove(int key) {
            int index = getBucketIndex(key);//go to bucket remove if it exists
            if (buckets[index] != null){
                buckets[index].remove(Integer.valueOf(key));
            }
            
        }
        
        public boolean contains(int key) {
            int index = getBucketIndex(key);
            return buckets[index] !=null && buckets[index].contains(key);//return if it is found
    
            
        }
    }
    
    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */