
public class Queen {
	
	public static void row(int r,int c,int countr,int countc, int Mat[][]){
		if(countr==r)
		{
			column(r,c,countr,countc,Mat);
		}
		else
		{
			countr++;
			row(r,c,countr,countc,Mat);
		}
	}
	
	public static void column(int r,int c,int countr,int countc, int Mat[][]){
	   
		if(countc==c & c != 0 & r!=0 & c!=3)
		{
		    int checkrow = r;
		    int checkcol = c;
		    checkcol--;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkcol = checkcol + 2;
		        if(Mat[checkrow][checkcol] == 0)
		        {
		            checkrow--;
		            if(Mat[checkrow][checkcol] == 0)
		            {
		                checkcol--;
		                if(Mat[checkrow][checkcol] == 0)
		                {
		                    checkcol--;
		                    if(Mat[checkrow][checkcol] == 0)
		                    {
		                        Mat[r][c]=1;
		                    }
		                }
		            }
		        }
		    }
			
		}
		else if(c==0 & r!=0 & r<3){
		    int checkcol = c;
		    int checkrow = r;
		    checkcol++;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkrow++;
		        if(Mat[checkrow][checkcol] == 0)
		        {
		            checkcol--;
		            if(Mat[checkrow][checkcol] == 0)
		            {
		                Mat[r][c]=1;
		            }
		        }
		    }
		}
		else if(r==0 & c!=0 & c!=3)
		{
		    int checkcol = c;
		    int checkrow = r;
		    checkcol--;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkcol = checkcol+2;
		        if(Mat[checkrow][checkcol] == 0)
		        {
		            checkrow++;
		            if(Mat[checkrow][checkcol] == 0)
		            {
		                checkcol--;
		                if(Mat[checkrow][checkcol] == 0)
		                {
		                    checkcol--;
		                     if(Mat[checkrow][checkcol] == 0)
		                     {
		                          Mat[r][c]=1;
		                     }
		                }
		            }
		        }
		    }
		}
		else if(r==0 & c==0){
		    int checkcol = c;
		    int checkrow = r;
		    checkcol++;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkrow++;
		        if(Mat[checkrow][checkcol] == 0)
		        {
		            checkcol--;
		            if(Mat[checkrow][checkcol] == 0)
		            {
		                Mat[r][c]=1;
		            }
		        }
		    }
		    
		}
		else if(c==3 & r!=0 & r!=3)
		{
		    int checkcol = c;
		    int checkrow = r;
		    checkcol--;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		         checkrow--;
		         if(Mat[checkrow][checkcol] == 0)
		         {
		             checkcol++;
		            if(Mat[checkrow][checkcol] == 0)
		            {
		               Mat[r][c]=1;
		            }
		         }
		    }
		    
		}
		else if(r==0 & c==3)
		{
		    int checkcol = c;
		    int checkrow = r;
		    checkcol--;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkrow++;
		         if(Mat[checkrow][checkcol] == 0)
		         {
		             checkcol++;
		             if(Mat[checkrow][checkcol] == 0)
		             {
		                 Mat[r][c]=1;
		             }
		         }
		    }
		}
		else if(r==3 & c==0)
		{
		    int checkcol = c;
		    int checkrow = r;
		    checkcol++;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkrow--;
		         if(Mat[checkrow][checkcol] == 0)
		         {
		             checkcol--;
		             if(Mat[checkrow][checkcol] == 0)
		             {
		                 Mat[r][c]=1;
		             }
		         }
		    }
		}
		else if(r==3 & c==3)
		{
		    int checkcol = c;
		    int checkrow = r;
		    checkcol--;
		    if(Mat[checkrow][checkcol] == 0)
		    {
		        checkrow--;
		        if(Mat[checkrow][checkcol] == 0)
		        {
		            checkcol--;
		            {
		                 if(Mat[checkrow][checkcol] == 0)
		                 {
		                     Mat[r][c]=1;
		                 }
		            }
		        }
		    }
		}
		else
		{
			countc++;
			column(r,c,countr,countc,Mat);
		}
		
	}
	public static void main(String[] args) {
		int r = 1;
		int c = 3;
		int countr=0;
		int countc=0;
		int Mat[][] = new int[4][4];
    	row(r,c,countr,countc,Mat);
		//print
		for(int i =0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		       System.out.print(Mat[i][j] + "  "); 
		    }
		    System.out.print("\n"); 
		}
		
		
	}
}
