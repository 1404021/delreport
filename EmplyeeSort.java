package com.del;

	import java.util.Comparator;

	public class EmplyeeSort implements Comparator<EmplyeeVo> {

		public EmplyeeSort() {

		}

		@Override
		public int compare(EmplyeeVo e1, EmplyeeVo e2) {

			return (int) (e1.getInc_tax() - e2.getInc_tax());
		}

		
	}


