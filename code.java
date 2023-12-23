import java.util.Scanner;

public class HeroLevelClassifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do herói: ");
        String name = scanner.nextLine();

        System.out.println("Digite a quantidade de experiência (XP) do herói: ");
        int xp = scanner.nextInt();

        String level;

        if (xp < 1000) {
            level = "Ferro";
        } else if (xp >= 1000 && xp <= 2000) {
            level = "Bronze";
        } else if (xp > 2000 && xp <= 5000) {
            level = "Prata";
        } else if (xp > 5000 && xp <= 7000) {
            level = "Ouro";
        } else if (xp > 7000 && xp <= 8000) {
            level = "Platina";
        } else if (xp > 8000 && xp <= 9000) {
            level = "Ascendente";
        } else if (xp > 9000 && xp <= 10000) {
            level = "Imortal";
        } else {
            level = "Radiante";
        }

        System.out.println("O Herói de nome " + name + " está no nível de " + level);
    }
}