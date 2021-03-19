package com.dvlcube.app.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dvlcube.utils.aspects.stats.Stat;

public class Teste {

	public static void main(String[] args) {
		Stat stat = new Stat("teste");
		stat.setMin(2L);
		stat.setMax(5L);
		stat.setCount(25L);
		stat.setTotal(5L);

		Stat stat2 = new Stat("teste2");
		stat2.setMin(10L);
		stat2.setMax(20L);
		stat2.setCount(16L);
		stat2.setTotal(8L);
		
		List<Stat> lista = new ArrayList<>();
		lista.add(stat2);
		lista.add(stat);
		
		Collections.sort(lista, Comparator.comparing(Stat::getTotal).thenComparing(Stat::avg));
		
		for (Stat stat3 : lista) {
			System.out.println("Total:" + stat3.getTotal() +" ---- Media:" + stat3.avg());
		}
	}

}
