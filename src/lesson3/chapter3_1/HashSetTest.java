package lesson3.chapter3_1;

import java.util.HashSet;
import java.util.Set;

class Name {
	private String first;
	private String last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}

}

public class HashSetTest {

	public static void main(String[] args) {
		Set<Name> s = new HashSet<>();
		s.add(new Name("abc", "123"));
		System.out.println(s.contains(new Name("abc", "123")));
	}

}
