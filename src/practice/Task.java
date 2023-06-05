/* Lesson3_Chapter5 コレクション　提出課題

①日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成する。
②以下のタスクを生成してリストに格納し、日付順に並び替えて表示すること。
※使用するコレクションのクラスは自由
・2021年10月21日 牛乳を買う。
・2021年9月15日 ○○社面談。
・2021年12月4日 手帳を買う。
・2021年8月10日 散髪に行く。
・2021年11月9日 スクールの課題を解く。
*/
package practice;

import java.time.LocalDate;

public class Task {
	//プログラムを作成
	//メンバ変数作成
	//カプセル化！private！
	private LocalDate date;
	private String task;
	
	//コンストラクタ
	//値を返すだけでよい
	public Task(LocalDate date,String task) {
		this.date = date;
		this.task = task;
	}
	
	

	
	
}
