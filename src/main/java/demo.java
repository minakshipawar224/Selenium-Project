
public class demo {
	public static void main(String[] args) {
		int n=30;
int count=0;

for(int i=2; i<=n;i++){
if(n%i==0)
count++;
break;
}


if(count==1)
{
System.out.println("Not Prime number");
}

else {
System.out.println("Prime no");
}
	}
}

