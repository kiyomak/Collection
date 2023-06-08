/* Lesson3_Chapter5 コレクション　提出課題
①日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成する。
②以下のタスクを生成してリストに格納し、日付順に並び替えて表示すること。※使用するコレクションのクラスは自由
・2021年10月21日 牛乳を買う。
・2021年9月15日 ○○社面談。
・2021年12月4日 手帳を買う。
・2021年8月10日 散髪に行く。
・2021年11月9日 スクールの課題を解く。
[表示例]
2021-08-10:散髪に行く
2021-09-15:○○社面接
2021-10-21:牛乳を買う
2021-11-09:スクールの課題を解く
2021-12-04:手帳を買う  */

package practice;

import java.time.LocalDate;

public class Task {
	//プログラムを作成
	//メンバ変数作成
	//カプセル化！private！
	private LocalDate date;
	private String operation;
	
	//コンストラクタ
	//値を返すだけでよい
	public Task(LocalDate date,String operation) {
		this.date = date;
		this.operation = operation;
	}
	
	//日付の取得
	public LocalDate getDate() {
		return date;
	}
	
	//タスクの取得
	public String getTask() {
		return operation;
	}

}


/*
解答例：Comparableインタフェースを使う

package practice;

// Comparableインタフェースを実装する
public class Task implements Comparable<Task> {
  private LocalDate date;
  private String task;
  public Task(LocalDate date, String task){
    this.date = date;
    this.task = task;
  }

  public LocalDate getDate() {
    return date;
  }

  public String getTask() {
    return task;
  }

  // compareToメソッドをオーバーライドする
  // 日付で並び替えるため、LocalDateのcompareToを使う
  @Override
  public int compareTo(Task t){
    return date.compareTo(t.date);
  }
}


*/