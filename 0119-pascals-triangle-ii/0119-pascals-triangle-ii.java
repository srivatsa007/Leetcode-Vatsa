class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        //int row = rowIndex;
        double ele=1;
        list.add((int)ele);
        for(int j=0;j<rowIndex;j++) //starts from index1, j0; index2, j1; 
        {
            ele= (ele*(rowIndex-j))/(j+1);
            list.add((int)ele);
        }
        return list;
    }
   
}
/* 
WITH ARRAYS
for(j=0; j<row; j++){
    arr[j+1]= (arr[j-1]*(row-1))/(j+1);
}
return arr;
DOESNT WORK!!!!!!!!!!!! Check code for array

*/