package ch13;
public class A02 {
    public static void main(String[] args) {
        ThreadGoodMorning threadGoodMorning = new ThreadGoodMorning();
        try{
        threadGoodMorning.sleep(300);
        }
        catch(Exception e){
            System.out.println("error due to "+e);
        }
        ThreadWelcome threadWelcome = new ThreadWelcome();
        threadGoodMorning.start();
        threadWelcome.start();
    }
}
