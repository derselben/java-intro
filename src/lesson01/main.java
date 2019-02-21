package lesson01;

    public class main{

        public static void main(String[] args){
            HelloWorld helloWorld = new HelloWorld();
            Integer x = 5; // упаковка int в целочисленный объект (Integer)
            x =  x + 10;   // распаковка Integer в int
            System.out.println(x.toString());
        }
    }