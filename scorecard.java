import java.util.*;
class scorecard{
    public static void main(String[] args){
        int sum=0;
        int wicket=0;
        int wide=0;
        int nball=0;
        int legby=0;
        int[][] a={
                    {1,2,66,4,2,6,3},
                    {1,2,81,4,2,82,0},
                    {1,2,3,93,2,6,0},
                    {4,4,4,72,6,6,2}
                  };
                  /* 60 for Wide
                     61 for Wide And 1 run
                     62 for Wide And 2 run
                     63 for Wide And 3 run
                     64 for Wide And 4 run
                     66 for Wide And 6 run
                     
                     70 for no ball
                     71 for no ball and 1 run
                     72 for no ball and 2 run
                     73 for no ball and 3 run
                     74 for no ball and 4 run
                     76 for no ball and 6 run
                     
                     80 for Wicket
                     81 for Wicket And 1 run(in case of run out)
                     82 for Wicket And 2 run(in case of run out)

                     90 for legby 1 run
                     91 for legby 2 run
                     92 for legby 3 run
                     93 for legby 4 run
                      */

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]>=60)
                {
                    if(a[i][j]==60)
                    {
                        wide+=1;
                        sum+=1;
                    }
                    else if(a[i][j]==61)
                    {
                        wide+=2;
                        sum+=2;
                    }
                    else if(a[i][j]==62)
                    {
                        wide+=3;
                        sum+=3;
                    }
                    else if(a[i][j]==63)
                    {
                        wide+=4;
                        sum+=4;
                    }
                    else if(a[i][j]==64)
                    {
                        wide+=5;
                        sum+=5;
                    }
                    else if(a[i][j]==66)
                    {
                        wide+=7;
                        sum+=7;
                    }

                    else if(a[i][j]==70)
                    {
                        nball++;
                        sum+=1;
                    }
                    else if(a[i][j]==71)
                    {
                        nball++;
                        sum+=2;
                    }
                    else if(a[i][j]==72)
                    {
                        nball++;
                        sum+=3;
                    }
                    else if(a[i][j]==73)
                    {
                        nball++;
                        sum+=4;
                    }
                    else if(a[i][j]==74)
                    {
                        nball++;
                        sum+=5;
                    }
                    else if(a[i][j]==76)
                    {
                        nball++;
                        sum+=7;
                    }
                    else if(a[i][j]==80)
                    {
                        wicket++;
                    }
                    else if(a[i][j]==81)
                    {
                        sum+=1;
                        wicket++;
                    }
                    else if(a[i][j]==82)
                    {
                        sum+=2;
                        wicket++;
                    }
                    else if(a[i][j]==90)
                    {
                        legby+=1;
                        sum+=1;
                    }
                    else if(a[i][j]==91)
                    {
                        legby+=2;
                        sum+=2;
                    }
                    else if(a[i][j]==92)
                    {
                        legby+=3;
                        sum+=3;
                    }
                    else if(a[i][j]==93)
                    {
                        legby+=4;
                        sum+=4;
                    }
                } 
                else
                {
                    sum+=a[i][j];
                }
            }
            
        }
        System.out.print(sum+"/");
        System.out.println(wicket);
        System.out.println("Extras: "+"nb:"+nball+" , "+"wd:"+wide+" , "+"lb:"+legby);
        
    }
}