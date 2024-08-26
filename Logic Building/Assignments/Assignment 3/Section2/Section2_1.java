 public class Section2_1 
 {
	public static void main(String[] args)
	{
	for (int i = 1; i <= 3; i++) 
	{
		for (int j = 1; j <= 2; j++)	
			{
				System.out.print(i + " " + j + " ");
			}
				System.out.println();
	}
 }
}
 /*
	// Guess the output of this loop. 
	**When i=1
	Iteration 1:
	i	j
	1	1=>1 1
	Iteration 2: j=1
	1	2=>1 2 then(SOP statement: Next line)
	o/p:1 1 1 2
	
	**When i=2
	iteration 1:
	i	j
	2 	1=>2 1
	iteration 2:j=2
	2	2=>2 2  then(SOP statement: Next line)
	o/p: 2 1 2 2
	
	**When i=3
	iterationc1:
	i	j
	3	1=>3 1 
	iteration 2:j=2
	3	2=>3 2  then(SOP statement: Next line)  
	o/p: 3 1 3 2
	
	So output of this code is:
		1	1	1	2
		2	1	2	2
		3	1	3	2

 */