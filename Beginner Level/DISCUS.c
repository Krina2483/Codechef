#include<stdio.h>
int main(){
    
    int i,n,a[100],b[100],c[100];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d %d %d",&a[i],&b[i],&c[i]);
    }
    for(i=0;i<n;i++){
        (a[i]>b[i])?(a[i]>c[i]?printf("\n%d",a[i]):printf("\n%d",c[i])):(b[i]>c[i]?printf("\n%d",b[i]):printf("\n%d",c[i]));
    }
    return 0;
}