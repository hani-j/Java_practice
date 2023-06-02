package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true) // 데이터 변경하는거에 꼭 있어야 한다. javax 보다 권장. 바뀌는 거엔 true
@RequiredArgsConstructor
public class MemberService {

    //@Autowired // 방법1 단점이 많다. 바꿔야할 때가 있는데 못바꿈
    private final MemberRepository memberRepository; // 변경할 경우 없어서 final 추천

//    방법2
//    @Autowired // 장점 : 몹 주입 가능 / 단점 :
//    public void setMemberRepository(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

//    @AllArgsConstructor // 방법3 만들어줌
//    @Autowired // 방법 3 생성자 주입, 생성자 하나일 경우 자동으로..
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    // 회원 가입
    @Transactional // 우선 적용. 기본 설정 false
    public Long join(Member member) {
        validateDuplicateMember(member); // 중복 회원 검증
        memberRepository.save(member);
        return member.getId(); // 항상 값이 있음. Id 는 자동으로 넣어줌?
    }

    // 동시에 들어올경우 문제 -> getName 을 유니크 제약조건?
    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    // 회원 전체 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    // 회원 단건 조회
    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }
}
