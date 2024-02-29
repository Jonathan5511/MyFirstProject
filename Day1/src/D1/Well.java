package D1;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
public class Well
{
	
	public static void main(String[] args)
	{
		ArrayList <Integer> a=new ArrayList <Integer>();
		a.add(576);
		a.add(874);
		a.add(349);
		a.add(243);
		a.add(187);
		
		
		Comparator <Integer> com=(o1,o2) ->
		{
			
				if(o1<o2)
				{
					return 1;
				}
				return 0;
			
		};
		Collections.sort(a,com);
		
		System.out.println(a); 
	}
}

	

