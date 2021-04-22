package exchangeprogram;

public class Constant {
											//프로그램 수정 시 효율성을 높이기 위해 final 변수를 사용한다.
	static final int EX_TYPE_QUIT = 0;		//0을 입력하면 프로그램 종료
	static final int EX_TYPE_USD = 1;		//1을 입력하면 미국 달러로 환전
	static final int EX_TYPE_EUR = 2;		//2를 입력하면 유로화로 환전
	static final int EX_TYPE_JPY = 3;		//3을 입력하면 일본 엔화로 환전
	static final double EX_USD = 1133.4;	//미국 달러 환율
	static final double EX_EUR = 1349.23;	//유로화 환율
	static final double EX_JPY = 1019.49;	//일본 엔화 환율
}
