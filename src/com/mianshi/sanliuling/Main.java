package com.mianshi.sanliuling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

int point = 0;
int edge = 0;

//邻接表的图
List<List<Integer>> graph = new ArrayList<List<Integer>>();

public Main(){

}

private void init(){
int pointNum = readInt();
int edgeNum = readInt();

//初始化点数
for(int i=0; i<pointNum; i++){
graph.add(new ArrayList<Integer>());
}

//初始化边
for(int i=0; i<edgeNum; i++){
setEdge(readInt(),readInt());
}
}

private void setEdge(int pos1,int pos2){
graph.get(pos2).add(pos1);
}

    private int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    //取得合理的
    private List<Integer> getRealable(){
    	List<Integer> result = new ArrayList<Integer>();
    	
    	for(int i=0; i<graph.size(); i++){
    	 if(graph.get(i).size()==0)
    	 result.add(i);
    	}
    	
    	return result;
    }
    
    private void printResult(){
    	List<Integer> result = getRealable();
    	for(int i=0; i<result.size(); i++){
    	 System.out.println(result.get(i));
    	}
    }
    
    static void main(String [] args){
    	
    }
}