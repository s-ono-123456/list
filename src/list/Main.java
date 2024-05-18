package list;

import java.math.BigDecimal;
import java.text.Collator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {		
		List<SampleBean> sortlist = new ArrayList<>(); 
		
		SampleBean bean1 = new SampleBean();
		bean1.setBigdecimal1(new BigDecimal(1));
		bean1.setBigdecimal2(new BigDecimal(2));
		bean1.setLocaldatetime(LocalDateTime.of(2024, 1, 1, 1, 1));
		bean1.setLocaldate(LocalDate.of(2024, 1, 1));
		bean1.setString1("あ");
		bean1.setString2("2024/01/01");
		
		sortlist.add(bean1);
		

		SampleBean bean2 = new SampleBean();
		bean2.setBigdecimal1(new BigDecimal(0));
		bean2.setBigdecimal2(new BigDecimal(5));
		bean2.setLocaldatetime(LocalDateTime.of(2023, 1, 1, 1, 1));
		bean2.setLocaldate(LocalDate.of(2023, 1, 1));
		bean2.setString1("あ");
		bean2.setString2("2024/01/05");
		
		sortlist.add(bean2);

		SampleBean bean3 = new SampleBean();
		bean3.setBigdecimal1(new BigDecimal(0));
		bean3.setBigdecimal2(new BigDecimal(4));
		bean3.setLocaldatetime(LocalDateTime.of(2022, 1, 1, 1, 1));
		bean3.setLocaldate(LocalDate.of(2023, 2, 1));
		bean3.setString1("う");
		bean3.setString2("2023/04/01");

		sortlist.add(bean3);
		
		System.out.println(sortlist.get(0));		
		System.out.println(sortlist.get(1));		
		System.out.println(sortlist.get(2));
				
		// Comparator作成
		Collator collator = Collator.getInstance(Locale.JAPANESE);
		// Strength: 強さプロパティ（aとAやあとアなどを相違しているとみなすかどうか）
		collator.setStrength(Collator.IDENTICAL);
		
		System.out.println(collator.compare("い", "亜"));

		
		List<SampleBean> sortedList = 
				SortList.sortString(sortlist, SampleBean::getString1, SortList.NORMAL
						, SampleBean::getString2, SortList.NORMAL);

//		sortedList = 
//				SortList.sortDate(sortlist, SampleBean::getLocaldate, SortList.NORMAL);
		
		// Comparator作成
//		Comparator<SampleBean> comparator = 
//						Comparator.comparing(SampleBean::getLocaldatetime, Comparator.naturalOrder());
//		List<SampleBean> sortedList = sortlist.stream()
//				.sorted(comparator)
//				.collect(Collectors.toList());
		
		
		System.out.println("ソート処理後");

		System.out.println(sortedList.get(0));
		System.out.println(sortedList.get(1));
		System.out.println(sortedList.get(2));
		
		SortList<SampleBean> sort = new SortList<>();
		
//		List<?> sortedList2 = sort.sort(sortlist);
		
	}

}
