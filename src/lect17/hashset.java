package lect17;

import java.util.HashSet;

public class hashset {
    static void main(String[] args) {
        int a[]={1,2,3,4,1};
        HashSet <Integer > set=new HashSet<>() ;
        for(int i=0;i< a.length ;i++){
            set.add(a[i]);
        }
        if(a.length == set.size()){
            IO.println("No dublicate");
        }
        else{
            IO.println("Have dublicate");
        }
    }
}
