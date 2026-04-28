package jp.co.aforce.sample;

public class Practice36 {

    // 親クラス
    static class Animal {
        String name;

        void eat() {
            System.out.println(name + "はご飯を食べる");
        }
    }

    // 子クラス
    static class Dog extends Animal {
        void bark() {
            System.out.println(name + "はワンワン吠える");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Dog(); // アップキャスト
        animal.name = "ポチ";

        animal.eat();

        Dog dog = (Dog) animal;    // ダウンキャスト
        dog.bark();
    }
}