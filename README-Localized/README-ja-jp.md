# Microsoft Graph SDK for Java

[ ![ダウンロード](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


[Microsoft Graph API](https://graph.microsoft.io/en-us/getting-started) を Java アプリケーションに統合して、Microsoft Graph SDK for Java の使用を開始しましょう!

## 1.インストール

### 1.1 Gradle 経由でインストールする

リポジトリと `microsoft-graph` のコンパイル依存関係をプロジェクトの `build.gradle` に追加します

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 Maven 経由でインストールする
依存関係を pom.xml
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```の `依存関係` に追加します

### 1.3 ProGuard を有効にする (Android)
Graph API の性質により、SDK はその機能を記述するために非常に多くのクラスのセットを必要とします。プロジェクトで [ProGuard](https://developer.android.com/studio/build/shrink-code.html) が有効になっていることを確認する必要があります。そうでない場合、特定のアプリケーションに関連する必要のない機能のビルド時間が長くなります。それでも 64K メソッドの制限に達している場合は、[Multidexing](https://developer.android.com/studio/build/multidex.html) を有効にすることもできます。

## 2.はじめに

### 2.1 アプリケーションを登録する

「[Azure AD v2.0 エンドポイントを使ってアプリを登録する](https://developer.microsoft.com/ja-jp/graph/docs/concepts/auth_register_app_v2)」の手順に従って、アプリケーションを登録します。

### 2.2 IAuthenticationProvider オブジェクトを作成する

**GraphServiceClient** クラスのインスタンスは、要求を作成し、Microsoft Graph API にそれらを送信し、応答を処理します。このクラスの新しいインスタンスを作成するには、Microsoft Graph への要求を認証できる、`IAuthenticationProvider` のインスタンスを提供する必要があります。

クライアント アプリケーションの認証例については、「[MSGraph SDK Android MSA Auth for Android Adapter](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter)」を参照してください。

### 2.3 GraphServiceClient オブジェクトを取得する
正しいアプリケーションID および URL を設定した後、サービスに対する要求を作成するために**GraphServiceClient** オブジェクトを取得する必要があります。SDK はアカウント情報を保存しますが、ユーザーが初めてログインすると、UI を呼び出してユーザーのアカウント情報を取得します。

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3.サービスに対する要求を作成する

認証された GraphServiceClient を取得したら、サービスに対する呼び出しを開始できます。サービスに対する要求は [REST API](https://developer.microsoft.com/ja-jp/graph/docs/concepts/overview) に類似しています。

### 3.1 ユーザーのドライブを取得する

ユーザーのドライブを取得するには:

```java
graphClient
  .me()
  .drive()
  .buildRequest()
  .get(new ICallback<Drive>() {
     @Override
     public void success(final Drive result) {
        System.out.println("Found Drive " + result.id);
     }
     ...
     // Handle failure case
  });
```

SDK の設計方法に関する一般的な概要については、「[概要](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)」を参照してください。

## 4.ドキュメント

詳細なドキュメントについては、次を参照してください。

* [概要](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [ライブラリの拡張](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [`Null` 値を含むオープン型 PATCH サポートの処理](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [コレクション](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [カスタム要求の作成](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [既知の問題](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [投稿](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5.問題

既知の問題については、「[問題](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues)」を参照してください。

## 6.投稿

Microsoft Graph SDK では、投稿を受け付けています。このプロジェクトに投稿するには、「[投稿](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)」を参照してください。

すでにライブラリの改善に時間を割いてくださったすべてのユーザーに感謝します。

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

このプロジェクトは、[ 共同作成者のすべての](https://github.com/kentcdodds/all-contributors)仕様に従っています。あらゆる種類の投稿を歓迎します。

## 7.サポートされている Java のバージョン
Microsoft Graph SDK for Java ライブラリは、Java 7+ および [Android API リビジョン 15](http://source.android.com/source/build-numbers.html) 以降のランタイムでサポートされます。

## 8.ライセンス

Copyright (c) Microsoft Corporation.All Rights Reserved.Licensed under the [MIT license](LICENSE).

## 9.サードパーティについての通知

[サードパーティについての通知](THIRD%20PARTY%20NOTICES)
