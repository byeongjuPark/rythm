※※ AWT 기초
AWT - API to develop Graphical User Interface

AWT는 TextField, Label, TextArea, RadioButton, CheckBox, Choice, List 등을 제공한다.
AWT는 운영체제에 따라 다르게 보일 수 있다.
 - Windows에서는 Windows 프로그램처럼, Mac에서는 Mac 프로그램처럼 UI가 맞추어 구성된다.

Component
버튼, 텍스트, 스크롤바, 등의 모든 요소 등을 말한다.
화면에 요소들을 추가할려면 컴포넌트를 추가해야한다.
Container
버튼, 텍스트 등의 다른 컴포넌트를 포함할 수 있는 컴포넌트를 말한다.
Frame, Dialog, Panel 등이 있다.

컨테이너에는 4가지 종류가 있다.
1. Windows
 테두리와 메뉴바가 없다. 윈도우를 만들때는 Frame, Dialog 또는 다른 창을 사용해야한다.

2. Panel
 title bar, border 또는 menu bar를 포함하지 않는 컨테이너.
 컨포넌트들을 다루기 위한 일반적인 컨테이너
3. Frame
 title bar, border 또는 menu bar를 포함하는 컨테이너.
 AWT 어플리케이션 개발에서 가장 넓게 사용되는 컨테이너. 
4. Dialog

컴포넌트 클래스의 유용한 메소드
public void add(Components c)
    이 컴포넌트에 c 컴포넌트를 추가.
public void setSize(int width, int height)
    컴포넌트의 크기를 설정
public void setLayout(LayoutManager m)
    컴포넌트의 레이아웃 관리자를 정의
public void setVisible(boolean status)
    컴포넌트의 가시성을 변경 (기본이 false)


※※ 이벤트 핸들링
java.awt.event 패키지에서 이벤트 핸들링을 위한 여러 Event 클래스들과 리스너 인터페이스를 제공한다.

Button
    public void addActionListener(ActionListener a){}
MenuItem
    public void addActionListener(ActionListener a){}
TextField
    public void addActionListener(ActionListener a){}
    public void addTextListener(TextListener a){}
TextArea
    public void addTextListener(TextListener a){}
Checkbox
    public void addItemListener(ItemListener a){}
Choice
        public void addItemListener(ItemListener a){}
List
    public void addActionListener(ActionListener a){}
    public void addItemListener(ItemListener a){}

