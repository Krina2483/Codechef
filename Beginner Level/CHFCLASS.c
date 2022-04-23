#include<stdio.h>
int main(){
    int i,n,t[100],r;
    scanf("%d\n",&n);
    for(i=0;i<n;i++){
        scanf("%d\n",&t[i]);
    }
    for(i=0;i<n;i++){
        r=t[i]/7;
        if(t[i]%7==6){
            printf("%d\n",r+1);
        }
        else{
            printf("%d\n",r);
        }
    }
    return 0;
}