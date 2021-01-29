//Mihlali Nonyukela

 
/* 
	This program implements a solution for the Towers of Hanoi problem.
	A tower of 5 disks must be moved from rod A to rod C using B as a
	spare or temporary storage space
*/

public class TowerOfHanoi
{
 	   boolean explain = true;

	   public void run()
        {	 int n =5;
	   	 System.out.println("The task is to move "+n+" disks from rod A to C using B as spare storage space ");
		 moveTowers(4,'A','B','C'); 
	   }
    
  	   public void moveTowers(int n, char A, char B, char C)
        {    if (n==1)
                System.out.println("Move a disk from rod "+ A +" to rod "+C);
             else
             {  
			if (explain) 
				System.out.println("subtask is to move "+n+" disks from rod A to B using C as spare storage space ");

			moveTowers(n-1, A, C, B);
                
			System.out.println("Move a disk from rod "+A+" to rod "+B);

			if (explain) 
				System.out.println("subtask is to move "+n+" disks from rod B to C using A as spare storage space ");

			moveTowers(n-1, B, A, C);
             }
        }

        public static void main(String[] args)
        { 		TowerOfHanoi objct = new TowerOfHanoi();
			objct.run();
        }
 }