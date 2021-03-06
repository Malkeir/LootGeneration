enum Convertion2
{
    COPPER(10),
    GOLD(1/10),
    PLATINUM(1/100);
    private final double conv;
    private Convertion2(double conv)
    {
        this.conv = conv;
    }

    public double getConv() {
        return conv;
    }
}

public class SILVER extends MONEY
{
    private int sp = 0;

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = this.sp;
    }
    public double convertMoney(String converstionType, String convertionFrom) {
        double converstion = 0;
        switch(converstionType)
        {
            case "COPPER":
                converstion = Convertion2.COPPER.getConv() * this.sp;
                break;
            case "GOLD":
                converstion = Convertion2.GOLD.getConv() * this.sp;
                break;
            case "PLATINUM":
                converstion = Convertion2.PLATINUM.getConv() * this.sp;
                break;

        }
        return converstion;
    }
}
