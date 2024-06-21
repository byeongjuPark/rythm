package memo.awt;

import java.awt.*;

public class AWTExample2 {
    AWTExample2() {
        // 프레임 생성
        Frame f = new Frame();
        // 라벨 생성
        Label l = new Label("사원 ID:");
        // 버튼 생성
        Button b = new Button("Submit");
        // TextFeild 생성
        TextField t = new TextField();

        // 프레임 안에 컨포넌트들의 위치 설정
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);

        // 프레임에 컴포넌트 삽입
        f.add(b);
        f.add(l);
        f.add(t);

        // 프레임 사이즈 설정
        f.setSize(400, 300);
        // 프레임 타이틀 절정
        f.setTitle("사원 정보");

        // 레이아웃 매니저 없음
        f.setLayout(null);
        // 프레임 가시성 설정
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AWTExample2 awt_obj = new AWTExample2();
    }
}
