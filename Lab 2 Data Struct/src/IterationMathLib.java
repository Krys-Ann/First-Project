
public class IterationMathLib 
	extends MathLib{
		@Override

		//Part 1 Greatest Common Divisor
		int gcd(int x, int y) {
			int temp;
			while(y!=0) {
				if(x>=y && x!= 0) {
					temp = x;
					x=y;
					y=temp % y;
				}
			}
			return x;
		}

		@Override
		int ack(int x, int y) {
			int t, t2;
			while(x!=0) {
				if(y==0) {
					x-=1;
					y=1;
				}
				if(x!=0 && y!=0) {
					  t = x;
					  x -=1; 
					  t2=y;
					  y= ack(t, t2-1); 
				}
			}
			return y+=1;
		}

		@Override
		int fib(int x) {
			while(x!=0) {
				if(x==1) {
					return 1;
				}
				if(x>1) {
					return fib(x-1) + fib(x-2);
				}
			}
			return 0;
		}

		@Override
		int hanoi(int n) {
			while(n!=1) {
				if(n>1) {
					return 2*hanoi(n-1)+1;
				}
			}
			return 1;
			
		}

		
}
