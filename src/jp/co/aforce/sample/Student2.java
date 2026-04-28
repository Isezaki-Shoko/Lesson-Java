package jp.co.aforce.sample;

public class Student2 {
    static String schoolName = "遠江総合高等学校";
    String name;

    // コンストラクタ
    Student2(String name) {
        this.name = name;
    }

    // 表示メソッド
    void showInfo() {
        System.out.println("名前: " + name);
        System.out.println("学校名: " + schoolName);
    }

    // mainはここに書く！
    public static void main(String[] args) {
        Student2 s1 = new Student2("太郎");
        Student2 s2 = new Student2("花子");

        s1.showInfo();
        s2.showInfo();
    }
}