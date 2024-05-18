package list;

import java.text.Collator;
import java.util.Locale;

public abstract class CollatorJapanese extends Collator {
	public static synchronized Collator getInstance() {
        Collator collator =  getInstance(Locale.JAPANESE);
        collator.setStrength(IDENTICAL);
        return collator;
    }
	
	@Override
    public int compare(Object o1, Object o2) {
    return compare((String)o1, (String)o2);
    }
	
}
