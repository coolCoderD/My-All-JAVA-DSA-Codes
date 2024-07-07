#include<stdio.h>
#define n 100
int top=-1;
char s[n];

void push(char d){
    if(top==n-1) return ;
    else s[++top]=d;

}

char pop(){
    return s[top--];
}
// int parenthesis(char str[],char *e){
//     char ch=pop();
//     while(*e!='\0'){
//         if(*e=='(' || *e=='['||e=='{'){
//             push(*e);
//         }
//         else if(*e==')'|| *e==']'|| e=='}'){
//             if(top== -1) return 0;
//         }
//     }

// }

int main(){
    char str[8];
    scanf("%s",str);
    printf("%s  ",str);
    printf("\n%c",str[0]);

}