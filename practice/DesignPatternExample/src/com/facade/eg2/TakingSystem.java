package com.facade.eg2;

public class TakingSystem {
    private SelectFoodService selectFoodService;
    private PayService payService;
    private OrderService orderService;
    public TakingSystem(){
        selectFoodService=new SelectFoodService();
        payService= new PayService();
        orderService= new OrderService();
    }

    public void orderTracking(Food food){
        selectFoodService.select(food.getName());
       boolean flag= payService.checkBalance();
        if(flag){
            payService.pay();
            orderService.makeOrder();
        }
    }


}
