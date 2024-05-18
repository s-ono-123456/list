package list;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortList<T> {

	public static final int NORMAL = 0;
	public static final int REVERSED = 1;
	
	private static <T> List<T> sort(List<T> beforelist
			, Function<T,String> sortCondition, int reversed) {
		
		// Comparator作成
		Collator collator = Collator.getInstance(Locale.JAPANESE);
		// Strength: 強さプロパティ（aとAやあとアなどを相違しているとみなすかどうか）
		collator.setStrength(Collator.IDENTICAL);
		
//		// CustomComparatorの利用
//		Comparator<String> collator = new CustomComparator();
		
		
		Comparator<T> comparator = 
				Comparator.comparing(sortCondition, collator);
		
		if (reversed == REVERSED) {
			comparator = comparator.reversed();
		}
		
		List<T> sortedList = beforelist.stream()
				.sorted(comparator)
				.collect(Collectors.toList());
		
		return sortedList;
	}
	
	public static <T> List<T> sortString(List<T> beforelist
			, Function<T,String> sortCondition1, int reversed1) {

		List<T> sortedList = sort(beforelist, sortCondition1, reversed1);
		
		return sortedList;
	}
	
	public static <T> List<T> sortString(List<T> beforelist
			, Function<T,String> sortCondition1, int reversed1
			, Function<T,String> sortCondition2, int reversed2) {
		
		List<T> sortedList = sort(beforelist, sortCondition2, reversed2);
		sortedList = sort(sortedList, sortCondition1, reversed1);
		
		return sortedList;
	}

	// LocalDateでのソートはできなかった。（LocalDateTimeではソート可能だったが、LocalDateではコンパイルエラーとなってしまう模様）
	// 複数条件でのソートを行うときに複雑化してしまうため、一律Stringに変換したうえでソートする方法としたい。
	
	
//	public static <T> List<T> sortDateTime(List<T> beforelist
//			, Function<T, LocalDateTime> sortCondition1, int reversed1) {
//		
//		Comparator<T> comparator = 
//				Comparator.comparing(sortCondition1, Comparator.naturalOrder());
//		List<T> sortedList = beforelist.stream()
//				.sorted(comparator)
//				.collect(Collectors.toList());
//		
//		return sortedList;
//	}
//	
//	public static <T> List<T> sortBigDecimal(List<T> beforelist
//			, Function<T, BigDecimal> sortCondition1, int reversed1) {
//		
//		Comparator<T> comparator = 
//				Comparator.comparing(sortCondition1, Comparator.naturalOrder());
//		List<T> sortedList = beforelist.stream()
//				.sorted(comparator)
//				.collect(Collectors.toList());
//		
//		return sortedList;
//	}
	
	
}
