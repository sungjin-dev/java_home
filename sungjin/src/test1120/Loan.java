package test1120;

public class Loan {
    private int loanId;
    private int memberId;
    private int bookId;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private LoanStatus status;
}


// 엔터티	회원·도서·대출의 관계
// FK	회원 및 도서 참조
// Enum	대출 상태 관리
// 제네릭	공통 CRUD 처리
// 인터페이스	서비스 책임 분리
// 컬렉션	대출 목록 관리
// SQL JOIN	대출 내역 조회
// 트랜잭션	대출 및 반납 처리의 원자성
// 예외 처리	중복 대출, 존재하지 않는 도서 등
// 권한 관리	일반 사용자와 관리자 구분