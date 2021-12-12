

package activti7;
import java.util.*;
class DFS
{
private Stack<Integer> st;
public DFS()
{
st = new Stack<Integer>();
}
public void depth(int adjacency_matrix[][], int so)
{
int num_nodes = adjacency_matrix[so].length - 1;
int vis[] = new int[num_nodes + 1];
int value = so;
int i = so;
System.out.print(value + "\t");
vis[so] = 1;
st.push(so);
while (!st.isEmpty())
{
        value = st.peek();
i = value;
while (i <= num_nodes)
{
if (adjacency_matrix[value][i] == 1 && vis[i] == 0)
{
st.push(i);
vis[i] = 1;
value = i;
i = 1;

System.out.print(value + "\t");
continue;
}
i++;
}
st.pop();
}
}
public static void main(String[] args) {
        int num_nodes, source;
         Scanner sc = null;
        try
         {
         System.out.println("Enter the number of nodes in the graph");
         sc = new Scanner(System.in);
         num_nodes = sc.nextInt();
         int adjacency_matrix[][] = new int[num_nodes + 1][num_nodes + 1];
         System.out.println("Enter the adjacency matrix");
         for (int i = 1; i <= num_nodes; i++)
         for (int j = 1; j <= num_nodes; j++)
         adjacency_matrix[i][j] = sc.nextInt();
         System.out.println("Enter the source for the graph");
         source = sc.nextInt();
         System.out.println("The DFS Traversal for the graph is given by ");
         DFS depth_f_s = new DFS();
         depth_f_s.depth(adjacency_matrix, source);
         }catch(InputMismatchException inputMismatch)
         {
         System.out.println("Wrong Input format");
         }
         sc.close();
}

}

