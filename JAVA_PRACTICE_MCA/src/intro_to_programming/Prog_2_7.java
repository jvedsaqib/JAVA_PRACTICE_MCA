package intro_to_programming;

/*
 	7. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
		a program to merge them into single sorted array C that contains every item from arrays.
		A & B, in ascending order.
 */

public class Prog_2_7 {
	
	static int[] sort(int a[]){
        int l=a.length,i,j,t=0;
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return a;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,6,7};
		int b[] = {4,5,8};
		
		int c[] = new int[a.length + b.length];
		
		System.out.println("Array A");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nArray B");
		for(int i : b) {
			System.out.print(i + " ");
		}
		
		for(int i = 0; i < a.length; i++) {
				c[i] = a[i];
		}
		for(int i = 0; i <b.length; i++) {
			c[a.length + i] = b[i];
		}
		
		c = sort(c);
		
		System.out.println("\nArray C");
		for(int i : c) {
			System.out.print(i + " ");
		}

	}

}
