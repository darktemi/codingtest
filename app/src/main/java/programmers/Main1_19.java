package programmers;

class Main1_19 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int[] solution(String[] strlist) {
    int[] answer = new int[strlist.length];

    for(int i = 0; i < strlist.length; i++) {
      answer[i] = strlist[i].length();
    }
    return answer;
  }
}