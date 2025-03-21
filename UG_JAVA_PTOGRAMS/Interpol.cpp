#include<iostream.h>
#include<conio.h>
void main()
{
	int a[10],i,j,n;
	cout<<"Enter n:";
	cin>>n;
	cout<<"Enter the Elements:\n";
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cout<<"Array:\n";
	for(i=0;i<n;i++)
	{
		cout<<a[i]<<" ";
	}
	int key;
	cout<<"Enter the Key:";
	cin>>key;
	int first=0;
	int last=n-1;
	int found;
	if (key<a[first] && k>a[last])
	{
		found=2;
		cout<<"Key Out of Range";
	}
	while(first<=last && found==0)
	{
		int mid=first+(last-first)*((key-a[first])/a[last]-a[first]));
		if(key==a[mid])
		{
			found=1;
			cout<<"Found at "<<mid<<" Position";
		}
		else if(key<a[mid])
		{
			last=mid-1;
		}
		else if(key>a[mid])
		{
			first=mid+1;
		}
	}
	if(found==0)
		cout<<"No Key Found";
}
		