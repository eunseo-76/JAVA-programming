package com.kenny.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    // super()
    // Product의 생성자를 private로 했기 때문에 자식인 Computer에서 code 등에 직접 접근 x
    // 이를 다루기 위해 생성자로 전달해주거나, getter-setter를 써야 자식인 Computer에서 부모 객체를 control 가능


    // 기본 생성자 호출
    // 부모에 대한 버전 따로 초기화 하지 x
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    // 매개 변수 생성자 호출
    // 모든 요소를 넘겨받아 부모 생성자 쪽으로 초기화 요청하고, 자기 자신에 대한 부분도 초기화 함
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate); // 부모 생성자 호출하는 코드는 항상 가장 위에

        /* 위에 작성된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같기 때문에 허용되지 않는다. */
//        this(cpu, hdd, ram, operationSystem);   // 생성자를 호출하는데 외부 생성자를 또 호출(this)는 안 됨
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Product 클래스와 Computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    /* 부모 필드에 직접 접근은 불가하지만 getter, setter 메소드는 자신의 것처럼 사용 가능하므로
    * 자식 클래스에서 추가된 필드에 대해서만 getter, setter를 작성한다. */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        // code는 직접 접근이 안 되므로 getCode()사용.
        // this.getCode()에서 this가 생략되어있다고 보면 됨.
        // this나 super나 상관없지만 여기서는 부모의 것을 가져온다는 의미에서 super 사용
        /* 부모 클래스의 private 멤버에는 직접 접근이 불가하므로 getter 메소드로 접근한다.
        * super., this. 모두 사용 가능하며 생략하면 this.의 의미이다.
        * 다만 코드의 의미를 명확히 하기 위해 super.를 명시하였다.*/
        /*
        return super.getCode() + " " + super.getBrand() + " " + super.getName() + " "
                + super.getPrice() + " " + super.getManufacturingDate()
                + this.cpu + " " + this.hdd + " " + this.ram + " " + this.operationSystem;
        */
        // 내 거는 직접 접근 가능하므로 this로 처리

        /* Product 클래스의 getInformation 메소드에서 이미 작성해둔 내용이 있으므로 해당 메소드를 활용해본다. */
        /* super.getInformation() : 정상적으로 부모의 메소드 호출
        * this.getInformation() or getInformation() : 재귀 호출이 일어나서 StackOverFlowError 발생 */
        return super.getInformation() + " " + this.cpu + " " + this.hdd + " " + this.ram + " " + this.operationSystem;
        // return getInformation() ~ 이렇게 하면 StackOverflowError 발생
        // 메소드 호출 시 stack 영역에 쌓아나가는 것. 호출되거나 종료되면 return 됨.
        // 그러나 stack도 제한이 있음. 메소드가 무한으로 호출되어 stack 메모리 영역이 넘쳤다는 의미.
        // this.getInformation() 에서 this.가 생략된 형태라 자기 자신을 계속 호출한다는 것.

    }

    // Computer c = new Computer();
    // stack c []  ------> heap [code][brand]...[cpu][hdd]...     ]
    // 여기서 부모의 것만 code, brand... 를 호출하든
    // stack c []  ------> heap ""[code][brand]""...[cpu][hdd]...     ]
    // 자기 자신 전체를 호출하든 상관이 없다
    // stack c []  ------> heap ""[code][brand]...[cpu][hdd]...""     ]
    // 아무것도 안 쓰면 this. (자기 자신 전체 호출) 를 생략한 것으로 취급한다
}
