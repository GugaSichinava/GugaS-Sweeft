

static boolean isPalindrome(String text){
    
    text = text.toLowerCase();
    
    int i = 0;
    int j = text.length() - 1;
    
    while (i < j) {
        if (text.charAt(i) != text.charAt(j)){
            return false;
        }
        
        i++;
        j--;
    }

    return true;
}