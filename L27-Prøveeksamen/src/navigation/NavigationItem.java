package navigation;

import java.util.ArrayList;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getLink()
    {
        return link;
    }

    @Override
    public void print(int niveau)
    {
        for(int i = 0; i<niveau; i++) System.out.print("-");
        System.out.println("[Item] " + name);
    }

    @Override
    public void addChild(NavigationComponent navigationComponent)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayList<NavigationComponent> getChildren()
    {
        throw new UnsupportedOperationException();
    }
}
