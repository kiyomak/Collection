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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		//プログラムを作成
		//インスタンス化
		Task task1 = new Task(LocalDate.of(2021,10,21), "牛乳を買う。");
		Task task2 = new Task(LocalDate.of(2021,9,15), "○○社面談。");	
		Task task3 = new Task(LocalDate.of(2021,12,4), "手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021,8,10), "散髪に行く");
		Task task5 = new Task(LocalDate.of(2021,11,9), "スクールの課題を解く。");
		//Taskクラスはprivate変数なので、getter使わないと出力できないので注意
		//System.out.println( task1.getDate() + ":" + task1.getTask() );	
		
		//リストにいれる
		List<Task> list = new ArrayList<Task>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);	
		list.add(task5);
		
		//確認用
		//for(Task e: list) {
		//	System.out.println( e.getDate() + ":" + e.getTask() );
		//}
		
		//順番を並び替える。⇒List.sort(Comparator)メソッド
		list.sort(Comparator.comparing(Task::getDate));
				
		//並び替えた順番を出力する
		for( Task asc: list ) {
			System.out.println( asc.getDate() + ":" + asc.getTask() );
		}

	}
}

/*
List.sort(Comparator)メソッド　：この形だと昇順で並び替え
Comparatorインターフェース：順序付けをする比較関数
.Comparing(Task::getDate)メソッド：Taskオブジェクトを日付で比較する。

[メンターさん評価ポイント]
・要件通りに機能できています。
・日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成できています。
・Comparatorを使ってソートすることができています。
・インデントが揃った、きれいなコードを書けています

*/

/*
解答例：TaskクラスでComparableインタフェースを使う

package practice;

public class Chapter5 {

  public static void main(String[] args) {
    List<Task> list = new ArrayList<>();
    list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
    list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
    list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
    list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
    list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

    // 並び替えを実行
    Collections.sort(list);

    for (Task2 t : list) {
      System.out.println(t.getDate() + ":" + t.getTask());
    }
  }

}

*/