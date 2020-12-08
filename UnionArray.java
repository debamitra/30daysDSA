class UnionArray {
public static void union (int[] ar1, int[] ar2) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<ar1.length;i++)
		    set.add(ar1[i]);
		for(int j=0;j<ar2.length;j++)
		    set.add(ar1[j]);
		    
		set.forEach(System.out::println);
	}
};
