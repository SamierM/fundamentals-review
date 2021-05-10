public class QuickSortArray implements SortingAlgos {

    public QuickSortArray() {
    }

    @Override
    public int[] sortAscending(int[] array, int l, int r) {
        if( l < r){
            int pivotIndex = partition(array, l, r-1);

            sortAscending(array, l, pivotIndex);
            sortAscending(array, pivotIndex+1, r);
        }

        return array;
    }

    private int partition(int[] arr, int l, int r) {
        if(l > r || r>= arr.length || l < 0) {
            return -1;
        }
        int pivotIndex = l - 1;
        int pivot = arr[r];

        for(int j = l; j <= r; j++) {

            //if the current element from the left is smaller than the pivot, swap
            if(arr[j] < pivot) {

                pivotIndex++;
                pivotSwap(arr, pivotIndex, j);

            }

        }
        pivotIndex++;
        pivotSwap(arr, pivotIndex, r);

        return pivotIndex;
    }

    private void pivotSwap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
