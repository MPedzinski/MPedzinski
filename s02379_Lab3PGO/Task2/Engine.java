package Task2;

public class Engine {

    private int power;
    private int productionYear;

        public Engine(int power, int productionYear){
            this.power=power;
            this.productionYear=productionYear;

        }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

   void isEcological(){
            if(power>20000 && productionYear>2000){
                System.out.println(" This engine is ecological");
            }else{
                System.out.println(" This engine isn't ecological");
            }
        }
}
