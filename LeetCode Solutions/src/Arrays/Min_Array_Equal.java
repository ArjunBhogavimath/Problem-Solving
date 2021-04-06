package Arrays;
// 1551. Minimum Operations to Make Array Equal

public class Min_Array_Equal {
public int minOperations(int n) {
        
        int solution = 0;
        
        int min =1;
        int max = (2*(n-1))+1;
        int equal_num = (min+max)/2;
        
        for(int i=0;i<n/2;i++){
            solution += equal_num - ((2*i)+1);
            
        }
        
        
        return solution;
    }
}

// AT first we need to take the equal number by formula
// i.e, equal number = (min+max)/2 
//we only need to traverse half of the array  to get the solution and each time 
// we substratct equal number by arr[i] upto half of the array


