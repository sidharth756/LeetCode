bool isPalindrome(int x) {
    int rem, copy;
    if(x < 0)
    {
        return 0;
    }
    long long rev = 0;
    copy = x;
    while (x != 0) {
        rem = x % 10;
        rev = (rev * 10) + rem;
        x = x / 10;
    }
    if (copy == rev) 
    {
        return 1;
    } 
    else
        return 0;
}