package HomeWork_1;

public class Main {
    public static void main(String[] args) {
        JumpAndRun[] members = {
                new Human(2, 2, "Андрей"),
                new Human(1, 2, "Александр"),
                new Cat(3, 4, "Пятнышко"),
                new Cat(1, 1, "Тень"),
                new Robot(0, 10, "R2-D2"),
                new Robot(4,7,"C-3PO")
        };

        Obstaclable[] obstacles = {
                new RunningTrack(2),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpAndRun member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " не смог пройти дистанцию.");
            }
            System.out.println();
        }
    }
}
