#include<stdio.h>
int main(){
    
    int i,n,a[1000],b[1000];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("\n%d %d",&a[i],&b[i]);
    }
    for(i=0;i<n;i++){
        printf("\n%d",(a[i]/(2*b[i])));
    }
    return 0;
}