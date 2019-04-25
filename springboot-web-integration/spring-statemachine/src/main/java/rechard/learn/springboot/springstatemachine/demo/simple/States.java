package rechard.learn.springboot.springstatemachine.demo.simple;

public enum States {
    UNPAID,                 // 待支付
    WAITING_FOR_RECEIVE,    // 待收货
    DONE
}
