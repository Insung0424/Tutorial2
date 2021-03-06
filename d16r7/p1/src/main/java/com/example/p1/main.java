<<<<<<< HEAD
package com.example.p1;

import com.example.p1.Strategy.*;
import com.example.p1.adapter.Electronic110v;

public class main {

    public static void main(String[] args) {

        /*AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println(aClient.equals(bClient));*/
        //단 하나의 객체만 존재하고 그걸 공유해서 사용한다

        /*HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        Cleaner cleaner = new Cleaner();
//        connect(cleaner);
        Electronic110v adapter = new Socket(cleaner);
        connect(adapter);
        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airadapter = new Socket(airConditioner);
        connect(airadapter);*/
/*
        Browser browser = new Browser("www.naver.com");
        browser.show();//BrowserProxy loading html from :www.naver.com
        browser.show();//BrowserProxy loading html from :www.naver.com
        browser.show();//BrowserProxy loading html from :www.naver.com

        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show();//BrowserProxy loading html from :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com*/
/*
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aop = new AopBrowser("www.naver.com",
            () -> {
                System.out.println("before");
                start.set(System.currentTimeMillis());
            }, () -> {
                long now = System.currentTimeMillis();
                end.set(now - start.get());
            }
        );
        aop.show();
        System.out.println("loading time:" +end.get());
        //loading time:1512 (include sleep1500)
        aop.show();
        System.out.println("loading time:" +end.get());
        //loading time:0
        */
        /*
        ICar audi = new Audi(1000);
        audi.showPrice();
        //a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        //a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();

         */
        //관찰자패턴: 변화발생시 미리등록된 다른클래스에 통보해줌 ex)이벤트전달
        /*Button button = new Button("button");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("send Message: click1");
        button.click("send Message: click2");
        button.click("send Message: click3");
        button.click("send Message: click4");

         */
        //파사드 패턴 : 여러객체와 실제사용하는 객체사이가 복잡해지면 중간에 파사드라는 객체를 두고
        // 파사드에서 제공하는 기능을 사용하는 방식 파사드는 각클래스의 기능을 명확히 알아야한다
//        Ftp ftpClient = new Ftp("www.goo.co.kr",22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();
//
//        SftpClient sftpClient = new SftpClient("www.goo.co.kr",22,"/home/etc","text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disConnect();

        //전략 패턴
        //전략 메서드를 가진 전략 객체 와 이를 사용한 컨텍스트
        //전략객체를 생성해 컨텍스트에 주입하는 클라이언트
        Encoder encoder = new Encoder();
          //base64
        EncodingStrategy base64 = new Base64Strategy();//각각의 전략
        //normal
        EncodingStrategy normal = new NormalStrategy();//각각의 전략

        String message = "Hello java";
        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());//각각의 전략
        String appendresult = encoder.getMessage(message);
        System.out.println(appendresult);
    }











        //콘센트
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }
}
=======
package com.example.p1;

import com.example.p1.Strategy.*;
import com.example.p1.adapter.Electronic110v;

public class main {

    public static void main(String[] args) {

        /*AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println(aClient.equals(bClient));*/
        //단 하나의 객체만 존재하고 그걸 공유해서 사용한다

        /*HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        Cleaner cleaner = new Cleaner();
//        connect(cleaner);
        Electronic110v adapter = new Socket(cleaner);
        connect(adapter);
        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airadapter = new Socket(airConditioner);
        connect(airadapter);*/
/*
        Browser browser = new Browser("www.naver.com");
        browser.show();//BrowserProxy loading html from :www.naver.com
        browser.show();//BrowserProxy loading html from :www.naver.com
        browser.show();//BrowserProxy loading html from :www.naver.com

        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show();//BrowserProxy loading html from :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com
        browser1.show();//BrowserProxy use cache html :www.naver.com*/
/*
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aop = new AopBrowser("www.naver.com",
            () -> {
                System.out.println("before");
                start.set(System.currentTimeMillis());
            }, () -> {
                long now = System.currentTimeMillis();
                end.set(now - start.get());
            }
        );
        aop.show();
        System.out.println("loading time:" +end.get());
        //loading time:1512 (include sleep1500)
        aop.show();
        System.out.println("loading time:" +end.get());
        //loading time:0
        */
        /*
        ICar audi = new Audi(1000);
        audi.showPrice();
        //a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        //a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();

         */
        //관찰자패턴: 변화발생시 미리등록된 다른클래스에 통보해줌 ex)이벤트전달
        /*Button button = new Button("button");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("send Message: click1");
        button.click("send Message: click2");
        button.click("send Message: click3");
        button.click("send Message: click4");

         */
        //파사드 패턴 : 여러객체와 실제사용하는 객체사이가 복잡해지면 중간에 파사드라는 객체를 두고
        // 파사드에서 제공하는 기능을 사용하는 방식 파사드는 각클래스의 기능을 명확히 알아야한다
//        Ftp ftpClient = new Ftp("www.goo.co.kr",22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();
//
//        SftpClient sftpClient = new SftpClient("www.goo.co.kr",22,"/home/etc","text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disConnect();

        //전략 패턴
        //전략 메서드를 가진 전략 객체 와 이를 사용한 컨텍스트
        //전략객체를 생성해 컨텍스트에 주입하는 클라이언트
        Encoder encoder = new Encoder();
          //base64
        EncodingStrategy base64 = new Base64Strategy();//각각의 전략
        //normal
        EncodingStrategy normal = new NormalStrategy();//각각의 전략

        String message = "Hello java";
        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());//각각의 전략
        String appendresult = encoder.getMessage(message);
        System.out.println(appendresult);
    }











        //콘센트
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
