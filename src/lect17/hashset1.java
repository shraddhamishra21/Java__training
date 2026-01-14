package lect17;

import java.util.HashSet;

public class hashset1 {
    static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,4,5,6,1};
     //   int c[]=new int[10];
        HashSet<Integer > set=new HashSet<>() ;
        for(int i=0;i< a.length ;i++){
            set.add(a[i]);
        }
        for(int x:b){
           if( set.contains(x)) {
                IO.print(" "+x);
            }
        }


        }
    }

