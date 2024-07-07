#include<stdio.h>
#include<stdlib.h>
void towerOfHanoi(int n,char s,char h,char d){
    if(n==1){
        printf("\nTranfer disc %d from %c to %c",n,s,d);
        return;
    }
    towerOfHanoi(n-1,s,d,h);
    printf("\nTranfer disc %d from %c to %c",n,s,d);
    towerOfHanoi(n-1,h,s,d);
}
int main(){
    towerOfHanoi(3,'S','H','D');
}