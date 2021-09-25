enum Convertion1
{
    COPPER(100),
    SILVER(10),
    PLATINUM(1/10);

    private final double conv;
    private Convertion1(double conv)
    {
        this.conv = conv;
    }

    public double getConv() {
        return conv;
    }
}

public class GOLD extends MONEY
{
    private double gp = 0;

    public double getGp() {
        return this.gp;
    }

    public void setGp(double gp) {
        this.gp = gp;
    }
    public double convertMoney(String converstionType)
    {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion1.COPPER.getConv() * this.gp;
                break;
            case "SILVER":
                converstion = Convertion1.SILVER.getConv() * this.gp;
                break;
            case "PLATINUM":
                converstion = Convertion1.PLATINUM.getConv() * this.gp;
                break;

        }
        return converstion;
    }
    public void GOLD(double amount)
    {
        this.setGp(amount);
    }
}
