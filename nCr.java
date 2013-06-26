/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr;
import java.io.*;
import java.util.*;

/**
 *
 * @author dnandiha
 */
public class Ncr {
    public static void generate_combinations(ArrayList a,int n,int r,int cur,int flag,String str){
        if(flag==1){
        str+=a.get(cur-1)+" ";
        }
        if(n<r||r==0){
            System.out.println(str);
            return;
        }
        if(n==r){
            for(int i=cur; i<a.size(); i++){
                str+=a.get(i)+" ";
            }
            System.out.println(str);
            return;
        }
        
        generate_combinations(a,n-1,r-1,cur+1,1,str);
        generate_combinations(a,n-1,r,cur+1,0,str);
    }
    public static void main(String[] args){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter number of elements");
         try{
             int num=Integer.parseInt(br.readLine());
             ArrayList list=new ArrayList();
             for(int i=1; i<=num; i++){
                 list.add(new Integer(i));
             }
             System.out.println("Enter value of r:");
             int r = Integer.parseInt(br.readLine());
             generate_combinations(list,num,r,0,0,"");
         }
         catch(Exception e){
             e.printStackTrace();
         }
    }

    
    
}
