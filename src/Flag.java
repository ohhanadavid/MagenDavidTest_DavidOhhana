public abstract class Flag {

    
    public  char[][] emptyCharArrey(int height, int width) {
        char [] [] res = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j]=' ';
            }
        }

        return res;
    }
   
    public abstract  char[][] getFlag (int height,int width);


}
