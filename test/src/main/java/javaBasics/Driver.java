package javaBasics;

public class Driver {

    private static int test(){
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("in catch");
            return 1;
        }finally {
            return 2;
        }
    }
    public static void main(String[] args) {
//        System.out.println(test());

//        test2();
        test3();
//
    }

    private static void test2(){
        try {
            badMethod();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    private static void badMethod() throws Exception {
        throw new Error();
//        throw new Exception();

    }

    private static void test3() {
        int x=0;
        int y=0;
        for (int z=0;z<5;z++){
            if((++x>2) || (++y>2)){
                x++;
            }
        }
        System.out.println(x+" "+y);
    }
}
