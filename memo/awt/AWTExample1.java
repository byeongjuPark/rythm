package memo.awt;

import java.awt.*;

public class AWTExample1 extends Frame{
    
    AWTExample1(){
        // 버튼 생성
        Button b = new Button("Click Me!!");
        // 버튼 위치 설정
        b.setBounds(30,100,80,30);
        // 프레임에 버튼 추가
        add(b);

        // 프레임 사이즈 설정
        setSize(300, 300);
        // 프레임 타이틀 설정
        setTitle("AWT 기초 예제");
        // 레이아웃 관리자 없음
        setLayout(null);
        // 가시성 설정(기본 false이기때문에 true해주기 전까지 보이지 않음)
        setVisible(true);
    }

    public static void main(String[] args) {
        AWTExample1 f = new AWTExample1();
    }
}
