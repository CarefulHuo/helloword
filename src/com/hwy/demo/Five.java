package com.hwy.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Five {
    public static void main(String args[]){
        int [] A = {1,2,3,4};
        int [] B = {2,4,5,6};
        ArrayList<Integer> req = new ArrayList<>();
        for (int i=0; i< A.length ; i++){
            req.add(A[i]);
        }
        for (int i=A.length; i<B.length; i++){
            req.add(B[i]);
        }
        Five.port(req);

    }
    public static int [] port(List<Integer> request){
        Collections.sort(request); //(默认升序)
//      Collections.reverse(req); //(默认降序)
        int [] C = new int [request.size()];
        for (int i=0 ; i <request.size(); i++) {
            C[i] = request.get(i);
        }
        return C;
    }
}
