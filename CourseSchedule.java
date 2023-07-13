import java.util.*;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // make the graph
        // not the fastest approach
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        int indegree[] = new int[numCourses];

        for(int[] arr: prerequisites)
        {
            int i=arr[0];
            int j=arr[1];
            List<Integer> list = graph.getOrDefault(j, new ArrayList<>());
            list.add(i);
            graph.put(j,list);
            indegree[i]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        // add all the indegree with the values zero to the queue
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                queue.add(i);
            }
        }
        int count=0;
        // starting the kahn's algo
        while(!queue.isEmpty())
        {
            int rem = queue.poll();

            count++;
            // check if keey is in graph
            if(!graph.containsKey(rem))
            {
                continue;
            }


            List<Integer> list1 = graph.get(rem);
            for(int k: list1)
            {
                indegree[k]--;
                if(indegree[k]==0)
                {
                    queue.add(k);
                }
            }
        }
        // if count is not equal to numCourses then a cycle must have occured.
        return count==numCourses;

    }
    public static void main(String[] args) {
        int preRequisite[][] = {{1,0},{0,1}};
        int numCourses = 2;
        if(canFinish(numCourses,preRequisite))
        {
            System.out.println("Possible");
        }
        else System.out.println("Not possible");
    }
}
