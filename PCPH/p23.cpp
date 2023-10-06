
#include<iostream>
using namespace std;
int main() {

   int arr[]={12,13,2,4,5,6};
   int size=sizeof(arr)/sizeof(arr[0]);
//    printf("%d ",size);
   int n=sizeof(arr);
   int i=0;
	for(i=0;i<n-1;i++){
		int j=0;
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
		  cout<<arr[k]<<endl;
		}
	return 0;
}