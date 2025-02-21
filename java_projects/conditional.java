public class conditional {
    public static void main(String[] args){
        int x=5, y = 4;
        if(x > y){
            System.out.println(x + " > " + y);
        }
        else if(x < y){
            System.out.println(x + " < " + y);
        }
        else if(x == y){
            System.out.println(x + "==" + y);
        }
        System.out.println("Good");

        if(x > y){
            System.out.println(x + " > " + y);
        }
        else if(x < y){
            System.out.println(x + " < " + y);
        }
        else{
            System.out.println(x + " == " + y);
        }
        System.out.println("Better");
    }
}
