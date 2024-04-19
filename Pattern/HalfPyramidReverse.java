class HalfPyramidReverse {
    public static void main(String[] args) {
        int col = 4;
        for(int i = col; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
