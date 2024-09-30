package static2;

import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        //인스턴스를 통한 접근은 추천하지 않는다. 코드를 읽을 때 인스턴스 메서드에 접근하는 것 처럼 오해할 수 있기 때문
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        //따라서 정적 메서드에 접근할 때는 클래스를 통해서 접근하자!
        staticCall();

        //import static
        //특정 클래스의 정적 메서드를 여러개 사용할 때 적용
        staticCall();       //DecoData.staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
    }
}
