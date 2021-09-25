enum Convertion4
{
    SILVER(100),
    GOLD(10),
    COPPER(1000);

    private final double conv;
    private Convertion4(double conv)
    {
        this.conv = conv;
    }

    public double getConv() {
        return conv;
    }
}

public class PLATINUM extends MONEY
{
    private int pp = 0;

    public int getPp() {
        return this.pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    public double convertMoney(String converstionType, String convertionFrom)
    {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion4.SILVER.getConv() * this.pp;
                break;
            case "GOLD":
                converstion = Convertion4.GOLD.getConv() * this.pp;
                break;
            case "SILVER":
                converstion = Convertion4.COPPER.getConv() * this.pp;
                break;

        }
        return converstion;
    }
}
