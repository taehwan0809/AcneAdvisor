package acneadvisor;

import java.util.ArrayList;

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
        List<String> skinType = user.getSkinType();
        String area = status.getArea();
        String severity = status.getSeverity();
        boolean redness = status.isRedness();

        for(String skinType:skinTypes){
            swich(skinType()){
                case "건성":
                    tips.add("건성 피부는 수분 유지가 핵심입니다. 히알루론산, 세라마이드 성분의 보습제를 사용해보세요.");
                    tips.add("추천 제품: '라로슈포제 시카플라스트 밤', '아비브 약산성 젤 클렌저'");
                    break;
                case "지성":
                    tips.add("지성 피부는 과다 피지 제거와 모공 청결이 중요해요. 살리실산, 티트리 성분의 제품을 추천합니다.");
                    tips.add("추천 제품: '바이오더마 세비엄 클렌징폼', '이솝 티트리 토너'");
                    break;
                
                
            }
        }




    }



}
