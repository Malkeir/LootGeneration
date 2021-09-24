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


public class COPPER extends MONEY
{
    private int cp = 0;

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public double convertMoney(String converstionType, String convertionFrom)
    {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion.PLATINUM.getConv() * this.sp;
                break;
            case "GOLD":
                converstion = Convertion.PLATINUM.getConv() * this.sp;
                break;
            case "PLATINUM":
                converstion = Convertion.PLATINUM.getConv() * this.sp;
                break;

        }
        return converstion;
    }
}
