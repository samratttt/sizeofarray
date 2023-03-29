public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int locate = 0;
        int just = 0;
        try{
            int[] table = {1,2,3,4};
            for (int i=0; i<=2147483647; i++){
                locate = i;
                just = table[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("size of the array is ");
            System.out.print(locate-1);
        }
    }
}