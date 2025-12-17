class Program1668{
   public int maxRepeating(String sequence, String word) {
          int count=0;
          String base=word;
          while(sequence.contains(word)){
              count++;
              word+=base;
          }
          return count;
      }
}