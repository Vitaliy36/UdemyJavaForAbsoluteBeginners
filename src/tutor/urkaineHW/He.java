package tutor.urkaineHW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class He extends Homosapien {

    public He(String name) {
        super(name);
    }

    public String[] getPhrase() {
        String[] additionalPhrase = {"I like fishing", "I like watch soccer and drink beer", "I hate clean dish"};
        List<String> listPhrase = new ArrayList<String>();
        Collections.addAll(listPhrase, super.getPhrase());
        Collections.addAll(listPhrase, additionalPhrase);
        String [] resultArray = (String[]) Array.newInstance(additionalPhrase.getClass().getComponentType(), 0);
        return (String[]) listPhrase.toArray(resultArray);

    }
}
