/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * �� 10 ������������ 
 * http://www.sorting-algorithms.com
 * @author nandi
 * 2015��12��11��
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
	 * ԭ��ÿһ��Ԫ�ض��������������Ԫ�رȽϣ�����б�Ҫ���򽻻����Դ����ƣ�ֱ�������ڶ���Ԫ�غ����һ��Ԫ�رȽϲ�������ϡ�
	 * 
	 * ������򵥵����򷨣���Ȼ����ʱ�临�ӶȲ�����С�ģ���������˵�ǱȽϴ�ġ�
	 * �������ڴ���ṹʮ�ּ򵥣����Ա����ٶ�ʮ�ֿ죬����С��ģ���ݵ�������˵��bubble sort�Ǻܺõġ�
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
	 * ԭ�����Ƚ��������鿴�������֣�ǰ�����Ѿ�������ɵ����飬�����ǻ�δ������ɵġ�
	 * ÿ�δ�δ��������鵱��ѡ��һ������ʵ���ǵ�һ����~~����������������õ�������б����Աȣ��ҵ����ʵ�λ�ò����롣
	 * 
	 * ���뷨������ʵ��ð�ݷ��Ӵ����Ͽ�ʮ�����ơ�
	 * ��������ð�ݷ�������ͬ������������뷨��һǰһ�����������
	 * �˷���Ҫһ������˼ά����Ȼ����ð�ݷ��ü��䡣��Ҳ��ʮ�ּ򵥵�һ�����򷨡�
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
	 * ԭ��ѡ������͸����ˣ����ȴ�ȫ��������ѡ����С�ģ����ڵ�һλ���ٴ�ʣ�µ����鵱��ѡ����С�ģ����ڵڶ�λ����������ֱ�����е�����ѡ����ϡ�
	 * 
	 * ѡ���������˵��������������Ȼ����������һ�������ճ�������ʹ�õķ������ˣ������ڳ�����ȴ����˵����ӵģ���Ϊ���ۺ�������£�����ʱ�临�Ӷȶ���O(n^2)
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
	 * ԭ���鲢���򣬽������������֣�Ȼ���ٽ����������ݣ�Ȼ�������֣�һֱ�����ɷ�Ϊֹ��Ȼ���ٽ���Щ������Ƚ���ϣ�ֱ���õ����������顣
	 * 
	 * �鲢���򣬾�����ν��Divid and Conquer,���õݹ�����ƣ�����������"�ֶ���֮"�����������������
	 * �������Ӧ�������ģ���Ȼ���и������νbucket sort�������Ǻǡ��������ַ���������̫���ˣ������ǶԱ�̵�Ҫ���Ըߡ�
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
		
		//��������Ϊ��
		while (ll <= mid && rl <= last) {
			tmp[k++] = (a[ll] < a[rl]) ? a[ll++] : a[rl++];
		}
		
		//��߲���
		while (ll <= mid) {
			tmp[k++] = a[ll++];
		}
		
		//�ұ߲���
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
	 * ԭ����ѡ��һ��������pivot�����ѡ�������ǵ�һ����Ҳ���������һ���������������м����һ����Ȼ������������飬������pivot���������ұߣ�С��pivot����������ߡ�
	 * Ȼ���ٷֱ�ݹ��������ߵ�������
	 * 
	 * ����㷨Ҳ�ǲ��÷��ε�˼�루Divid and Conquer���������ϲ��÷���˼����㷨��ʱ�临�Ӷȶ���n*logn�й�~~~~
	 * ����㷨��ʵ����⣬�ѵ�Ӧ���ڴ����ʵ���ϣ������û�м�ס����Ļ������±�д���ܻ�������������
	 * 1�����������Ҫ���������Ϊ��ֱ����ԭ�����ϲ�����һ����������
	 * 2����ô��������ֳ�����Ҳ���ѵ㣬�ҵ�˼·�ǣ������������飬������С��pivot������Ū������ǰ��Σ�����¼��һ������pivot��������s��
	 * ��ôһ���������µ�С���������ֱ�Ӻ�λ��s���Ǹ��������������¼�¼������һ�����ͱ�֤����¼������֮�����������С��pivot������ٰ�pivot����sλ�á�ʵ��������ķֶΡ�
	 */
	public static void quickSort() {
		
		quickSort(0, a.length - 1);
	}
	
	private static void quickSort(int first, int last) {
		
		if (first < last) {
			int pivot = partition(first, last);
			//����Ҫע�⣬�ݹ��ʱ����Ҫ�ƹ��Ѿ�ѡ�����˵�������pivot
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
	 * ԭ��
	 * ���Ƚ����������������гɷ������ѣ�������С�ѣ��ṹ�����顣
	 * ��Ȼ���������϶ѽṹ����ô���ĸ�Ԫ�ر�Ȼ����������С�ģ���ʱ���ǿ���ȡ�������Ԫ�أ��Ϳ��Եõ��������е����ֵ������Сֵ�ˡ�
	 * ʣ�µ�Ԫ�����ظ��ղŵĲ��裬ֱ�����е�Ԫ�ض�ȡ�����õ����кõ����顣
	 * 
	 * heap sort��������潲����ʵ����Ϊ����������⣬���۴Ӵ���ʵ�ֻ�������֪ʶ���涼�ǡ���������Ч�����൱���㣬���Բ��ò�ѧϰ~~~~~~
	 * �ڴ���ʵ���У�Ϊ�˽�Լ�洢�ռ䣬���ǲ���ȡ����Ԫ�أ����ǽ���Ԫ�غ����һ��ҶԪ�ؽ�����Ȼ��ݹ�ǰ���N-1��Ԫ�ؾ����ˡ�
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
		System.out.print("ԭ����Ϊ:\t\t");
		printNumbers();
		heapSort();
		System.out.print("�����Ժ������Ϊ:\t");
		printNumbers();
		System.exit(0);
	}
	
}
