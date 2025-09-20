class Solution {
    public List<Integer> grayCode(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		//result.add(0);
// 		int i = 1;
// 		int count = 0;
// 		while (i < 1<<n) {
// //			System.out.print("here");
// 			result.add(i);
// 			i = i << 1;
// 			i++;
// 			count++;
// 		}
// 		result.add(i);
//         if (i != n) {
// 		    result.add(n);
//         }
// //		while (result.get(count) <= n) {
// //			max = max >> 1;
// //			result.add(max);
// //		}
// 		System.out.println(result);
//         return result;
        for (int i = 0; i < 1<<n; i++) {
            result.add(i^(i>>1));
        }
        return result;
    }
}
