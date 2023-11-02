package methord;

public class practice {

  double getAverageScore(int scores[]) {
    double total = 0;

    for (int i = 0; i < scores.length; ++i) {
      total = total + scores[i];
    }
    return total / scores.length;

  }

  char computerGrade(double avg) {

    if (avg >= 80) {
      return 'A';
    } else if (avg >= 60) {
      return 'B';
    } else if (avg >= 50) {
      return 'C';
    } else {
      return 'D';
    }
  }

  public static void main(String[] args) {
    int[] scores = { 55, 64, 75, 80, 65 };

    practice obj = new practice();

    double avg = obj.getAverageScore(scores);
    System.out.println(avg);

    char grade = obj.computerGrade(avg);
    System.out.println(grade);

  }
}
