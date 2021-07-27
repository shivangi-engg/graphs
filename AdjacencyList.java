//code to create adjacency list from adjacency matrix
import java.util.*;
import java.lang.*;
public class AdjacencyList
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of nodes in the graph");
		int nodes = sc.nextInt();
		int matrix[][] = new int[nodes][nodes];
		System.out.println("enter the adjacency matrix of the graph:");
		for(int i=0;i<nodes;i++)
		{
			for(int j=0;j<nodes;j++)
			{
				int value = sc.nextInt();
				matrix[i][j] = value;
			}
		}

		System.out.println("the adjacency matrix is:");
		for(int i=0; i<nodes; i++)
		{
			for(int j=0; j<nodes; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		//adjacency list coding
		ArrayList<ArrayList<Integer>> adjacency_list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<nodes;i++)
		{
			adjacency_list.add(new ArrayList<Integer>());
		}
		for(int i=0; i<nodes; i++)
		{
			for(int j=0; j<nodes; j++)
			{
				if(matrix[i][j] == 1)
				{
					int count=0;
					Iterator<Integer> it = adjacency_list.get(i).iterator();
					while(it.hasNext())
					{
						it.next();
						count++;
					}
					adjacency_list.get(i).add(count,j);
				}
			}
		}

		//printing adjacency list
		System.out.println("the adjacency list is:");
		for(int i=0; i<nodes;i++)
		{
			System.out.print(i);
			Iterator<Integer> it = adjacency_list.get(i).iterator();
			while(it.hasNext())
			{
				System.out.print("-->"+it.next());			}
			System.out.println();
		}
	}
}