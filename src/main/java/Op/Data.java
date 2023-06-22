package Op;

public class Data {
    public static void main(String[] args) {
        String str= "mahesh";

        int i =0;
        for (Character c: str.toCharArray()){
            System.out.println(c);
            i++;
        }
        System.out.println("length"+ i);
    }
}
