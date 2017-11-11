package ds.application.probability;

import ds.application.math.utilites.Factorial;

/* 
 * Combinations are the subset of Permutation.
 * Combinations are any possibilities of a set with no order constraint - permutations have a order constraint 
 */
public class Permutation {
	public long getAllthePossibilities(long numberOfEntites,long numberOfEntitesTobeChosen) {
		return (Factorial.getFactorialOfNumber(numberOfEntites) / Factorial.getFactorialOfNumber(numberOfEntites-numberOfEntitesTobeChosen));
	}
}
