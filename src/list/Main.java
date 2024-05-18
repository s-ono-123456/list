package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		List<SampleBean> sortlist = new ArrayList<>(); 
		
		long beforememory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		for (int i = 0; i < 30000; i++) {
			SampleBean bean = new SampleBean();
			bean.setString1(Util.random());
			bean.setString2(Util.random());
			bean.setString3(Util.random());
			bean.setString4(Util.random());
			bean.setString5(Util.random());
			bean.setString6(Util.random());
			bean.setString7(Util.random());
			bean.setString8(Util.random());
			bean.setString9(Util.random());
			bean.setString10(Util.random());
			bean.setString11(Util.random());
			bean.setString12(Util.random());
			bean.setString13(Util.random());
			bean.setString14(Util.random());
			bean.setString15(Util.random());
			bean.setString16(Util.random());
			bean.setString17(Util.random());
			bean.setString18(Util.random());
			bean.setString19(Util.random());
			bean.setString20(Util.random());
			sortlist.add(bean);
		}
		long aftermemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("メモリ量： " + (aftermemory - beforememory)/1024/1024 + " MB");
		
		System.out.println("######################################");			
		System.out.println("#############　　　ソート前　　　#############");	
		System.out.println("######################################");
		
		// 処理時間計測
		for (int i = 0; i < 10; i++) {
			System.out.println(sortlist.get(i));	
		}
		long startTime = System.currentTimeMillis();

//				
//		// Comparator作成
//		Collator collator = Collator.getInstance(Locale.JAPANESE);
//		// Strength: 強さプロパティ（aとAやあとアなどを相違しているとみなすかどうか）
//		collator.setStrength(Collator.IDENTICAL);
//		
//		System.out.println(collator.compare("い", "亜"));

		
		List<SampleBean> sortedList = 
				SortList.sortString(sortlist
						, SampleBean::getString1, SortList.NORMAL
						, SampleBean::getString2, SortList.NORMAL
						, SampleBean::getString3, SortList.NORMAL);
		

		long endTime = System.currentTimeMillis();
		
		System.out.println();
		
		System.out.println("処理時間：" + (endTime - startTime) + " ms");
		
		System.out.println();


		System.out.println("######################################");			
		System.out.println("#############　　　ソート後　　　#############");	
		System.out.println("######################################");
		for (int i = 0; i < 10; i++) {
			System.out.println(sortedList.get(i));	
		}
//		sortedList = 
//				SortList.sortDate(sortlist, SampleBean::getLocaldate, SortList.NORMAL);
		
		// Comparator作成
//		Comparator<SampleBean> comparator = 
//						Comparator.comparing(SampleBean::getLocaldatetime, Comparator.naturalOrder());
//		List<SampleBean> sortedList = sortlist.stream()
//				.sorted(comparator)
//				.collect(Collectors.toList());
		
	}

}
