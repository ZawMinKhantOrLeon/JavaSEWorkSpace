package lambda;

public interface CustomComparator<T extends Comparable> {
		
	T Compare (T t1, T t2);
}
