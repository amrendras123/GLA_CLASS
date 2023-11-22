#include<stdio.h>
int main()
{
    int a,i,p;
    for(a=3;a<=300;a++)
    {
        for(i=2;i<=a-1;i++)
        {
            if(a%i==0)
            continue;
            else
            break;
        }
        printf("\t %d",a);
    }
    return 0;
}
