package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int vegPizzaBase=300;
    private int nonVegPizzaBase=400;
    private String bill;
    private boolean isTakeway;
    private int paperbag=20;
    private Boolean isExtraCheese;
    private Boolean isExtratopp;
    private int baseprice;
   private  int cheese=80;
   private int Vegtopp=70;
   private int Nontopp=120;
   private int topp;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        baseprice=getbasedPrize();
        price=baseprice;
        isExtraCheese=false;
        isExtratopp=false;
        isTakeway=false;
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            isExtraCheese=true;
            price+=cheese;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtratopp){
            this.isExtratopp=true;
            if(isVeg){
                topp=Vegtopp;
                price+=Vegtopp;
            }else{
                topp=Nontopp;
                price+=Nontopp;
            }
        }
    }
    private int getbasedPrize(){
        return isVeg?vegPizzaBase:nonVegPizzaBase;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeway){
            isTakeway=true;
            price+=paperbag;
        }


    }

    public String getBill(){
        // your code goes here

        String var="";
        var+="Base Price Of The Pizza: "+ baseprice + "\n";
        if(isExtraCheese){
            var+="Extra Cheese Added: "+ cheese+ "\n";
        }
        if(isExtratopp){
            var+="Extra Toppings Added: "+ topp+ "\n";
        }
        if(isTakeway){
            var+="Paperbag Added: "+ paperbag+ "\n";
        }
        var+="Total Price: "+ price + "\n";
        this.bill=var;
        return this.bill;
    }
}
