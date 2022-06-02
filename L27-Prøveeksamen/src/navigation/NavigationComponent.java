package navigation;

import java.util.ArrayList;

public abstract class NavigationComponent
{
    private ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();

    public void addChild(NavigationComponent navigationComponent)
    {
        navigationComponents.add(navigationComponent);
    }

    public ArrayList<NavigationComponent> getChildren()
    {
        return new ArrayList<>(navigationComponents);
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getLink()
    {
        throw new UnsupportedOperationException();
    }

    public void print(int niveau)
    {
        for(NavigationComponent n : navigationComponents) {
            n.print(niveau+1);
        }
    }
}
