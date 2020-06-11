package com.lhf.java8;

/**
 * ListÅÅĞò²ÉÓÃÄäÃûÄÚ²¿ÀàµÄ·½Ê½½øĞĞÅÅĞò
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo2 {

	public static void main(String[] args) {
		List<Girl> list = new ArrayList<>();
		list.add(new Girl("ÒÀÒÀ", 24, "DÕÖ±­", 172));
		list.add(new Girl("ÉºÉº", 18, "AÕÖ±­", 168));
		list.add(new Girl("À¼À¼", 22, "CÕÖ±­", 171));
		list.add(new Girl("»Û»Û", 23, "BÕÖ±­", 170));
		list.add(new Girl("ÃÎÃÎ", 25, "EÕÖ±­", 173));
		list.add(new Girl("Í®Í®", 22, "BÕÖ±­", 169));
		Collections.sort(list, new Comparator<Girl>() {
            //°´ÕÕÉí¸ßÅÅĞò ½µĞòÅÅĞò
			@Override
			public int compare(Girl girl1, Girl girl2) {
				int diff = girl1.getHeight() - girl2.getHeight();
				if(diff > 0) {
					return -1;
				}else if(diff < 0) {
					return 1;
				}
				return 0;  //ÏàµÈ
			}
		}); 
		
		System.out.println(list.toString());

	}

}
