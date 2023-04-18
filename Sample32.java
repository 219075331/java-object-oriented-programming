import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sample32 {

	public static void main(String[] args) {
		
		Map<Category, List<Item>> map = new LinkedHashMap<Category, List<Item>>();
		
		Category cate1 = new Category("SPORTS_BASEBALL", "野球商品");		
		List<Item> list1 = new ArrayList<Item>();
		list1.add(new Item("XB4862", "金属バック", 21000));
		list1.add(new Item("R789T", "硬式グローブ", 18900));
		list1.add(new Item("2H-3Z", "硬式ボール", 399));
		
		map.put(cate1, list1);
		
		Category cate2 = new Category("SPORTS_KENDO", "剣道");
		List<Item> list2 = new ArrayList<Item>();
		list2.add(new Item("TT-36", "胴長先細竹刀（３６）", 3000));
		list2.add(new Item("MEN_XX", "４５㎜　面ナナメ刺", 35000));
		
		map.put(cate2, list2);
		
		Category cate3 = new Category("CULTURE_SHODO", "書道商品");
		List<Item> item3 = new ArrayList<Item>();
		item3.add(new Item("RS27-2012", "写経セット　「雅」", 6980));
		item3.add(new Item("MP4-27", "端渓硯　麻子抗", 29800));
		
		map.put(cate3, item3);
		
		for( Category category : map.keySet()) {
			System.out.println(">>>"+ category.getName());
			for(Item items : map.get(category)) {
				System.out.println(items.getName() + " :" + items.getPrice());
				
			}
			
		}
	}
		
}
