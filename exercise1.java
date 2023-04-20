package exercise;

public class exercise1 {
    
    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String[] args) throws Exception{

        assert iWillBehave == true : "Shhh ka lang";
        
        College();

        assert iWillGraduate == true : "tamad ka kase";

    }

    static void College(){
        iWillGraduate = false;
        System.out.println("Good job!");
    }
}