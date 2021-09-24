enum Convertion
{
    SILVER(1/10),
    GOLD(1/100),
    PLATINUM(1/1000);

    private final double conv;
    private Convertion(double conv)
    {
        this.conv = conv;
    }

    public double getConv() {
        return conv;
    }
}

public class GOLD extends MONEY
{
    private int gp = 0;

    public int getGp() {
        return this.gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    @Override
    public double convertMoney(String converstionType, String convertionFrom)
    {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion.PLATINUM.getConv() * this.gp;
                break;
            case "GOLD":
                converstion = Convertion.PLATINUM.getConv() * this.gp;
                break;
            case "PLATINUM":
                converstion = Convertion.PLATINUM.getConv() * this.gp;
                break;

        }
        return converstion;
    }
}
