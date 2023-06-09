import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась. Отважный рыцарь попал в лес.");

        int heroHp = 10;
        int heroAtt = 4;
        int heroDef = 1;
        System.out.println("Рыцарь: hp - " + heroHp + ", attack - " + heroAtt + ", defense - " + heroDef);

        int monsterHp = 6;
        int monsterAtt = 2;
        System.out.println("Монстр: hp - " + monsterHp + ", attack - " + monsterAtt);

        while (true) {
            System.out.println("Ход рыцаря. Выберите: 1 - атаковать, 2 - отдохнуть");
            int heroAction = scanner.nextInt();

            if (heroAction == 1) {
                System.out.println("Рыцарь атаковал монстра");
                monsterHp -= heroAtt;
                System.out.println("Монстр: hp - " + monsterHp + ", attack - " + monsterAtt);

                if (monsterHp <= 0) {
                    System.out.println("Монстр повержен, рыцарь победил!");
                    break;
                }
            } else if (heroAction == 2) {
                System.out.println("Рыцарь лечится");
                heroHp += 2;
            } else {
                System.out.println("Рыцарь пропустил свой ход");
            }

            System.out.println("Ход монстра");
            System.out.println("Монстр атаковал рыцаря");
            int actualAttAmount = monsterAtt - heroDef;

            if (actualAttAmount < 1) {
                actualAttAmount = 1;
            }

            heroHp -= actualAttAmount;
            System.out.println("Рыцарь: hp - " + heroHp + ", attack - " + heroAtt + ", defense - " + heroDef);

            if (heroHp <= 0) {
                System.out.println("Рыцарь повержен, монстр победил!");
                break;
            }
        }

        System.out.println("Игра завершена.");
    }
}