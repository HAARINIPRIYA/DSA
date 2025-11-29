int arrangeCoins(int n) {
    int row=0;
    while(row<n){
        row+=1;
        n=n-row;
    }
    return row;
}