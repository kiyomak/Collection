/* Lesson3_Chapter5 コレクション　提出課題
①日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成する。*/

package practice;

import java.time.LocalDate;

public class Task {
	//プログラムを作成
	private LocalDate date;
	private String operation;
	
	//コンストラクタ
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
