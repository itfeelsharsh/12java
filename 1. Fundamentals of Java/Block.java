class Block{
    public static void main(String[] args){

        int x= 10;

        block1:{
            int y=50;
            System.out.println("");
            System.out.println("----------FROM BLOCK 1----------");
            System.out.println("here X is: " + x);
            System.out.println("here Y is: " + y);
            System.out.println("");
        }
        block2:{
            int y=69;
            System.out.println("");
            System.out.println("---------FROM BLOCK 2----------");
            System.out.println("here X is: " + x);
            System.out.println("here Y is: " + y);
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("---------OUTSIDE BLOCK----------");
        System.out.println("here X is:" + x);
        System.out.println("");

    }
}