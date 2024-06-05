public class IsraelFalg extends Flag{

   
    
    Isymbol symbol=new Symbols();
    public  char[][] getFlag (int height,int width){
        char[][] flag=super.emptyCharArrey(height,width);
        
        int horizontal= height/10>1?height/10:1;
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < width; j++) {
                flag[i][j]=flag[height-1-i][j]='*';
            }
        }
        int magenDavidSize=height>width?width/4:height/4;
        int leftArea=height-2*horizontal;
        int start=horizontal+(leftArea-(magenDavidSize/2+magenDavidSize/2))/2;
        int flagCenter=(Math.ceilDiv(width, 2)-1);
        symbol.getMagenDavidWithZionetSymbol(flag,magenDavidSize,start,flagCenter);
        return flag;
    }
  
   
    

}
