package memo.awt;

import java.awt.*;
import java.awt.event.*;

// 외부 클래스로 이벤트 핸들링 구현
public class AEvent2 extends Frame {
    TextField tf;

    AEvent2() {
        // 컴포넌트 생성
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        // 리스너 등록
        Outer o = new Outer(this);
        b.addActionListener(o);

        // 프레임에 컴포넌트 추가 및 설정
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AEvent2();
    }

}
