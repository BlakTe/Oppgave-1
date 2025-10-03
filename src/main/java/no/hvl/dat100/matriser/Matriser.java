package no.hvl.dat100.matriser;

public class Matriser {

	// a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


	// b)
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        for (int[] rad : matrise) {
            for (int element : rad) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


	// c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] resultat = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = matrise[i][j] * tall;
            }
        }
        return resultat;
    }


	// d)
    public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

	
	// e)
    public static int[][] speile(int[][] matrise) {
        int rader = matrise.length;
        int kolonner = matrise[0].length;
        int[][] resultat = new int[kolonner][rader]; // transpose krever bytte på dimensjoner

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                resultat[j][i] = matrise[i][j]; // bytt rad og kolonne
            }
        }
        return resultat;
    }




    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int rader = a.length;
        int kolonner = b[0].length;
        int felles = a[0].length;

        int[][] resultat = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                int sum = 0;
                for (int k = 0; k < felles; k++) {
                    sum += a[i][k] * b[k][j];
                }
                resultat[i][j] = sum;
            }
        }
        return resultat;
    }

}
