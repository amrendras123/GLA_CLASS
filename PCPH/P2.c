#include<stdio.h>
int main() {

	int arr[]={4,3,2,1};
   int n=sizeof(arr);
   int i,j;
	for(i=0;i<n-1;i++){
		
		for(j=0;j<n-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}

		}
		
	}
	int k=0;
		for(k=0;k<n;k++){
			printf("%d ",arr[k]);
		}
	return 0;
}