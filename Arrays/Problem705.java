class Problem705 {
    int capacity;
    int size;
    private int[] obj;
    public void grow(){
      capacity=capacity*2;
      int[] newObj=new int[capacity];
      for(int i=0;i<size;i++){
        newObj[i]=obj[i];
      }
      obj=newObj;
    }
    public MyHashSet() {
       size=0;
       capacity=10;
       obj=new int[capacity];  
    }
    
    public void add(int key) { 
       if(size==capacity){
        grow();
       }   
       for(int i=0;i<size;i++){
        if(key==obj[i]){
            return;
        }
       }
       obj[size]=key;
       size++;
    }
    public void removeValue(int index){
        for(int i=index;i<size-1;i++){
            obj[i]=obj[i+1];
        }
        size--;
    }
    
    public void remove(int key) {
        for(int i=0;i<size;i++){
            if(obj[i]==key){
                 removeValue(i);
                 break;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0;i<size;i++){
           if(obj[i]==key){
            return true;
           }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */