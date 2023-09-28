#include<stdio.h>
int main()
{
    printf("helloworld");
    for(int i=1;i<=20;i++){

        if(i%3==0&&i%5==0){
            printf("fizzBuzz");
        }else if(i%3==0){
            prinf("fizz");
        }else if(i%5==0){
            prinf("Buzz");
        }
    }

return 0;
}