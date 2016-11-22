import java.util.*;

public class Main2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] SText = text.split(" ");
        StringBuffer result = new StringBuffer();
        String ch = scanner.next();
        int k = scanner.nextInt() - 1;
        for (int i = 0; i < SText.length; i++) {
            if (i == SText[i].length() - 1) {
                if (k < SText[i].length()) {
                    result.append(SText[i].substring(0, k) + ch + SText[i].substring(k + 1));
                } else result.append(SText[i]);
            } else {
                if (k < SText[i].length()) {
                    result.append(SText[i].substring(0, k) + ch + SText[i].substring(k + 1) + ' ');
                } else result.append(SText[i] + ' ');
            }
        }
        System.out.println(result);

    }
}
