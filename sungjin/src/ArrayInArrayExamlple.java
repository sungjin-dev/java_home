public class ArrayInArrayExamlple {
    public static void main(String[] args) {
        
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++) {
                System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
            }
            
        }

        System.out.println();

        int [][] enlgishScores = new int[3][];
        enlgishScores[0] = new int[2];
        enlgishScores[1] = new int[3];
        enlgishScores[2] = new int[3];
        
        for(int i=0; i<enlgishScores.length; i++) {
            for(int k=0; k<enlgishScores[i].length; k++) {
                System.out.println("enlgishScores["+i+"]["+k+"]=" + enlgishScores[i][k]);
            }

        }
        System.out.println();
        
        int[][] javaScores = {{95,80},{92,96,80}};

        for(int i=0; i<javaScores.length; i++) {
            for(int k=0; k<javaScores[i].length; k++) {
                System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
            }
         
        }
    }
}