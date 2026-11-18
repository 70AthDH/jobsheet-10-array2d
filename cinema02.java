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

        // added
        System.out.println(audience.length);
        // modify
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " +
            audience[i].length);
        }
        // added
        for (String[] rowAudience : audience) {
            System.out.println("Row length: " + rowAudience.length);
        }
        System.out.println("Audience in row 3: ");
        for (int i = 0; i < audience[2].length; i++) {
            System.out.println(audience[2][i]);
        }

    }
}
