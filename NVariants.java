

static int countVariants(int stairsCount) {
    if(stairsCount == 0) return 0;
    int[] array = {1, 2};
    int[] arr = {0};
    countVariantsRec(array, stairsCount, arr);
    return arr[0];
}


static void countVariantsRec(int[] array, int stairsCount, int[] arr) {
    if (stairsCount == 0) arr[0]++;

    for (int i = 0; i < 2; i++) {
        if (array[i] <= stairsCount){
            countVariantsRec(array, stairsCount - array[i], arr);
        }
    }
}