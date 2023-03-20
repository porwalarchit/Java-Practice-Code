package mycakeshop;
import java.util.*;
import java.lang.Iterable;

public class CakeShop implements Iterable <String> {
    private List<String> cakeFlavours;
    CakeShop(){
        this.cakeFlavours = new ArrayList<>();
    }

    private static int totalFlavours = 0;
    public void addCake(String element){
        cakeFlavours.add(element);
        totalFlavours++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            private int currIdx = 0;
            @Override
            public boolean hasNext() {
                return currIdx<totalFlavours;
            }

            @Override
            public String next() {
                if(hasNext()) return cakeFlavours.get(currIdx++);
                else throw new UnsupportedOperationException("Not Supported Yet.");
            }
        };
        return it;
    }
}
