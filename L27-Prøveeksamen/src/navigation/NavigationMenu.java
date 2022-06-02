package navigation;

public class NavigationMenu extends NavigationComponent
{
    private String name;

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void print(int niveau)
    {
        for(int i = 0; i<niveau; i++) System.out.print("-");
        System.out.println("[Menu]" + name);
        for(NavigationComponent n : super.getChildren()) {
            n.print(niveau+1);
        }
    }
}
