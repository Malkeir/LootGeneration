enum Convertion3
{
    SILVER(1/10),
    GOLD(1/100),
    PLATINUM(1/1000);

    private final double conv;
    private Convertion3(double conv)
    {
        this.conv = conv;
    }

    public double getConv() {
        return conv;
    }
}


public class COPPER extends MONEY
{
    private int cp = 0;

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    public double convertMoney(String converstionType, String convertionFrom)
    {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion3.SILVER.getConv() * this.cp;
                break;
            case "GOLD":
                converstion = Convertion3.GOLD.getConv() * this.cp;
                break;
            case "PLATINUM":
                converstion = Convertion3.PLATINUM.getConv() * this.cp;
                break;

        }
        return converstion;
    }
}
