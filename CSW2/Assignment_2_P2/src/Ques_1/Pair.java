package Ques_1;

public class Pair<K,V> {
    private K key;
    private V value;
   Pair(K key, V value){
        this.key=key;
        this.value=value;
   }

   public K getKey(){
    return this.key;
   }

   public V getValue(){
    return this.value;
   }

   public void setKey(K key){
    this.key=key;
   }

   public void setValue(V value){
    this.value=value;
   }

   public String toString(){
    return "("+this.key+", "+this.value+")";
   }
}
