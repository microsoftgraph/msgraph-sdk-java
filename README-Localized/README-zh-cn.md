\# 适用于 Java 的 Microsoft Graph SDK

[ ![下载](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


通过将 [Microsoft Graph API](https://graph.microsoft.io/en-us/getting-started) 集成到你的 Java 应用程序中，即可开始使用 Microsoft Graph SDK！

## 1.安装

### 1.1 通过 Gradle 安装

将存储库和 `microsoft-graph` 的一个编译依赖项添加到项目的 `build.gradle`：

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 通过 Maven 安装
在 pom.xml 中的 `dependencies` 中添加依赖项
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```

### 1.3 启用 ProGuard (Android)
根据 Graph API 的特点，该 SDK 需要非常大量的类来描述其功能。你需要确保为项目启用 [ProGuard](https://developer.android.com/studio/build/shrink-code.html)。否则，对于不需要与你的特定应用程序相关的功能，将导致生成时间很长。如果仍然达到 64K 方法限制，还可以启用 [multidexing](https://developer.android.com/studio/build/multidex.html)。

## 2.入门

### 2.1 注册应用程序

按照[向 Azure AD v2.0 终结点注册应用](https://developer.microsoft.com/zh-cn/graph/docs/concepts/auth_register_app_v2)中的步骤注册应用程序。

### 2.2 创建 IAuthenticationProvider 对象

**GraphServiceClient** 类的一个实例会处理生成请求，将这些请求发送到 Microsoft Graph API，并处理响应。若要创建此类的新实例，需要提供 `IAuthenticationProvider` 的实例，可用于对提供给 Microsoft Graph 的请求进行身份验证。

有关客户端应用程序中的身份验证示例，请参阅[适用于 Android 适配器的 MSGraph SDK Android MSA 身份验证](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter)。

### 2.3 获取 GraphServiceClient 对象
设置正确的应用程序 ID 和 URL 后，必须获取 **GraphServiceClient** 对象，以便针对服务发出请求。该 SDK 为你存储帐户信息，但当用户首次登录时，它会调用 UI 以获取用户的帐户信息。

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3.针对服务发出请求

拥有经过身份验证的 GraphServiceClient 后，即可开始针对服务执行调用。针对服务的请求看起来像我们的 [REST API](https://developer.microsoft.com/zh-cn/graph/docs/concepts/overview)。

### 3.1 获取用户的驱动器

检索用户的驱动器：

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

有关该 SDK 的设计方式的一般性概述，请参阅[概述](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)。

## 4.文档

有关更详细的文档，请参阅：

* [概述](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [扩展库](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [处理开放式类型，带 `null` 值的 PATCH 支持](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [集合](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [发出自定义请求](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [已知问题](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [参与](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5.问题

有关已知问题，请参阅[问题](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues)。

## 6.参与

Microsoft Graph SDK 项目欢迎开发者的积极参与。若要参与此项目，请参阅[参与](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)。

感谢所有投入时间改善此库的人士：

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

此项目遵循 [all-contributors](https://github.com/kentcdodds/all-contributors) 规范。欢迎任何形式的参与！

## 7.支持的 Java 版本
Java 7+ 和 [Android API 修订版 15](http://source.android.com/source/build-numbers.html) 及更高版本在运行时支持适用于 Java 的 Microsoft Graph SDK 库。

## 8.许可证

版权所有 (c) Microsoft Corporation。保留所有权利。根据 [MIT 许可证](LICENSE)获得许可。

## 9.第三方声明

[第三方声明](THIRD%20PARTY%20NOTICES)
