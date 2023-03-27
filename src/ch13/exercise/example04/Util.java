package ch13.exercise.example04;

public class Util{
	public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
		K k = pair.getKey();
		
		if (k.equals(key)) {
			return pair.getValue();
		}
		
		return null;
	}
}
//public class Util <T extends Pair>  {
//
//	public static Integer getValue(Pair<String, Integer> pair, String name) {
//		if(pair.getKey().equals(name)) {
//			return pair.getValue();
//		} else {
//			return null;
//		}
//	}
//}
