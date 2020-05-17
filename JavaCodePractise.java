/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import access_modifier_demo.MajorClass;

/**
 *
 * @author Abantika
 */
public class JavaCodePractise 
{
    
    
    public void pyramid_1(int n){
        /*
            *
            **
            ***
            ****
        */
        
        int i, j, k;
        
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
    public void pyramid_2(int n){
        /* 
           ****
           ***
           **
           *   
        */
        
        int i, j;
        
        for(i=0; i<=n; i++){
            for(j=n; j>=i; j--){
                System.out.print(+j);                    
            }
            System.out.println();
        }  
        
    } 
    
    
    public void pyramid_3(int n){  
        /* 
           ****
           ***0
           **00
           *000
           0000 
        */
          
        int i, j, k;
        
        for(i=0;i<=n;i++){
            for(j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(k=0; k<n-j; k++){
                System.out.print("O");
            }             
            System.out.println();    
        }
    }  
    
    
    public void pyramid_4(int n){
        /*
           *    
          **
         ***
        ****  
        */
        
        int i, j, k;
    
        for(i=0; i<n; i++){
            for(j= 0; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(k =0; k< i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
    
    
    public void pyramid_5(int n){
        /*  
            ****
             ***
              **
               *  
        */  
        
        int i, j, k;
       
        for (i=0; i<n; i++){
            for(j=0; j<=i-1; j++){
                System.out.print(" ");
            }
            for(k=0; k<n-j; k++){
                System.out.print("*");
            }
            
            System.out.println();
        } 
        
    }
    
    
    public void pyramid_6(int n){
        
        /*  * 
           * * 
          * * * 
        *  * *  *  */
        
        int i, j, k;
       
        for(i=0; i<n; i++){
            for(j=0; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(k=0; k<i+1; k++){
                System.out.print(" *");
            }
            System.out.println();
        }  
        
    }
    
    
    public void pyramid_7(int n){
        /*   
             * * * *
             *     *
             *     *
             * * * *  
        */   
        
        int i, j;
      
        for(i=1; i<n; i++){
            for(j=1;j<n;j++){ 
                if (i>1 && i<n-1 && j>1 && j<n-1)
                    System.out.print(" ");
                else
                    System.out.print("*");   
            }
            System.out.println();
        }
    }
    
    
    public void pyramid_8(int n){    
        /* 
           X0X0
           X0X0
           X0X0
           X0X0  
        */
        
        int i, j, k;
     
        for(i=1; i<n; i++){
            for(j=1;j<n;j++){ 
                if (i>=1 && i<=n && j%2==0) 
                    System.out.print("0");
                else
                    System.out.print("X");     
            }
            System.out.println(); 
        } 
    }
    
    
    public void pyramid_9(int n){
        /* 
           X0X0
           0X0X
           X0X0
           0X0X 
        */
       
        int i, j, k;
        
        for(i=1; i<n; i++){
            for(j=1;j<n;j++){
                if (i%2!=0 && j%2==0)
                    System.out.print("0");
                else if (i%2==0 && j%2==0)
                    System.out.print("X");
                else if (i%2==0 && j%2!=0 )
                    System.out.print("0");
                else
                    System.out.print("X");
            } 
            System.out.println(); 
        } 
    }
    
    
    public void pyramid_10(int n){
        /* 
           *
            *
              *
                *   
        */
       
        int i, j, k;
        
        for(i=1; i<=n; i++){
           for(j=1; j<=i; j++){
                if(i>=2 && j<i)
                    System.out.print(" ");
                else
                    System.out.print("*");   
            }
            System.out.println();
        }
    }  
    
    
    public void pyramid_11(int n){ 
        /*     *
             *
           *
         *  
        */
        
        int i, j, k;
        
        for(i=1; i<n; i++){
            for(j= 1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(k =1; k< i+1; k++)
            {
                if(i>1 && k>=2)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        } 
    }   
    
    
    public void pyramid_12(int n){ 
        /*
           *
            0
              *
                0   
        */
        
        int i, j, k;
        
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                if(i>=2 && j<=i && i%2==0 && j>=i){
                    System.out.print("0");
                }
                else if (i>=2 && j<i){
                    System.out.print(" ");
                }
                else {
                System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    
    
    public void pyramid_13(int n){
        /*    
              X
            0
          X
        0  
        */ 
        
        int i, j, k;
        for(i=1; i<n; i++){
            for(j= 1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(k =1; k< i+1; k++){
                if(i>1 && k>=2){
                    System.out.print(" ");
                }
                else if (i>1 && k>=2 && i%2==0){
                    System.out.print("P");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main ( String args[]){
        int n = 15;
        
       
        JavaCodePractise jcp = new JavaCodePractise();
        jcp.pyramid_1(n);
        System.out.println();
        jcp.pyramid_2(n);
        System.out.println();
        jcp.pyramid_3(n);
        System.out.println();
        jcp.pyramid_4(n);
        System.out.println();
        jcp.pyramid_5(n);
        System.out.println();
        jcp.pyramid_6(n);
        System.out.println();
        jcp.pyramid_7(n);
        System.out.println();
        jcp.pyramid_8(n);
        System.out.println();
        jcp.pyramid_9(n);
        System.out.println();
        jcp.pyramid_10(n);
        System.out.println();
        jcp.pyramid_11(n);
        System.out.println();
        jcp.pyramid_12(n);
        System.out.println();
        jcp.pyramid_13(n);    
    }
}

    
      
       
       
    
       
     
    
       
       
    
    
       
       
   
      
      
      
      
      
      
       
    
       
     
    
    
       
       
       
       
      
       
      
       
       
       
       
       
       
       
   

       

