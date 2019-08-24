class Staircase{
	public static void main(String[] args) {
		int n = 6;
		for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++){
            	System.out.print(" ");
            }
            for(int j = n; j >= n-i; j--) {
            	System.out.print("#");
            }
            System.out.println();
        }
        
        System.out.println("Hi");
	}
}







