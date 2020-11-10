package DP07ProxyPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.dispay();

        System.out.println("");

        // 图像不需要从磁盘加载
        image.dispay();

        // 原本可以直接调用； 上面加了一层代理；
        Image image2 = new RealImage("test_10mb.jpg");
        image2.dispay();
    }
}
