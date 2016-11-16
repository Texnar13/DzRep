import java.util.Scanner;


public class Main2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] SText = text.split("");
        for (int i = 0; i < SText.length; i++) {
            switch (SText[i]) {
                case "а":
                    System.out.print(1);
                    break;
                case "б":
                    System.out.print(2);
                    break;
                case "в":
                    System.out.print(3);
                    break;
                case "г":
                    System.out.print(4);
                    break;
                case "д":
                    System.out.print(5);
                    break;
                case "е":
                    System.out.print(6);
                    break;
                case "ё":
                    System.out.print(7);
                    break;
                case "ж":
                    System.out.print(8);
                    break;
                case "з":
                    System.out.print(9);
                    break;
                case "и":
                    System.out.print(10);
                    break;
                case "й":
                    System.out.print(11);
                    break;
                case "к":
                    System.out.print(12);
                    break;
                case "л":
                    System.out.print(13);
                    break;
                case "м":
                    System.out.print(14);
                    break;
                case "н":
                    System.out.print(15);
                    break;
                case "о":
                    System.out.print(16);
                    break;
                case "п":
                    System.out.print(17);
                    break;
                case "р":
                    System.out.print(18);
                    break;
                case "с":
                    System.out.print(19);
                    break;
                case "т":
                    System.out.print(20);
                    break;
                case "у":
                    System.out.print(21);
                    break;
                case "ф":
                    System.out.print(22);
                    break;
                case "х":
                    System.out.print(23);
                    break;
                case "ц":
                    System.out.print(24);
                    break;
                case "ч":
                    System.out.print(25);
                    break;
                case "ш":
                    System.out.print(26);
                    break;
                case "щ":
                    System.out.print(27);
                    break;
                case "ъ":
                    System.out.print(28);
                    break;
                case "ы":
                    System.out.print(29);
                    break;
                case "ь":
                    System.out.print(30);
                    break;
                case "э":
                    System.out.print(31);
                    break;
                case "ю":
                    System.out.print(32);
                    break;
                case "я":
                    System.out.print(33);
                    break;
                default:
                    System.out.print(SText[i]);
                    break;
            }
        }
    }
}
