package Interface_Test;

public class Demo_Coach_Player {
    public static void main(String[] args) {
        Basketball_Coach b_coach = new Basketball_Coach("小明", 30);
        Pingpong_Coach p_coach = new Pingpong_Coach("小刚", 35);

        Basketball_Player b_player = new Basketball_Player("小刘", 19);
        Pingpong_Player p_player = new Pingpong_Player("小小刘", 20);

        b_coach.eat();
        System.out.println(b_coach.getName() + b_coach.getAge());
        b_coach.teach();

        p_coach.eat();
        System.out.println(p_coach.getName() + p_coach.getAge());
        p_coach.teach();

        b_player.eat();
        System.out.println(b_player.getName() + b_player.getAge());
        b_player.learn();
        b_player.English();

        p_player.eat();
        System.out.println(p_player.getName() + p_player.getAge());
        p_player.learn();
        p_player.English();
    }
}
