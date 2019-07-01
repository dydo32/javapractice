package ans.chap12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ch12_Exam07 {
	public static void main(String[] args) {
		
		Stream<Member> m_stream = Member.visits_list.stream();
		
		double avgvisit = m_stream.collect(Collectors
				.averagingInt(Member::getVisits));
		System.out.println("? „ì²? ë°©ë¬¸?•œ ?‚¬?Œ ?‰ê· íšŒ?ˆ˜:" + avgvisit);

		List<String> name = Member.visits_list.stream().map(m -> m.getName())
				.distinct().collect(Collectors.toList());
		System.out.println("?šŒ?›?˜ ?´ë¦? :" + name);

		Map<Type, Long> cnt = Member.visits_list.stream().collect(
				Collectors.groupingBy(Member::getType, Collectors.counting()));
		System.out.println("???…ë³? ?¸?›?ˆ˜:"+cnt);
	
	}
}

enum Type {
	CHILD, YOUTH, ADULT
}

class Member {
	private final String name;
	private final Type type;
	private final int Visits;

	public Member(String name, Type type, int Visits) {
		this.name = name;
		this.type = type;
		this.Visits = Visits;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int getVisits() {
		return Visits;
	}


	public static final List<Member> visits_list = Arrays.asList(new Member(
			"ë£¨ì˜¤", Type.CHILD, 10), new Member("ë£¨ì„¸", Type.CHILD, 20),
			new Member("ë°?ë¡?", Type.YOUTH, 5), new Member("?´ë¦¬ì˜¤", Type.YOUTH, 5),
			new Member("ë£¨ì¹˜?•„", Type.ADULT, 3), new Member("?š”?•œ", Type.ADULT, 7));
}
