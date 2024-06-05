public class Symbols implements Isymbol{

    public int upTriangle(char[][] flag,int size,int iStartDrawing,int jStartDrawing){
        int center=Math.ceilDiv(size, 2); 
        int j =0;
        int i = iStartDrawing;
        for ( ;i < iStartDrawing+(center); i++) {
            flag[i][jStartDrawing+j]=flag[i][jStartDrawing-j]='*';
            j++;
            
        }
        for (int k = jStartDrawing-j; k < jStartDrawing-j+size; k++) {
            flag[i][k]='*';
        }
            return i;
    }
    
    public int downTriangle(char[][] flag,int size,int iStartDrawing,int jStartDrawing){
        
        int center=Math.ceilDiv(size, 2); 
        int j =0;
        int i = iStartDrawing;
        int triangleSize=i-center;
        for ( ;i > triangleSize; i--) {
            flag[i][jStartDrawing+j]=flag[i][jStartDrawing-j]='*';
            j++;
        
        }
        for (int k = jStartDrawing-j; k < jStartDrawing-j+size; k++) {
            flag[i][k]='*';
        }
        return i;
    }
   
    public  int[] getMagenDavidSymbol(char[][] flag,int size,int iStartDrawing,int jStartDrawing){
        size+=size%2==0?1:0;        
        int baseUp=upTriangle(flag, size, iStartDrawing, jStartDrawing);
        int upLowerTriangle=(int)Math.round(size*0.1)+baseUp;
        int baseDown=downTriangle(flag, size, upLowerTriangle, jStartDrawing);
        int[] basesIndex= {baseUp,baseDown};
        return basesIndex;
    }  
    public void getZionetSymbol(char[][] symbol,int size,int up ,int down,int start){
       
        
        //Z
        int distance=Math.abs(down-up);
        for (int j = up,next=size+start; j <= down; j++,next--) {
           if(j==up||j==down){
            for (int k = size+start; k >=size- distance+start; k--) {
                symbol[j][k]='O';
                }
            }
            else{
                symbol[j][next]='O';
            }
            
        }
        //צ
        start-=size;
        for (int j = up,next=0; j <= down; j++,next++) {
            if(j==up){
                symbol[j][next+start]=symbol[j][distance+start]='O';
            }
            else if(j==down){
                for (int k = start;k<= distance+start; k++) {
                    symbol[j][k]='O';
                    }
            }
             else{
                 symbol[j][next+start]='O';
                 if(distance-next>distance/2)
                    symbol[j][distance-next+start]='O';
             }
             
         }
        
    }
   
    public  void getMagenDavidWithZionetSymbol(char[][] flag,int size,int iStartDrawing,int jStartDrawing){
           int[] bases= getMagenDavidSymbol(flag, size, iStartDrawing, jStartDrawing) ;
           size+=size%2==0?1:0;
           int center=Math.ceilDiv(size, 2); 
           getZionetSymbol(flag, center, bases[1], bases[0],jStartDrawing);
    }
   
}
