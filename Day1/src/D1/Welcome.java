package D1;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.DelayQueue;
public class Welcome {
	public static void main(String[] args) {
		int A[]= {1,2,5,4,0};
		int B[]= {2,4,5,0,6};
		boolean flag=true;
		Set <Integer> s=new HashSet <>();
		for(int i=0;i<A.length;i++)
		{
			s.add(A[i]);
		}
		for(int i=0;i<B.length;i++)
		{
			if(s.contains(B[i]))
			{
				continue;
			}
			else
			{
				flag=false;
			}
		}
		System.out.println(flag);
	}
}

		
	


