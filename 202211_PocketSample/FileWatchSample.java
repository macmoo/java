package jp.wings.pocket;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileWatchSample {
	public static void main(String[] args) {

		// 監視するディレクトリ
		Path dir = Paths.get("C:/test/");

		// WatchServiceオブジェクトの生成
		try (WatchService watcher = FileSystems.getDefault().newWatchService()) {

			//  監視ディレクトリにWatchServiceオブジェクトを登録する
			WatchKey watchKey = dir.register(watcher,
					StandardWatchEventKinds.ENTRY_CREATE, // 作成
					StandardWatchEventKinds.ENTRY_DELETE, // 変更
					StandardWatchEventKinds.ENTRY_MODIFY, // 削除
					StandardWatchEventKinds.OVERFLOW		 // 特定不能
			);

			// WatchServiceオブジェクトが有効の間ループする
			while (watchKey.isValid()) {
				WatchKey key = null;
				try {
					key = watcher.take();	// 監視キーを取得する
				}
				catch (InterruptedException e) {
                    return;
				}
				// 取得したイベントの種類を表示する
				for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                     System.out.println(kind.name() );
                     // イベントが発生すると
                     // ENTRY_CREATE, ENTRY_DELETE,ENTRY_MODIFY,OVERFLOW
                     // のいずれかを表示する
                }
                key.reset(); // キーをリセットして監視を再開する
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
