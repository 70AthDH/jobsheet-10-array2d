public class cinema02 {
    public static void main (String[]args){
        String[][] audience = new String[4][2];
            audience[0][0] = "Amin";
            audience[0][1] = "ben";
            audience[1][0] = "sanba";
            audience[1][1] = "bella";
            audience[2][0] = "xavier";
            audience[2][1] = "farhan";
            audience[3][0] = "gary";
            audience[3][1] = "hanna";
        
        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

    }
}
