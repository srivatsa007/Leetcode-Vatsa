// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//     int r = numRows;

//         List<List<Integer>> pascal = new ArrayList<>();
//         List<Integer> row = new ArrayList<>();
//         List<Integer> row2 = new ArrayList<>();
//         if (r==1) {
//             row.add(1);
//             pascal.add(row);
//             return pascal;
//         }
//         else{
            
//             row.add(1);
//             //pascal = [[1], [1,1]]; 
//             pascal.add(row);
//             for (int i = 2; i <=r; i++) {
//                 for (int j = 1; j <= i; j++) 
//                 {// pascal = [1] + ([pascal[-1][j-1]] + pascal[-1][j]) + [1];
//                 //List<Integer> row = new ArrayList<>();
//                     row2.add(1);
//                     int ele= row.get(j-1)+ row.get(j);
//                     row2.add(ele);
//                     row2.add(1);
//                 }
//                 row=row2;
//                 pascal.add(row2);
//             }
//             return pascal;
//         }
        

//         }
        
//     }

 public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> resulti = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0){
                    resulti.add(1);
                }else if (j==i){
                    resulti.add(1);
                }else {
                    resulti.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(resulti);
        }
        return result;
    }
}


//python lists super easy
/* 
pascal = [1] + (pascal[-1][j-1]+ pascal[-1][j]) + [1]
*/

// using binomial 
    //     int r= numRows;
    //     int p=0;
    //     int ele=1;
    //     List<List<Integer>> outer= new ArrayList<List<Integer>>();
    //     List<Integer> inner = new ArrayList<Integer>();
    //     //inner.add(ele);
    //     for(int i=0 ; i<r; i++){
    //         inner.add(ele);
    //         for(int j=0; j<i; j++){
                
    //             ele = (ele*(r-j-1))/(j+1);
    //             inner.add(ele);
    //             System.out.println(inner);
    //         }
    //         outer.add(inner);
    //     }
    //     return outer;
    // }
