import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class PythagoreanTriplet {
	private int a;
	private int b;
	private int c;
	public PythagoreanTriplet(int a, int b, int c) {
		this.a = Math.min(Math.min(a, b), c);
		this.b = Math.max(a, Math.min(b, c));
		this.c = Math.max(Math.max(a, b), c);
	}

	public int calculateSum() {
		return a + b + c;
	}
	public static PythagoreanTripletBuilder makeTripletsList() {
		return new PythagoreanTripletBuilder();
	}
	
	public static class PythagoreanTripletBuilder {
		private int from = 1;
		private int to;
		private int sum;
		public PythagoreanTripletBuilder thatSumTo(int sum) {
			this.sum = sum;
			return this;
		}
		public PythagoreanTripletBuilder withFactorsGreaterThanOrEqualTo(int from) {
			this.from = from;
			return this;
		}
		public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int to) {
			this.to = to;
			return this;
		}
		public List<PythagoreanTriplet> build() {
			List<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<PythagoreanTriplet>();
            Map<Integer, Integer> hm = new HashMap<>();
            for (int i = from; i <= to; i++) {
                hm.put(i*i,i);
            }
			for (int i = from; i <= to; i++) {
				for (int j = i+1; j <= to; j++) {
                    int l=i*i;
	                int m=j*j;
					if(hm.get(l+m)!=null && hm.get(l+m)>j){
                            if (i + j + hm.get(l+m) == sum) {
                                PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(i, j, hm.get(l+m));
                                pythagoreanTriplets.add(pythagoreanTriplet);
                                
                            }		
					
                        }
			}
			
		}
            return pythagoreanTriplets;
	}
    }
    @Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PythagoreanTriplet other = (PythagoreanTriplet) obj;
		
		return a == other.a && b == other.b && c == other.c;
	}
	@Override
	public String toString() {
		return "PythagoreanTriplet [a=" + a+ ", b=" + b + ", c=" + c + "]";
	}
}
