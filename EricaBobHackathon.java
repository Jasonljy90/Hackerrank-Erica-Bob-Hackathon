package org.example;

public class EricaBob {
    public static void main(String[] args) {
        int er = 0;
        int b = 0;
        String erica = "EM";
        String bob = "EM";

        String ericaUpper = erica.toUpperCase();
        String bobUpper = bob.toUpperCase();

        for (int i = 0; i < erica.length(); i++){
            char c = ericaUpper.charAt(i);
            if (c=='E'){
                er++;
            }
            if (c=='M'){
                er+=3;
            }
            if (c=='H'){
                er+=5;
            }
        }

        for (int i = 0; i < bob.length(); i++){
            char d = bobUpper.charAt(i);
            if (d=='E'){
                b++;
            }
            if (d=='M'){
                b+=3;
            }
            if (d=='H'){
                b+=5;
            }
        }

        if(er > b) {
            System.out.println("Erica");
        } else if(er < b) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }
}