public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;
	private int getColumn(int cellId) {
		if(cellId<8) {
			return 0;}
		if(cellId>=8&&cellId<16) {
			return 1;}
		if(cellId>=16&&cellId<24) {
			return 2;}
		if(cellId>=24&&cellId<32) {
			return 3;}
		if(cellId>=32&&cellId<40) {
			return 4;}
		if(cellId>=40&&cellId<48) {
			return 5;}
		if(cellId>=48&&cellId<56) {
			return 6;}
		if(cellId>=56&&cellId<64) {
			return 7;}
		
	return 0;// just for the heck of it
	
	}
	private int getRow(int cellId) {
		if(cellId<8) {
			return 0;
		}
		if(cellId>=8&&cellId<16) {
			return 1;}
		if(cellId>=16&&cellId<24) {
			return 2;}
		if(cellId>=24&&cellId<32) {
			return 3;}
		if(cellId>=32&&cellId<40) {
			return 4;}
		if(cellId>=40&&cellId<48) {
			return 5;}
		if(cellId>=48&&cellId<56) {
			return 6;}
		if(cellId>=56&&cellId<64) {
			return 7;}
		return 0;// just for the heck of it
		
		}
	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		int i, j; 
		int q[]=new int[8];
		 
        
		for (i = 0; i < row; i++) {
            if (q[i] == q[row])             return false;   // same column
            if ((q[i] - q[row]) == (row- i)) return false;   // same major diagonal
            if ((q[row] - q[i]) == (row - i)) return false;   // same minor diagonal
        }
		
        
   		return isValid;
	}
	public void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isValidPosition(k)) enumerate(q, k+1);
            }
        }
    }  
	public void enumerate() {
        int[] a = new int[8];
        enumerate(a, 0);
    }
	public static int printQueens(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == j) return 1;
                else           return 0;}
            }  
        return 1;
        }


}














