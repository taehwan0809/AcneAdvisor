package acneadvisor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("사용자의 이름을 입력하세요:");
        String name = sc.nextLine();

        List<String> skinTypes = new ArrayList<>();
        System.out.println("피부 타입을 선택하세요 (건성 / 지성 / 복합성 / 수부지) - 여러 개 입력 가능, 종료하려면 '끝' 입력:");
        while (true) {
            String type = sc.nextLine().trim();
            if (type.equals("끝")) break;
            skinTypes.add(type);
        }

        System.out.println("여드름 부위를 입력하세요 (이마 / 턱 / 볼):");
        String area = sc.nextLine().trim();

        System.out.println("여드름 심각도를 입력하세요 (약함 / 중간 / 심함):");
        String severity = sc.nextLine().trim();

        System.out.println("붉은기가 있나요? (예 / 아니요):");
        boolean redness = Boolean.parseBoolean(sc.nextLine().trim());

        User user = new User(name, skinTypes);
        AcneStatus status = new AcneStatus(area, severity, redness);

        Advisor advisor = new Advisor();
        advisor.giveAdvice(user, status);
    }
}
