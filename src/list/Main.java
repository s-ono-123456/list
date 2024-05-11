package list;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("aaaaa");
		
		List<SampleBean> sortlist = new ArrayList<>(); 
		
		SampleBean bean1 = new SampleBean();
		bean1.setBigdecimal1(new BigDecimal(1));
		bean1.setBigdecimal2(new BigDecimal(2));
		bean1.setLocaldatetime(LocalDateTime.of(2024, 1, 1, 1, 1));
		bean1.setString1("001");
		bean1.setString2("002");
		
		sortlist.add(bean1);
		

		SampleBean bean2 = new SampleBean();
		bean2.setBigdecimal1(new BigDecimal(0));
		bean2.setBigdecimal2(new BigDecimal(5));
		bean2.setLocaldatetime(LocalDateTime.of(2023, 1, 1, 1, 1));
		bean2.setString1("000");
		bean2.setString2("005");
		
		sortlist.add(bean2);

		SampleBean bean3 = new SampleBean();
		bean3.setBigdecimal1(new BigDecimal(0));
		bean3.setBigdecimal2(new BigDecimal(4));
		bean3.setLocaldatetime(LocalDateTime.of(2022, 1, 1, 1, 1));
		bean3.setString1("000");
		bean3.setString2("004");

		sortlist.add(bean3);
		
		System.out.println(sortlist.get(0));		
		System.out.println(sortlist.get(1));		
		System.out.println(sortlist.get(2));
		
		// Comparator作成
		Comparator<SampleBean> comparator = 
				Comparator.comparing(SampleBean::getString1, Comparator.reverseOrder())
						  .thenComparing(SampleBean::getString2, Comparator.nullsLast(Comparator.naturalOrder()));
		
		List<SampleBean> sortedList = sortlist.stream()
				.sorted(comparator)
				.collect(Collectors.toList());
		
		System.out.println("ソート処理後");

		System.out.println(sortedList.get(0));
		System.out.println(sortedList.get(1));
		System.out.println(sortedList.get(2));
		
		SortList<SampleBean> sort = new SortList<>();
		
		List<?> sortedList2 = sort.sort(sortlist);
		
	}

}
