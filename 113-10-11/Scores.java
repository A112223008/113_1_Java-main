public class Scores {
    public static void main(String[] args) {
        int[] scores = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};

        for(int i = 0; i<scores.length; i++){//�}�C����(Array Traversal)
            scores[i] += 5;
        }
        
        for(var i = 0; i < scores.length; i++) {//�}�C����(Array Traversal)
            System.out.printf("�ǥͤ��ơG%d %n", scores[i]);
        }
    }
}
