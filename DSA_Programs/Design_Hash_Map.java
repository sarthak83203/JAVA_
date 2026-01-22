
//Design of HashMap....
class HashMap{
    HashMap<Integer,Integer> list;  //Mapping
    public HashMap(){
        list=new HashMap<>();
    }
    public void put(int key,int value){
        list.put(key,value);
    }
    public int get(int key){
        if(list.containsKey(key)){   //Conatinskey...
            return list.get(key);
        }
        return -1;
    }
    public void remove(int key){
        list.remove(key);
    }
}