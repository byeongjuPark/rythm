package memo.awt;

import java.awt.*;
import java.awt.event.*;

// implements를 이용한 이벤트 핸들링
public class AEvent extends Frame implements ActionListener {
    TextField tf;

    AEvent() {
        // 컴포넌트 생성
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        // 리스너 등록
        b.addActionListener(this); // 현재 인스턴스 통과

        // 프레임에 컴포넌트 추가 및 설정
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new AEvent();
    }

}
