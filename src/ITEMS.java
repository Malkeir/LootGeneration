
enum Rarity
{
    COMMON,
    UNCOMMON,
    RARE,
    VERYRARE,
    LEGENDARY;
}


public class ITEMS extends LOOT {
    private String itemName;
    private String description;
    private Rarity rarity;

    public void setItemName(String name)
        {
          this.itemName = name ;
        }

    public void setDescription(String description)
    {
        this.description = description ;
    }
    public void setRarity(String name)
    {
        switch(name)
        {
            case "COMMON":
                this.rarity = Rarity.COMMON;//
                break ;
            case "UNCOMMON":
                this.rarity = Rarity.UNCOMMON;
                break;
            case "RARE":
                this.rarity = Rarity.RARE;
                break;
            case "VERYRARE":
                this.rarity = Rarity.VERYRARE;
                break;
            case "LEGENDARY":
                this.rarity = Rarity.LEGENDARY;
                break;
        } ;
    }

    public String getItemName()
    {
        return this.itemName;
    }

    public String getDescription()
    {
        return this.description;
    }

    public Rarity getRarity()
    {
        return this.rarity;
    }

    public void createItem(String name,String description,String rarity)
    {
        this.setItemName(name);
        this.setDescription(description);
        this.setRarity(rarity);
    }

}
