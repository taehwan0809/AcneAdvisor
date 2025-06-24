package acneadvisor;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    private List<String> tips;
    private User user;
    private AcneStatus status;

    public Recommendation(User user, AcneStatus status){
        this.user = user;
        this.status = status;
        this.tips = new ArrayList<>();
        generateTips();
    }

    private void generateTips(){
        List<String> skinTypes = user.getSkinTypes();
        String area = status.getArea();
        String severity = status.getSeverity();
        boolean redness = status.isRedness();


        for (String skinType : skinTypes) {
            switch (skinType) {
                case "건성":
                    tips.add("건성 피부는 수분 유지가 핵심입니다. 히알루론산, 세라마이드 성분의 보습제를 사용해보세요.");
                    tips.add("추천 제품: '라로슈포제 시카플라스트 밤', '아비브 약산성 젤 클렌저'");
                    break;
                case "지성":
                    tips.add("지성 피부는 과다 피지 제거와 모공 청결이 중요해요. 살리실산, 티트리 성분의 제품을 추천합니다.");
                    tips.add("추천 제품: '바이오더마 세비엄 클렌징폼', '이솝 티트리 토너'");
                    break;
                case "복합성":
                    tips.add("복합성 피부는 T존과 U존 관리가 달라야 합니다. 부위별로 제품을 다르게 써보세요.");
                    tips.add("추천 제품: '프리메라 알파인베리 수분크림', '이니스프리 블루베리 리밸런싱'");
                    break;
                case "수부지":
                    tips.add("수분 부족형 지성 피부는 겉은 기름져도 속은 건조합니다. 수분 보충과 유분 밸런스 조절이 필요해요.");
                    tips.add("추천 제품: '라운드랩 독도 토너', '이즈앤트리 히아루론산 수분 크림'");
                    break;
                default:
                    tips.add("피부 타입 정보를 확인할 수 없습니다. 피부과 전문의의 상담을 권장합니다.");
                    break;
            }
        }


        if (area != null) {
            switch (area) {
                case "이마":
                    tips.add("이마 여드름은 잦은 앞머리 접촉이나 스트레스와 관련이 있을 수 있어요.");
                    break;
                case "턱":
                    tips.add("턱 여드름은 호르몬 변화와 관련이 깊습니다. 식습관도 함께 관리하세요.");
                    break;
                case "볼":
                    tips.add("볼 여드름은 베개 커버, 스마트폰 화면 등 위생 관리가 중요합니다.");
                    break;
                default:
                    tips.add("이마, 턱, 볼 중에서 입력해 주세요.");
            }
        }


        if (severity != null) {
            switch (severity) {
                case "약함":
                    tips.add("초기 단계입니다. 클렌징과 수분 공급에 신경 써주세요.");
                    break;
                case "중간":
                    tips.add("염증이 진행 중입니다. 자극적인 화장품은 피하고 진정 제품을 사용하세요.");
                    break;
                case "심함":
                    tips.add("전문적인 치료가 필요할 수 있습니다. 피부과 방문을 권장합니다.");
                    break;
                default:
                    tips.add("여드름 심각도를 정확히 입력해주세요.");
            }
        }

        if (redness) {
            tips.add("붉은기가 있다면 진정 성분이 포함된 제품(예: 알로에, 병풀)을 사용해보세요.");
        }
    }

    public List<String> getTips() {
        return tips;
    }
}
