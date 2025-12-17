class Problem706 {
    int size;
    int capacity;
    private int[] myKey;
    private int[] myValue;

    public MyHashMap() {
        size = 0;
        capacity = 10;
        myKey = new int[capacity];
        myValue = new int[capacity];
    }

    public void grow() {
        capacity = capacity * 2;
        int[] newKey = new int[capacity];
        int [] newValue=new int[capacity];
        for (int i = 0; i < size; i++) {
            newKey[i]=myKey[i];
            newValue[i]=myValue[i];
        }
        myKey=newKey;
        myValue=newValue;
    }

    public void put(int key, int value) {
        if (size == capacity) {
            grow();
        }
        for (int i = 0; i < size; i++) {
            if (key == myKey[i]) {
                myValue[i] = value;
                return;
            }
        }
        myKey[size] = key;
        myValue[size] = value;
        size++;

    }

    public int get(int key) {
        for (int i = 0; i < size; i++) {
            if (myKey[i] == key) {
                return myValue[i];
            }
        }
        return -1;
    }
     public void removeValue(int index){
        for(int i=index;i<size-1;i++){
            myKey[i]=myKey[i+1];
            myValue[i]=myValue[i+1];
        }
        size--;
    }
    public void remove(int key) {
        if(size==0) return;
        for (int i = 0; i < size; i++) {
           if(myKey[i]==key){
            removeValue(i);
            return;
           }
        }
    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */