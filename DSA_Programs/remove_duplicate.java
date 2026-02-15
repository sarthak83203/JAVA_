//This questions seems to be easy but test case are twisted.Difficult for me to get it...
public int remove_duplicate(int [] nums){
    HashSet<Integer> list = new LinkedHashSet<>();  //Arrays order can't be change
    for(int i:nums){
        list.add(i);
    }
    //now in question they are focussing on the nums array like test case are given in form of nums..
    int index=0;
    for(int y:list){
        nums[index++]=y;
    }

    return list.size(); //they want the size of unique elements also.....
}