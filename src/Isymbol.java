public interface Isymbol {
    
    public void getZionetSymbol(char[][] symbol,int size,int up ,int down,int start);
   
    public  int[] getMagenDavidSymbol(char[][] flag,int size,int istart,int jstart) ;
    
    public int upTriangle(char[][] flag,int size,int iStartDrawing,int jStartDrawing);
    
    public int downTriangle(char[][] flag,int size,int iStartDrawing,int jStartDrawing);
    
    public  void getMagenDavidWithZionetSymbol(char[][] flag,int size,int iStartDrawing,int jStartDrawing);

}
