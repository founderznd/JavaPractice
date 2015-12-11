/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 对 10 个数进行排序 
 * http://www.sorting-algorithms.com
 * @author nandi
 * 2015年12月11日
 * prog28.java
 */

public class prog28 {
	
	private static int[] a = { -10, 41, -42, 34, 22, 26, 30, 1, 42, 40, -2, -8 };
	
	public static void setFeld(int n) {
		
		a = new int[n];
		System.out.println("input " + n + " numbers:");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		s.close();
	}
	
	public static void randomFeld(int n) {
		
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
		}
	}
	
	public static void printNumbers() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	/**
	 * bubble sort
	 * best:	O(n)
	 * worst:	O(n^2)
	 * average:	O(n^2)
	 * 
	 * 原理：每一个元素都和它后面的所有元素比较，如果有必要，则交换，以此类推，直到倒数第二个元素和最后一个元素比较并交换完毕。
	 * 
	 * 这是最简单的排序法，虽然他的时间复杂度不是最小的，甚至可以说是比较大的。
	 * 但是由于代码结构十分简单，所以编码速度十分快，对于小规模数据的排序来说，bubble sort是很好的。
	 */
	public static void bubbleSort() {
		
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	
	/**
	 * insertion Sort
	 * best:	O(n)
	 * worst:	O(n^2)
	 * average:	O(n^2)
	 * 
	 * 原理：首先将整个数组看成两部分，前面是已经排序完成的数组，后面是还未排序完成的。
	 * 每次从未排序的数组当中选择一个（其实就是第一个啦~~方便遍历嘛），对排序好的数组进行遍历对比，找到合适的位置并插入。
	 * 
	 * 插入法排序其实和冒泡法从代码上看十分相似。
	 * 区别在于冒泡法是两次同向遍历，而插入法是一前一后异向遍历。
	 * 此法需要一点逆向思维，虽然不如冒泡法好记忆。但也是十分简单的一种排序法。
	 */
	public static void insertSort() {
		
		int tmp;
		for (int i = 1; i < a.length; i++) {
			for (int k = i; k > 0; k--) {
				if (a[k] < a[k - 1]) {
					tmp = a[k];
					a[k] = a[k - 1];
					a[k - 1] = tmp;
				}
			}
		}
	}
	
	/**
	 * Selection Sort
	 * best:	O(n^2)
	 * worst:	O(n^2)
	 * average:	O(n^2)
	 * 
	 * 原理：选择排序就更简单了，首先从全部数组中选出最小的，放在第一位，再从剩下的数组当中选出最小的，放在第二位，依此类推直到所有的数都选择完毕。
	 * 
	 * 选择排序可以说是最容易理解的自然方法（就是一般人在日常生活中使用的方法）了，但是在程序当中却可以说是最复杂的，因为无论何种情况下，它的时间复杂度都是O(n^2)
	 */
	public static void selectionSort() {
		
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int p = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					p = j;
				}
			}
			int tmp = a[p];
			a[p] = a[i];
			a[i] = tmp;
		}
	}
	
	/**
	 * Merge Sort
	 * best:	O(n*logn)
	 * worst:	O(n*logn)
	 * average:	O(n*logn)
	 * 
	 * 原理：归并排序，将整个数列两分，然后再将子数组两份，然后再两分，一直到不可分为止，然后再将这些子数组比较组合，直到得到完整的数组。
	 * 
	 * 归并排序，就是所谓的Divid and Conquer,利用递归的优势，将整个数组"分而治之"，最后再整合起来。
	 * 这个方法应该是最快的（当然还有更快的所谓bucket sort，不过呵呵。。。那种方法局限性太大了），就是对编程的要求略高。
	 */
	public static void mergeSort() {
		
		mergeSort(0, a.length - 1);
	}
	
	private static void mergeSort(int first, int last) {
		
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(first, mid);
			mergeSort(mid + 1, last);
			merge(first, mid, last);
		}
	}
	
	private static void merge(int first, int mid, int last) {
		
		int[] tmp = new int[last - first + 1];
		int ll = first;
		int rl = mid + 1;
		int k = 0;
		
		//两个都不为空
		while (ll <= mid && rl <= last) {
			tmp[k++] = (a[ll] < a[rl]) ? a[ll++] : a[rl++];
		}
		
		//左边不空
		while (ll <= mid) {
			tmp[k++] = a[ll++];
		}
		
		//右边不空
		while (rl <= last) {
			tmp[k++] = a[rl++];
		}
		
		for (int i = 0; i < k; i++)
			a[first + i] = tmp[i];
			
	}
	
	/**
	 * quick sort
	 * best:	O(n*logn)
	 * worst:	O(n^2)
	 * average:	O(n*logn)
	 * 
	 * 原理：先选定一个中心数pivot，随便选，可以是第一个，也可以是最后一个，甚至可以是中间随便一个，然后遍历整个数组，将大于pivot的数放在右边，小于pivot的数放在左边。
	 * 然后再分别递归左右两边的子数组
	 * 
	 * 这个算法也是采用分治的思想（Divid and Conquer），基本上采用分治思想的算法，时间复杂度都和n*logn有关~~~~
	 * 这个算法其实好理解，难点应该在代码的实现上，如果你没有记住代码的话，重新编写可能会遇到两个问题
	 * 1、数组的坐标要搞清楚，因为是直接在原数组上操作，一步错，步步错。
	 * 2、怎么样将数组分成两段也是难点，我的思路是，遍历整个数组，将所有小于pivot的数都弄到数组前半段，并记录第一个大于pivot数的坐标s。
	 * 那么一旦发现有新的小数，则可以直接和位于s的那个数交换，并重新记录，这样一来，就保证被记录的坐标之间的所有数都小于pivot，最后再把pivot换到s位置。实现了数组的分段。
	 */
	public static void quickSort() {
		
		quickSort(0, a.length - 1);
	}
	
	private static void quickSort(int first, int last) {
		
		if (first < last) {
			int pivot = partition(first, last);
			//这里要注意，递归的时候需要绕过已经选出来了的中心数pivot
			quickSort(first, pivot - 1);
			quickSort(pivot + 1, last);
		}
	}
	
	private static int partition(int first, int last) {
		
		int s = first;
		int tmp;
		
		for (int l = first; l < last; l++) {
			if (a[l] < a[last]) {
				tmp = a[l];
				a[l] = a[s];
				a[s] = tmp;
				s++;
			}
			
		}
		tmp = a[last];
		a[last] = a[s];
		a[s] = tmp;
		
		return s;
	}
	
	/**
	 * heap sort
	 * best:	O(n*logn)
	 * worst:	O(n*logn)
	 * average:	O(n*logn)
	 * 
	 * 原理：
	 * 首先将整个数组重新排列成符合最大堆（或者最小堆）结构的数组。
	 * 既然这个数组符合堆结构，那么它的根元素必然是最大或者最小的，这时我们可以取出这个根元素，就可以得到整个数列的最大值或者最小值了。
	 * 剩下的元素再重复刚才的步骤，直到所有的元素都取出，得到排列好的数组。
	 * 
	 * heap sort放在最后面讲，其实是因为它最难以理解，无论从代码实现还是理论知识方面都是。但是它的效率又相当优秀，所以不得不学习~~~~~~
	 * 在代码实现中，为了节约存储空间，我们不用取出根元素，而是将根元素和最后一个叶元素交换，然后递归前面的N-1个元素就行了。
	 */
	public static void heapSort() {
		
		for (int i = a.length / 2 - 1; i >= 0; i--) {
			moveDown(i, a.length);
		}
		
		for (int i = a.length - 1; i >= 1; i--) {
			int tmp = a[i];
			a[i] = a[0];
			a[0] = tmp;
			moveDown(0, i);
		}
	}
	
	private static void moveDown(int i, int n) {
		
		int lc = 2 * i + 1;
		while (lc < n) {
			if (lc < n - 1 && a[lc] < a[lc + 1]) {
				lc++;
			}
			if (a[i] < a[lc]) {
				int tmp = a[i];
				a[i] = a[lc];
				a[lc] = tmp;
				
				i = lc;
				lc = 2 * i + 1;
			}
			else {
				lc = n;
			}
		}
	}
	
	public static void main(String[] args) {
		
		randomFeld(9);
		System.out.print("原数组为:\t\t");
		printNumbers();
		heapSort();
		System.out.print("排序以后的数组为:\t");
		printNumbers();
		System.exit(0);
	}
	
}
