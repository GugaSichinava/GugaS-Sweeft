
// If we allow sorting

import java.util.Arrays;

static int notContains(int[] array) {
    Arrays.sort(array);
    int result = 1;
    for (int i = 0; i < array.length; i++) {
        if (result == array[i]) {
            result++;
        }
    }
    return result;
}

// if we don't allow sorting

static int notContains(int[] array) {
    boolean contains = false;
        
    for (int i = 1; ; i++) {
        contains = false;
        for (int j = 0; j < array.length; j++){
            if (i == array[j]) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            return i;
        }
    }
}