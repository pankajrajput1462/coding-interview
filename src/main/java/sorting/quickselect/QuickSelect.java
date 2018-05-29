package sorting.quickselect;

import java.util.Random;

public class QuickSelect {

	public int quickselect(int[] G, int nthMax) {
		  return quickselect(G, 0, G.length - 1, nthMax - 1);
		}
		 
		private int quickselect(int[] G, int first, int last, int k) {
		  if (first <= last) {
		    int pivot = partition(G, first, last);
		    if (pivot == k) {
		      return G[k];
		    }
		    if (pivot > k) {
		      return quickselect(G, first, pivot - 1, k);
		    }
		    return quickselect(G, pivot + 1, last, k);
		  }
		  return Integer.MIN_VALUE;
		}
		 
		private int partition(int[] G, int first, int last) {
		  int pivot = first + new Random().nextInt(last - first + 1);
		  swap(G, last, pivot);
		  for (int i = first; i < last; i++) {
		    if (G[i] > G[last]) {
		      swap(G, i, first);
		      first++;
		    }
		  }
		  swap(G, first, last);
		  return first;
		}
		 
		private void swap(int[] G, int x, int y) {
		  int tmp = G[x];
		  G[x] = G[y];
		  G[y] = tmp;
		}
	
}
