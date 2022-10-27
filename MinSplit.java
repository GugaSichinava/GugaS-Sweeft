

static int minSplit(int amount) {
    
    int[] coins = {50, 20, 10, 5, 1};
    int length = coins.length;
    
    return minSplitRec(coins, length, amount);
}


static int minSplitRec(int[] coins, int length, int amount) {
    if (amount == 0) return 0;
    
    int result = Integer.MAX_VALUE;
        
    for (int i = 0; i < length; i++){
        if (coins[i] <= amount) {
            int remaining = minSplitRec(coins, length, amount - coins[i]);
            if (remaining != Integer.MAX_VALUE && 1 + remaining < result) {
                result = 1 + remaining;
            }
        }
    }

    return result;
}
