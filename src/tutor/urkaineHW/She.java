package tutor.urkaineHW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class She extends Homosapien {

    public She(String name) {
        super(name);
    }

    public String[] getPhrase() {
        String[] additionalPhrase = {"I like cooking", "I like watch drama movie and crying", "I hate dirty dish"};
        List<String> listPhrase = new ArrayList<String>();
        Collections.addAll(listPhrase, super.getPhrase());
        Collections.addAll(listPhrase, additionalPhrase);
        String [] resultArray = (String[]) Array.newInstance(additionalPhrase.getClass().getComponentType(), 0);
        return (String[]) listPhrase.toArray(resultArray);
    }
}
